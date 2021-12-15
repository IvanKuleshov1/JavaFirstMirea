package ru.mirea.task5.opt2;

public class BagDogs extends Dog{
    private int btyPoints;

    public int getBtyPoints() {
        return btyPoints;
    }

    public void setBtyPoints(int btyPoints) {
        this.btyPoints = btyPoints;
    }

    public BagDogs(String name, String dogBreed, String colour, int weight, int btyPoints) {
        super(name, dogBreed, colour, weight);
        this.btyPoints = btyPoints;
    }
    public void TellUsAboutThisDog(){
        System.out.println('\n'+"Имя собаки: " + super.getName()+
                ", Порода: " + super.getDogBreed() +
                ", Окрас: " + super.getColour() +
                ", Вес " + super.getWeight() +

                ", Уровень привлекательности: " + btyPoints + "/10"


        );
    }
}
