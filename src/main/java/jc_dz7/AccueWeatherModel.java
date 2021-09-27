package jc_dz7;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AccueWeatherModel implements WeatherModel {

    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "YEpSFtMoWPZfFo06xHZDl7mpfsaWq6Es";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();


    //@Override
    public void getWeather(String selectedCity, Period period) throws IOException {
        switch (period) {
            case NOW:
                HttpUrl httpUrl1day = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request1day = new Request.Builder()
                        .url(httpUrl1day)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request1day).execute();
                String weatherResponse1day = oneDayForecastResponse.body().string();
                System.out.println(weatherResponse1day);

                break;

            case FIVE_DAYS:
                HttpUrl httpUrl5day = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request5day = new Request.Builder()
                        .url(httpUrl5day)
                        .build();
                Response fiveDayForecastResponse = okHttpClient.newCall(request5day).execute();
                String weatherResponse5day = fiveDayForecastResponse.body().string();
                System.out.println(weatherResponse5day);

                break;
        }
    }
    /*private String detectCityKey(String city) {
        return null;*/

    private String detectCityKey (String selectedCity) throws IOException {
                HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectedCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response locationResponse = okHttpClient.newCall(request).execute();
        String locationResponseString = locationResponse.body().string();
        //System.out.println(locationResponseString);

        String cityKey = objectMapper.readTree(locationResponseString).get(0).at("/Key").asText();
        return cityKey;
    }
}
