package ru.mirea.task10.opt17;

public class task17 {
    public static int recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, recursion());
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion()); // вызов рекурсивной функции
    }
}