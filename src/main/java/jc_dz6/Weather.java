package jc_dz6;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Weather {

    //URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/");

    public ResponseBody getWeather(String key) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addQueryParameter("apikey", String.format("key=%s", key))
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String body = response.body().string();
        System.out.println(body);
        System.out.println(response);

        /*System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(body);*/

        return response.body();

  }

}
