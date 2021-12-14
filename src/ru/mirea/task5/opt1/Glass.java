public class Glass extends Dish {
    private String material;
    private String volume;
    private boolean handle;

    public Glass(String name, String colour, String size, String material, String volume, boolean handle) {
        super(name, colour, size);
        this.material=material;
        this.volume=volume;
        this.handle=handle;
    }
    public void TellUsAboutThisDish(){

        System.out.println('\n'+"Название: " + super.getName()+", Цвет: " + super.getColour() + ", Размер: " + super.getSize() + ", Какой материал: " + material + ", Объем: " + volume + ", Наличие ручки: " + handle);
    };
}
