package ru.mirea.task20.opt1;

import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalDate;

public class DateTest {
    public static void main (String[] args) {
        System.out.println("Вы вошли в историю своих заказов");
        System.out.println("Показать историю последних заказов?[1/0]");
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("Полученные данные:");

        if (a==1){
                LocalDate d1=LocalDate.of(2012,12,1);
                LocalTime t1=LocalTime.parse("08:00");
                System.out.println("Акция 'Apple' количество 1\n"+d1+"\n"+t1);

                LocalDate d2=LocalDate.of(2019,9,15);
                LocalTime t2=LocalTime.parse("16:42");
                System.out.println("Акция 'Samsung' количество 4\n"+d2+"\n"+t2);

                LocalDate d3=LocalDate.of(2020,5,1);
                LocalTime t3=LocalTime.parse("12:20");
                System.out.println("Акция 'MTS' количество 8\n"+d3+"\n"+t3);

                LocalDate d4=LocalDate.of(2021,2,15);
                LocalTime t4=LocalTime.parse("13:24");
                System.out.println("Акция 'BMW' количество 3\n"+d4+"\n"+t4);

                LocalDate d5=LocalDate.of(2021,4,8);
                LocalTime t5=LocalTime.parse("09:13");
                System.out.println("Акция 'Adidas' количество 7\n"+d5+"\n"+t5);

        }
    }
}