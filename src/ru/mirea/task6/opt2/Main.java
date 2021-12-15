package ru.mirea.task6.opt2;

public class Main {
    public static void main(String[] args) {
        Product bread = new Product("Хлеб", 45);
        Product water = new Product("Святой источник", 18);
        Product q = new Product("Пломбир", 20);
        Product w = new Product("Молоко", 48);
        Product e = new Product("Яблоки Голден", 120);
        Product r = new Product("Картофель", 26);
        System.out.println('\n'+"Цена продукта "+ bread.getName()+ " = " +bread.getPrice());
        System.out.println("Цена продукта "+ water.getName()+ " = " + water.getPrice());
        System.out.println("Цена продукта "+ q.getName()+ " = " + q.getPrice());
        System.out.println("Цена продукта "+ w.getName()+ " = " + w.getPrice());
        System.out.println("Цена продукта "+ e.getName()+ " = " + e.getPrice());
        System.out.println("Цена продукта "+ r.getName()+ " = " + r.getPrice());
    }
}
