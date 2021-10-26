package jc_dz4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HomeWork4 {
    /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.*/


    public static void main(String[] args) {
        String[] food = {"fruit", "vegetable", "bread", "pasta", "cheese", "meat", "fruit", "soup", "salad", "cheese"};
        System.out.println(Arrays.toString(food));

        Set<String> unique = new HashSet(Arrays.asList(food));
        System.out.println("Уникальные слова:" + unique);

        System.out.println("Количество:");
        for (String word : unique) {
            System.out.println(word + ": " + Collections.frequency(Arrays.asList(food), word));
        }
    }

}
