public abstract class Dog {
    private String name;
    private String dogBreed;
    private int weight;
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog(String name, String dogBreed, String colour,  int weight) {
        this.name = name;
        this.dogBreed = dogBreed;
        this.colour = colour;
        this.weight = weight;
    }
public abstract void TellUsAboutThisDog();



}

