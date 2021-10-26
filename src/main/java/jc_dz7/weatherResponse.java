package jc_dz7;

   public class weatherResponse {
    private String city;
    private String localDate;
    private double temperature;

    public weatherResponse(String city, String localDate, double temperature) {
        this.city = city;
        this.localDate = localDate;
        this.temperature = temperature;
        }

    public String getCity() {

            return city;
        }

    public void setCity(String city) {

            this.city = city;
        }

    public String getLocalDate() {

            return localDate;
        }

    public void setLocalDate(String localDate) {

            this.localDate = localDate;
        }

    public double getTemperature() {

            return temperature;
        }

    public void setTemperature(double temperature) {

            this.temperature = temperature;
        }

@Override
public String toString() {
        return "Weather{" +
        "city='" + city + '\'' +
        ", localDate='" + localDate + '\'' +
        ", temperature=" + String.format("%.2f", temperature) +
        '}';
        }
}

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

