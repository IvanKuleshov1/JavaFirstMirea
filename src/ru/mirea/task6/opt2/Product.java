package ru.mirea.task6.opt2;

public class Product implements Priceable{
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return cost;
    }
}
