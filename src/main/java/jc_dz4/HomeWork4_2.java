package jc_dz4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HomeWork4_2 {
    /*    2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.*/

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Smith", "11223344");
        phoneBook.add("White", "22334455");
        phoneBook.add("Brown", "33445566");
        phoneBook.add("Bond", "44556677");
        phoneBook.add("Miles", "55667788");
        phoneBook.add("Black", "66778899");
        phoneBook.add("Brown", "77889900");

        //System.out.println(phoneBook);

        phoneBook.info();

        System.out.println(phoneBook.get("Bond"));
    }

}
