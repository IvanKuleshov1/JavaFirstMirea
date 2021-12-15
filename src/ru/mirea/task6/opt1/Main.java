package ru.mirea.task6.opt1;

public class Main {
    public static void main(String[] args) {
        Planets mercury = new Planets("Mercury");
        Planets venus = new Planets("Venus");
        Planets earth = new Planets("Earth");
        Planets mars = new Planets("Mars");
        Planets jupiter = new Planets("Jupiter");
        System.out.println('\n'+mercury.getName());
        System.out.println(venus.getName());
        System.out.println(earth.getName());
        System.out.println(mars.getName());
        System.out.println(jupiter.getName());
    }
}
