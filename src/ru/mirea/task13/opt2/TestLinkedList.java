package ru.mirea.task13.opt2;

import java.util.LinkedList;

public class TestLinkedList {
    String name;

    public TestLinkedList(String model) {
        this.name = model;
    }
    public static void main(String[] args){
        LinkedList<TestLinkedList> objs = new LinkedList<>();
        TestLinkedList mr1 = new TestLinkedList("HARVEY KEITEL");
        TestLinkedList mr2 = new TestLinkedList("TIM ROTH");
        TestLinkedList mr3 = new TestLinkedList("MICHAEL MADSEN");
        TestLinkedList mr4 = new TestLinkedList("STEVE BUSCEMI");
        TestLinkedList mr5 = new TestLinkedList("LAWRENCE TIERNEY");

        objs.add(mr1);
        objs.add(mr2);
        objs.add(mr3);
        System.out.println(objs);

        objs.addFirst(mr4);
        objs.addLast(mr5);
        System.out.println(objs);
    }

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                '}';
    }
}