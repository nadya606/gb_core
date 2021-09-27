package jc_dz7;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        while (true) {
            System.out.println("Введите имя города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня;" +
                    "Введите 5 для прогноза на 5 дней");

            String command = scanner.nextLine();

            if (command.equals("0")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
