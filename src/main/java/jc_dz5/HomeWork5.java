package jc_dz5;

public class HomeWork5 {
    /*1.	Реализовать сохранение данных в csv файл;
      2.	Реализовать загрузку данных из csv файла. Файл читается целиком.
      Структура csv файла: Строка заголовок с набором столбцов
      Набор строк с целочисленными значениями
      * Разделитель между столбцами - символ точка с запятой (;)*/
    public static void main(String[] args) {
        File file = new File();
        file.loadValue("report.csv");
        System.out.println(file);



    }

}
