public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");
        byte pyrmer = 100;
        System.out.println("Значение переменной pyrmer с типом byte равно " + pyrmer );
        short pyrmer2 = 10000;
        System.out.println("Значение переменной pyrmer2 с типом short равно " + pyrmer2 );
        int pyrmer3 = 100000;
        System.out.println("Значение переменной pyrmer3 с типом int равно " + pyrmer3 );
        long pyrmer4 = 1000000L;
        System.out.println("Значение переменной pyrmer4 с типом long равно " + pyrmer4 );
        float pyrmer5 = 1F;
        System.out.println("Значение переменной pyrmer5 с типом float равно " + pyrmer5 );
        double pyrmer6 = 10;
        System.out.println("Значение переменной pyrmer6 с типом double равно " + pyrmer6 );
        System.out.println("Задача 1 конец ");

        System.out.println("Задача 2");
        byte Q1 = 67;
        System.out.println(Q1);
        short Q2 = 27897;
        short Q7 = - 159;
        System.out.println( Q7 + " и " + Q2 );
        long Q3 = 987678965549L;
        System.out.println(Q3);
        double Q4 = 2.786;
        System.out.println(Q4);
        float Q5 = 27.12F;
        System.out.println(Q5);
        int Q6 = 569;
        System.out.println(Q6);
        System.out.println("Задача 2 конец ");

        System.out.println("Задача 3 ");
        var shet = 480;
        System.out.println(shet);
        var tacher = 23;
        System.out.println(tacher);
        var tacher2 = 27;
        System.out.println(tacher2);
        var tacher3 = 30;
        System.out.println(tacher3);
        var tacher4 = tacher2 + tacher3 + tacher;
        System.out.println(tacher4);
        var student = shet / tacher4;
        System.out.println("На каждого ученика расчитано " + student + " листов бумаги");
        System.out.println("Задача 3 конец ");




        System.out.println("Задача 4");
var bottle = 16;
var in20Minutes = bottle * 10;
        System.out.println("За 20 минут машина произвела " + in20Minutes + " штук");
var day = 24 * 60;
var day1 = day / 2;
var day2 = day1 * bottle;
        System.out.println("За сутки машина произвела " + day2 + " штук");
        var days3 = day2 * 3;
        System.out.println("За 3 дня машина произвела " + days3 + " штук");
        var month = day2 * 30;
        System.out.println("За 1 месяц  машина произвела " + month + " штук");
        System.out.println("Задача 4 конец ");


        System.out.println("Задача 5 ");
        var cans = 120;
        var white = 2;
                var brown = 4;
                var whiteBrown = white + brown;
                var classes = cans / whiteBrown;
                var whiteClasses = classes * white;
                var brownClasses = brown * classes;
        System.out.println("В школе , где " + classes + " классов , нужно " + whiteClasses + " банок белой краски и " + brownClasses + " банок коричневой краски ");
        System.out.println("Задача 5 конец");

        System.out.println("Задача 6 ");
        var bananas = 5;
        var milk = 200;
        var iceCreamSundae = 2;
        var egg = 4;
        var bannas5 = bananas * 80;
        var milk200 =  105 * 2;
        var ceCreamSundae2 = iceCreamSundae * 2;
        var egg4 = egg * 70;
        var mix = bannas5 + milk200 + ceCreamSundae2 + egg4;
        System.out.println("Количество грамм в завтраке " + mix );
        float mix1 =  mix / 1000F;
        System.out.println("Количество килограмм " + mix1 );
        System.out.println("задача 6 конец " );



        System.out.println("Задача 7" );
var weight = 7;
var racyon1 = 250;
var racyon = 500;
var weight1 = weight * 1000;
var days2 = weight1 / racyon;
var days = weight1 / racyon1;
        System.out.println("Количество дней " + days + " если будет 250 грамм ");
        System.out.println("Количество дней " + days2 + " если будет 500 грамм ");
        System.out.println("Задача 7 конец ");


        System.out.println("Задача 8 ");
        var Masha = 67760;
        var Denis = 83690;
        var Kristina = 76230;
        float percent = 0.1F;
        var Masha1 = Masha * percent * 12;
        var Masha2 = Masha1 + Masha;
        System.out.println("Маша теперь получает " + Masha2 + " рублей . Годовой доход вырос на " + Masha1);
var Denis1 = Denis * percent * 12;
var Denis2 = Denis1 + Denis;
        System.out.println("Денис теперь получает " + Denis2 + " рублей . Годовой доход вырос на " + Denis1);
        var Kristina1 = Kristina * percent * 12;
        var Kristina2 = Kristina1 + Kristina;
        System.out.println("Кристина теперь получает " + Kristina2 + " рублей . Годовой доход вырос на " + Kristina1);
        System.out.println("Задача 8 конец");
    }
}