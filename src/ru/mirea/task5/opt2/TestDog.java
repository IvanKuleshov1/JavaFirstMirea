package ru.mirea.task5.opt2;

public class TestDog {
    public static void main(String[] args) {
        Dog gerShep = new Sheepdogs("Бобик№1","Немецкая овчарка", "Чёрно-коричневый", 32, 7, 8);
        gerShep.TellUsAboutThisDog();
        Dog chihuahua = new BagDogs("Бобик№2", "Чихуахуа", "Шоколадный", 4, 6);
        chihuahua.TellUsAboutThisDog();
    }
}
