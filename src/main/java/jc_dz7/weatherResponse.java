package jc_dz7;

/*port com.fasterxml.jackson.databind.ObjectMapper;
import jc_dz6.Weather;

import static jc_dz7.AccueWeatherModel.objectMapper;

public class weatherResponse {
    @JsonProperty("selectedCity")
    private String CITY;
    @JsonProperty("DAILY")
    private String DATE;
    //@JsonProperty("")
    private String WEATHER_TEXT;
    //@JsonProperty("")
    private String TEMPERATURE;

    public weatherResponse(String CITY, String DATE, String WEATHER_TEXT, String TEMPERATURE) {
        this.CITY = CITY;
        this.DATE = DATE;
        this.WEATHER_TEXT = WEATHER_TEXT;
        this.TEMPERATURE = TEMPERATURE;

    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getWEATHER_TEXT() {
        return WEATHER_TEXT;
    }

    public void setWEATHER_TEXT(String WEATHER_TEXT) {
        this.WEATHER_TEXT = WEATHER_TEXT;
    }

    public String getTEMPERATURE() {
        return TEMPERATURE;
    }

    public void setTEMPERATURE(String TEMPERATURE) {
        this.TEMPERATURE = TEMPERATURE;
    }

    @Override
    public String toString() {
        return "В городе " + CITY + "на дату " + DATE + "ожидается" + WEATHER_TEXT + "температура" + WEATHER_TEXT;
    }

    ObjectMapper objectMapper = new ObjectMapper();
    weatherResponse weatherResponse = new weatherResponse(CITY, DATE, WEATHER_TEXT, TEMPERATURE);

    weatherResponse weatherResponse = objectMapper.readValue(weatherResponse, weatherResponse.class);
         System.out.println(weatherResponse);


}*/

