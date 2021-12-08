package ru.mirea.task10.opt2;

import java.util.Scanner;

public class task2 {
    public static String recursion(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) + "\n" + n;
    }
    public static void main(String[] args) {
        System.out.println("Введите Ваше число N: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursion(n)); // вызов рекурсивной функции
    }
}