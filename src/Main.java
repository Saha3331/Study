import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int deliveruDisnance = (int) 101f;
        boolean deliveruDisnanceMax = deliveruDisnance <= 100;
        PrintDeliveruDisnance(deliveruDisnanceMax, deliveruDisnance);


        System.out.println();
        int clientOS = 0;
        int clientDeviceYear = 2015;
        recommedAppVersion(clientOS, clientDeviceYear);

        System.out.println("1");


        printIsLeapYearResult(2020);
        printIsLeapYearResult(2021);
        printIsLeapYearResult(2022);
        printIsLeapYearResult(2023);
        printIsLeapYearResult(2024);
    }

    private static void PrintDeliveruDisnance(boolean deliveruDisnanceMax, int deliveruDisnance) {
        if (deliveruDisnanceMax) {
            if (deliveruDisnance <= 20) {
                System.out.println("Потребуются 1 сутки для доставки вашей банковской карты.");
            } else if (deliveruDisnance > 20 && deliveruDisnance <= 60) {
                System.out.println("Потребуются 2 суток для доставки вашей банковской карты.");
            } else if (deliveruDisnance > 60 && deliveruDisnance <= 100) {
                System.out.println("Потребуются 3 суток для доставки вашей банковской карты.");
            }
        } else {
            System.out.println("Доставки нет.");
        }
    }

    private static void recommedAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Error");
    }

    private static void printIsLeapYearResult(int year) {
        if (isLeap(year)) {
            System.out.println(year + "год являеться высокосным");
        } else {
            System.out.println(year + "Год не являеться высокосным");
        }
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
