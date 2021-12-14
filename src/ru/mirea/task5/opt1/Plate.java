class Plate extends Dish {
    private String foodType;
    public Plate(String name,String colour, String size, String foodType) {
        super(name, colour, size);
        this.foodType=foodType;
    }

    public void TellUsAboutThisDish(){

        System.out.println('\n'+"Название: " + super.getName()+ ", Цвет: " + super.getColour() + ", Размер: " + super.getSize() + ", Для какой еды: " + foodType);
    };

}