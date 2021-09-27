package jc_dz6;

import java.io.IOException;

public class HomeWork6 {
    /*1.	С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени, пересекающийся со следующим занятием
    (например, выборка погода на следующие 5 дней - подойдет)

    2.	Подобрать источник самостоятельно.
    Можно использовать api accuweather, порядок следующий: зарегистрироваться, зарегистрировать тестовое приложение для получения api ключа, найдите нужный endpoint и изучите документацию.
    Бесплатный тарифный план предполагает получение погоды не более чем на 5 дней вперед (этого достаточно для выполнения д/з).*/

    public static void main(String[] args) throws IOException {
        Weather weather = new Weather();
        System.out.println(weather.getWeather("YEpSFtMoWPZfFo06xHZDl7mpfsaWq6Es"));
    }

}
