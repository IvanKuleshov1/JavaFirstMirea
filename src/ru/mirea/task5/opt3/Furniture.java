package ru.mirea.task5.opt3;

public abstract  class Furniture {
    private String name;
    private int cost;
    private String material;
    private int index;

    public Furniture() {
    }

    public Furniture(String name, int cost, String material, int index) {
        this.name = name;
        this.cost = cost;
        this.material = material;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public abstract void dispInfo();
}
