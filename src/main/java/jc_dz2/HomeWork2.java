package jc_dz2;

public class HomeWork2 {
/* 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
*/
    public static void main(String[] args) {
    String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "3", "4", "1"}, {"3", "4", "1", "2"}, {"4", "3", "2", "1"}};

        try {
            int sum = findException(arr);
            System.out.println(sum);
        }
        catch (MyArraySizeException e) {
            System.out.println("Размер не соотвествует заданному массиву");
        }

        catch (MyArrayDataException e) {
            System.out.println("Некорректно указано значение массива");
            System.out.println("Ячейка с ошибкой: " + e.i + " " + e.j);
        }

    }

    public static int findException(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }

        for (int j = 0; j < arr[i].length; j++) {
            if (arr[j].length != 4) {
                throw new MyArraySizeException();
            }
             try {
                 total = total + Integer.parseInt(arr[i][j]);
             } catch (NumberFormatException e) {              // вот тут идея сама подсказала поставить такой catch
                 throw new MyArrayDataException(i, j);
             }
        }
        }
        return total;
    }
}




