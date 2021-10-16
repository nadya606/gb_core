package jc_dz7;

public class HomeWork7 {
/*1.	Реализовать корректный вывод информации о текущей погоде. Создать класс WeatherResponse и десериализовать ответ сервера.
Выводить пользователю только текстовое описание погоды и температуру в градусах Цельсия.
2.	Реализовать корректный выход из программы
3.	Реализовать вывод погоды на следующие 5 дней в формате
В городе CITY на дату DATE ожидается WEATHER_TEXT, температура - TEMPERATURE*/

    //http://dataservice.accuweather.com/forecasts/v1/daily/5day/

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();

        userInterface.runInterface();
    }


}
