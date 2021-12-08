package ru.mirea.task10.opt15;

import java.util.Scanner;

public class task15 {
    public static int solution(int n){

        if(n < 10)
            return n;
        else{
            System.out.print(n % 10 + "\n");
            return solution(n / 10);
        }
    }

    public static void main(String[] args){
        System.out.println("Введите Ваше число N: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(solution(n));
    }
}