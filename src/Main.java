public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int moneyForMonth = 15000;
        int total = 0;
        int totalMonth = 0;

        while (total < 2_459_000) {
            total = total + moneyForMonth;
            totalMonth++;

        }
        System.out.println("Месяц " + totalMonth + ", сумма накоплений равна " + total + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int populationY = 12_000_000;
        int fertilityFor1000 = 17;
        int mortalityFor1000 = 8;
        int year = 0;

        while (year < 10) {
            year++;
            populationY = populationY + (populationY / 1000 * (fertilityFor1000 - mortalityFor1000));

            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int total = 15000;
        int totalMonth = 0;
        int percent = 7;

        while (total < 12_000_000) {
            total = total + (total / 100 * percent);
            totalMonth++;
            System.out.println("Месяц " + totalMonth + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int total = 15000;
        int totalMonth = 0;
        int percent = 7;

        while (total < 12_000_000) {
            total = total + (total / 100 * percent);
            totalMonth++;
            if (totalMonth % 6 == 0) {
                System.out.println("Месяц " + totalMonth + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int total = 15000;
        int totalMonth = 0;
        int percent = 7;
        int year = 0;

        while (year < 9) {

            total = total + (total / 100 * percent);
            totalMonth++;
            year = totalMonth / 12;
            if (totalMonth % 6 == 0) {
                System.out.println("Месяц " + totalMonth + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int friday = 2;
        int month = 31;

        for (int i = friday; i < month; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int year = 2022;
        int yearBefore = year - 200;
        int yearAfter = year + 100;

        for (int i = 0; i < yearAfter; i = i + 79) {
            if (i > yearBefore){
                System.out.println(i);
            }
        }
    }
}