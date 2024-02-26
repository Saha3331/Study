import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // task1();
        //task2();

        int deliveryDistance = 15;
        int deliveryTime = printDeliveryDistance(deliveryDistance);
        if (deliveryTime == -1) {
            System.out.println("Нет доставки");
        } else {
            System.out.println("потребуеться дней" + deliveryTime);
        }
    }

    private static int printDeliveryDistance(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            deliveryTime = -1;
        }else {
            if (deliveryDistance > 20 && deliveryDistance <=60) {
                deliveryTime++;
            }else if (deliveryDistance > 60){
                deliveryTime +=2;
            }
        }
        return deliveryTime;
    }

    private static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        recommendAppVersion(clientOS, clientDeviceYear);
    }

    private static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        if (clientOS != 1 && clientOS != 1 ) {
            System.out.println(" неизвестная сист");
        } else {
            String opertionSystem;
            if (clientOS ==0) {
                opertionSystem = "IOS";
            }else {
                opertionSystem = "Android";
            }
            String message;
            if (isDevaisOld(clientDeviceYear)){
                message = "Установить облегчённую версию приложения для "+ opertionSystem + "по ссылке";
            }else {
                message = "Установить версию прилоения для "+ opertionSystem +"по сыылке";
            }
            System.out.println(message);
        }
    }

    private static boolean isDevaisOld(int clientDeviceYear) {
        int currentYear =  LocalDate.now().getYear();
        return clientDeviceYear <= currentYear;
    }

    private static void task1() {
        printIsLeapYearResult(2021);
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