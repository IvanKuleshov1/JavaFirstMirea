package ru.mirea.task13.opt3;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args){
        MyArrayList list;
        list=new MyArrayList();

        list.add("AnyWord");
        list.add(100111001);
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        System.out.println("Данные в хранилище в количестве:"+list.size());
        for( int i=0; i<=(list.size()-1); i++)
        System.out.println("Элементы из хранилища:"+list.get(i));

        list.remove(0);
        System.out.println("\nУдалим первый элемент\n");
        System.out.println("\nДанные в хранилище в количестве:"+list.size());
        for( int i=0; i<=(list.size()-1); i++)
            System.out.println("Элементы из хранилища:"+list.get(i));
    }
}