package ru.mirea.task2.opt5;

public class Dog {
    private int age;
    private String name;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int intoHumanAge(){
        return this.getAge() * 7;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age + "   В человеческих годах = "+ intoHumanAge()+
                ", name='" + name + '\'' +
                '}';
    }
}