import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] nomber = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(nomber));
        double[] nomber1 = new double[]{1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(nomber1));
        System.out.println("Задача 1 конец");
        System.out.println("Задача 2");
        int[] nomber3 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(nomber));
        double[] nomber2 = new double[]{1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(nomber1));
        System.out.println("Задача 2 конец");
        System.out.println("Задача 3");
        int[] nomber4 = new int[]{1, 2, 3};
        for (int i = nomber4.length - 1; i >= 0; i--) {
            System.out.print(nomber4[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        int[] nomber5 = new int[]{1, 2, 3};
        for (int a = 0; a < nomber5.length; a++) {
            if (nomber5[a] % 2 != 0) {
                nomber5[a] = nomber5[a] + 1;
            }
        }
                System.out.println(Arrays.toString(nomber5));

            }
        }




