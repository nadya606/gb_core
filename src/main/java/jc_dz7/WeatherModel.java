package jc_dz7;

import jc_dz6.Weather;

import java.io.IOException;
import java.util.List;

public interface WeatherModel  {
        void getWeather(String selectedCity, Period period) throws IOException;
    //boolean saveWeather(weatherResponse weatherresponse);
    //weatherResponse getSavedToDBWeather();

    List<weatherResponse> getSavedToDBWeather();
}


