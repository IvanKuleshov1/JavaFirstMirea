public class Sheepdogs extends Dog{
    private int skillPoints;
    private int intPoints;

    public Sheepdogs(String name, String dogBreed, String colour, int weight, int skillPoints, int intPoints) {
        super(name, dogBreed, colour, weight);
        this.skillPoints = skillPoints;
        this.intPoints = intPoints;
    }

    public void TellUsAboutThisDog(){
        System.out.println('\n'+"Имя собаки: " + super.getName()+
                ", Порода: " + super.getDogBreed() +
                ", Окрас: " + super.getColour() +
                ", Вес " + super.getWeight() +
                ", Уровень навыков: " + skillPoints + "/10" +
                ", Уровень интеллекта: " + intPoints + "/10"


                );
    }

}
