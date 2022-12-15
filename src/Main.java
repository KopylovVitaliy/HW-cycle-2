public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}