package ru.mirea.task6.opt1;

public class Planets implements Nameable {
    private String name;

    public Planets(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
