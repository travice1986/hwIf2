import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int clientOS = (int) (Math.random() * 2);
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Task 2
        int clientDeviceYear = (int) (2000 + Math.random() * 24);
        int clientOs = (int) (Math.random() * 2);
        Scanner consoleOne = new Scanner(System.in);
        int one = consoleOne.nextInt();
    }
}