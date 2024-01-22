public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1 ");
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Задача 1 конец");


            System.out.println("Задача 2 ");
            int clientOS = 0;
            int clientDeviceYear = 2015;
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else
                System.out.println("Error");
            System.out.println("Задача 2 конец ");

            System.out.println("Задача 3 ");
            int year = 2020;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + "год являеться высокосным");
            } else {
                System.out.println(year + "Год не являеться высокосным");
            }
            System.out.println("Задача 3 конец ");


            System.out.println("Задача 4 ");
            int deliveruDisnance = (int) 101f;
            boolean deliveruDisnanceMax = deliveruDisnance <= 100;
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
            System.out.println("Задача 4 конец");
            System.out.println("Задача 5");
            int dayOfWeekNumber = 1;
            switch (dayOfWeekNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Значение не известно, проверьте корректность вводимы Вами данных; на Змеле год поделен лишь на 12 месяцев.");
                    System.out.println("Значение не известно, проверьте корректность вводимых Вами данных. На Змеле год поделен лишь на 12 месяцев.");
            }
        }
    }
}



