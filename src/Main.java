public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int ege = 17;
        System.out.println("Если возраст " + ege);
        if (ege >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("--Задача 1 конец--");

        System.out.println("Задача 2");
        int temperature = 4;
        System.out.println("На улице " + temperature + " градусов");
        if (temperature >= 5) {
            System.out.println("можно идти без шапки");
        } else {
            System.out.println("нужно надеть шапку");
        }
        System.out.println("--Задача 2 конец--");

        System.out.println("Задача 3");
        int speed = 77;
        System.out.println("Если скорость " + speed + " то");
        if (speed >= 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        System.out.println("--Задача 3 конец--");
        System.out.println("Задача 4 ");
        int age = 29;
        System.out.println("Если возраст человека равен " + age);
        if (age >= 2 && age <= 6) {
            System.out.print("вам нужно ходить в детский сад");
        } else {
            if (age >= 7 && age <= 17)
                System.out.println("то ему нужно ходить в школу");
            if (age >= 18 && age <= 24)
                System.out.println("то его место в университете.");
            if (age > 24)
                System.out.println("то ему пора ходить на работу.");
            System.out.println("--Задача 4 конец--");
        }
        System.out.println("Задача 5");
        int child = 11;
        System.out.println(" Если возраст ребенка равен " + child);
        if (child < 5) {
            System.out.print(" то он не может кататься на аттракционе.");
        } else {
            if (child > 5 && child < 14)
                System.out.println("то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            if (child >= 14)
                System.out.println("о он может кататься без сопровождения взрослого.");
            System.out.println("--Задача 5 конец--");
        }
        System.out.println("Задача 6");
        int max = 102;
        int sitPlaces = 60;
        int stand = max - sitPlaces;
        System.out.println("Сколько людей по вашим подсчетам на данный момент в вагоне?: ");
        int available;
        int peopleNow = 10;
        if (peopleNow > max) {
            System.out.println("Нет мест");
        } else if (peopleNow == max) {
            System.out.println("Вагон полон");
        } else if (peopleNow < max && peopleNow >= sitPlaces) {
            available = max - peopleNow;
            System.out.println("Свободных сидячих мест нет. " + available + " мест доступно для продолжения пути стоя");
        } else if (peopleNow < sitPlaces) {
            available = sitPlaces - peopleNow;
            System.out.println("Доступно " + available + " сидений и " + stand + " мест для продолжения пути стоя");
        }
        System.out.println("--Задача 6 конец--");
        System.out.println("Задача 7");
        int one = 10;
        int two = 18;
        int three = 44;
        if (one > two && one > three) {
            System.out.println("наибольшее число" + one);
        } else if (two > one && two > three) {
            System.out.println("наибольшее число" + two);
        } else if (three > one && three > two) {
            System.out.println("наибольшие число" + three);
        }
    }
}