import java.util.Random;

public class Main {

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int[] array = generateRandomArray();

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int spendingPerMonth = 0;
        for (int j : array) {

            spendingPerMonth += j;

        }

        System.out.println("Сумма трат за месяц составила " + spendingPerMonth + " рублей.");

        System.out.println("Задача 2");
        int maxSpendingPerDay = -1;
        int minSpendingPerDay = 200_000;
        for (int j : array) {
            if (j > maxSpendingPerDay) {
                maxSpendingPerDay = j;
            }
            if (j < minSpendingPerDay) {
                minSpendingPerDay = j;
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendingPerDay + " рублей. Максимальная сумма трат за день составила " + maxSpendingPerDay + " рублей.");

        System.out.println("Задача 3");
        float averageSpendingPerMonth;
        float amountOfDays = array.length;
        averageSpendingPerMonth = spendingPerMonth / amountOfDays;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpendingPerMonth + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }

}