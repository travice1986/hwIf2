import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int clientOS = (int) (Math.random() * 2);
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Task 2
        System.out.println("Task 2");
        int clientDeviceYear = (int) (2000 + Math.random() * 24);
        int clientOs = (int) (Math.random() * 2);
        switch (clientOs) {
            case 0:
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                else
                    System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                else
                    System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        // Task 3
        Scanner consoleYear = new Scanner(System.in);
        System.out.println("Task 3");
        System.out.print("Год: ");
        int year = consoleYear.nextInt();
        if (year > 1584)
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
                System.out.println("Год является високосным");
            else System.out.println("Год не является високосным");
        else System.out.println("Год введён не корректно");

        // Task 4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) System.out.println("Потребуется 1 день");
        else if (deliveryDistance < 60) System.out.println("Потребуется 2 дня");
        else if (deliveryDistance < 100) System.out.println("Потребуется 3 дня");
        else System.out.println("Доставка не может быть осуществлена");
        System.out.print("Желаете скоректировать расстояние? ");
        Scanner consoleContinuation = new Scanner(System.in);
        String continuation = consoleContinuation.next();
        if (Objects.equals(continuation, "да")){
            Scanner consDeliveryDist = new Scanner(System.in);
            System.out.print("Distance ");
            int deliveryDist = consDeliveryDist.nextInt();
            if (deliveryDist < 20) System.out.println("Потребуется 1 день");
            else if (deliveryDist < 60) System.out.println("Потребуется 2 дня");
            else if (deliveryDist < 100) System.out.println("Потребуется 3 дня");
            else System.out.println("Доставка не может быть осуществлена");
        }

        // Task 5
        System.out.println("Task 5");
        System.out.print("Номер месяца: ");
        Scanner consoleMonth = new Scanner(System.in);
        int monthNumber = consoleMonth.nextInt();
        if (monthNumber > 0 && monthNumber < 13){
            switch (monthNumber){
                case 1: System.out.println("Январь");
                break;
                case 2: System.out.println("Февраль");
                break;
                case 3: System.out.println("Март");
                break;
                case 4: System.out.println("Апрель");
                break;
                case 5: System.out.println("Май");
                break;
                case 6: System.out.println("Июнь");
                break;
                case 7: System.out.println("Июль");
                break;
                case 8: System.out.println("Август");
                break;
                case 9: System.out.println("Сентябрь");
                break;
                case 10: System.out.println("Октябрь");
                break;
                case 11: System.out.println("Ноябрь");
                break;
                case 12: System.out.println("Декабрь");
                break;
            }
        }
        else System.out.println("Не корректно введен номер месяца");


    }
}