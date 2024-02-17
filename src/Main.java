public class Main {
    public static void main(String[] args) {
        System.out.println("8");
        int year = 2024;
        int firstTimePeriod = year - 200;
        int secondTimePeriod = year + 100;
        int nollePeriod = 0;
        int rate = 79;
        while (nollePeriod < secondTimePeriod) {
            if (nollePeriod > firstTimePeriod) {
                System.out.println(nollePeriod);
            }
            nollePeriod += rate;
        }
    }
}