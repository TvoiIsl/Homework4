public class Main {
    public static void main(String[] args) {
        byte a = 120;
        short b = 3000;
        int c = 123456;
        long d = 500L;
        float e = 500f;
        double f = 700.5;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);// Задача 1

        byte a1 = 2;
        short b1 = 549;
        int c1 = 27897;
        long d1 = 987678965549L;
        float e1 = 786f;
        double f1 = 27.12;
        char g1 = 67;
        boolean h1 = -159 >= c1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);
        System.out.println(h1);//Задача 2

        byte studentLP = 23;
        byte studentAS = 27;
        byte studentEA = 30;
        int totalStudents = studentLP + studentAS + studentEA;
        int totalSheets = 480;
        int solution = 480/totalStudents;
        System.out.println("На каждого ученика рассчитано " + solution + " листов бумаги");//Задача 3

        byte productivityIn2Minutes = 16;
        int quantityPerMinute = productivityIn2Minutes/2;
        int productivityIn20Minutes = quantityPerMinute*20;
        int productivityPerDay = quantityPerMinute*1440;
        int productivityIn3Days = productivityPerDay*3;
        int productivityPerMonth = productivityIn3Days*10;
        System.out.println("За 20 минут машина произвела бутылок " + productivityIn20Minutes + " штук ");
        System.out.println("За сутки машина произвела бутылок " + productivityPerDay + " штук ");
        System.out.println("За 3 сутки машина произвела бутылок " + productivityIn3Days + " штук ");
        System.out.println("За месяц машина произвела бутылок " + productivityPerMonth + " штук ");//Задача 4

        byte cansFor1Class = 2+4;
        int totalClasses = 120/cansFor1Class;
        int cansOfBrown = totalClasses*4;
        int cansOfWhite = totalClasses*2;
        System.out.println("В школе, где " +totalClasses+ " классов, нужно " +cansOfWhite+ " банок белой краски и " +cansOfBrown+ " банок коричневой краски");//Задача 5

        int bananas = 80*5;
        int milk = 105*2;
        int cream = 100*2;
        int eggs = 70*4;
        int breakfastWeight = bananas+milk+cream+eggs;
        float breakfastWeightInKg = breakfastWeight/1000f;
        System.out.println("Вес завтрака " +breakfastWeight+ " грамм ");
        System.out.println("Вес завтрака " +breakfastWeightInKg+ " кг ");//Задача 6

        int shedWeight = 7*1000;
        int daysOf250Grams = shedWeight/250;
        int daysOf500Grams = shedWeight/500;
        int onAverageDays = (daysOf250Grams+daysOf500Grams)/2;
        System.out.println("Потребуется "+daysOf250Grams+" дней, если спортсмен будет сбрасывать по 250 грамм");
        System.out.println("Потребуется "+daysOf500Grams+" дней, если спортсмен будет сбрасывать по 500 грамм");
        System.out.println("В среднем для похудения потребуется "+onAverageDays+" день");//Задача 7

        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        double zpMashaMore = zpMasha*1.1;
        double zpDenisMore = zpDenis*1.1;
        double zpKristinaMore = zpKristina*1.1;
        double mashaIncomeWas = zpMasha*12;
        double denisIncomeWas = zpDenis*12;
        double kristinaIncomeWas = zpKristina*12;
        double mashaIncomeWill = zpMashaMore*12;
        double denisIncomeWill = zpDenisMore*12;
        double kristinaIncomeWill = zpKristinaMore*12;
        double differenceMasha = mashaIncomeWill - mashaIncomeWas;
        double differenceDenis = denisIncomeWill - denisIncomeWas;
        double differenceKristina = kristinaIncomeWill - kristinaIncomeWas;
        System.out.println("Маша теперь получает " +zpMashaMore+ " рублей. Годовой доход вырос на " +differenceMasha+ " рублей");
        System.out.println("Денис теперь получает " +zpDenisMore+ " рублей. Годовой доход вырос на " +differenceDenis+ " рублей");
        System.out.println("Кристина теперь получает " +zpKristinaMore+ " рублей. Годовой доход вырос на " +differenceKristina+ " рублей");//Задача 8
    }
}