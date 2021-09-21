package jc_dz3;

import com.sun.deploy.net.MessageHeader;

import java.util.Arrays;

public class HomeWork3 {

    //1.	Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        change(arr,2,5);
    }

    private static void change(int[] arr, int i, int i1) {
        System.out.println("Массив: "+ Arrays.toString(arr));
        Object ch = arr[i];
        arr[i]=arr[i1];
        arr[i1]= (int) ch;
        System.out.println("Массив с измененными элементами: "+Arrays.toString(arr));
    }
}
