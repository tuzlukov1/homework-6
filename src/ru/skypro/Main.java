package ru.skypro;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    int[] arr = generateRandomArray();

    public static void main(String[] args) {
        System.out.println("Задание №1");
        int monthSalaryAmount = 0;
        int[] monthSalaryArray = generateRandomArray();
        for (int i = 0; i < monthSalaryArray.length; i++) {
            monthSalaryAmount += monthSalaryArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + monthSalaryAmount + " рублей.");
        System.out.println("_____");

        System.out.println("Задание №2");

        int maxSalary = 0;
        int minSalary = monthSalaryArray[0];

        for (int i = 0; i < monthSalaryArray.length; i++) {
            if (monthSalaryArray[i] < minSalary) {
                minSalary = monthSalaryArray[i];
            }

            if (monthSalaryArray[i] > maxSalary) {
                maxSalary = monthSalaryArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей");
        System.out.println("_____");

        System.out.println("Задание №3");

        double averageSalary;
        averageSalary = (double) monthSalaryAmount / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSalary + " рублей");
        System.out.println("_____");

        System.out.println("Задание №4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[(reverseFullName.length - 1) - i]);
        }
        System.out.println("\n_____");

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
