public class Main {
    public static void main(String[] args) {
        int[] ints = generateRandomArray();
        int salary = 0;
        for (int anInt : ints) {
            salary = salary + anInt;
            System.out.println("Сумма трат за месяц составила " + salary + "зврплата");
        }
        int[] expenses = generateRandomArray();
        int totlExpenses = 0;
        int minExpenses = expenses[0];
        int maxExpenses = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            totlExpenses += expenses[i];
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
        }
        double result = (double) totlExpenses / expenses.length;
        System.out.println("«Средняя сумма трат за месяц составила " + result + " рублей");
        System.out.println("Сумма трат за месяц составила  " + totlExpenses + "рублей");
        System.out.println("Минемальная сума трат за день составила " + minExpenses + "Рублей");
        System.out.println("Максимальная сума трат за день составила" + maxExpenses + "Рублей");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
