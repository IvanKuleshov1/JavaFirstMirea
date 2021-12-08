package ru.mirea.task13.opt1;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args){
        ArrayList list;
        list=new ArrayList();
        System.out.println("ArrayList before:\n" );
        list.add("AnyWord");
        list.add(1100111001);
        for (Object o:list) {
            System.out.println(o);
        }

        System.out.println("\nArrayList after:\n");
        list.add(1,"AnotherOneWord");
        for (Object o:list) {
            System.out.println(o);
        }
        System.out.println("\nSize before: "+list.size());
        list.clear();
        System.out.println("CLEANING...");
        System.out.println("Size after: "+list.size());

    }
}