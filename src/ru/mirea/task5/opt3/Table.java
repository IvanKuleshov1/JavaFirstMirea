package ru.mirea.task5.opt3;

public class Table extends Furniture{
    private int legNum;
    private int sizePoints;

    public Table(String name, int cost, String material, int index, int legNum, int sizePoints) {
        super(name, cost, material, index);
        this.legNum = legNum;
        this.sizePoints = sizePoints;
    }
    public void dispInfo(){
        System.out.println(
                "Название: " + super.getName() +
                        ", Цена: " + super.getCost() +
                        ", Материал: " + super.getMaterial() +
                        ", Индекс: " + super.getIndex() +
                        ", Количество ножек: " + legNum +
                        ", Относительный размер: " + sizePoints + "/10"
        );
    }
}
