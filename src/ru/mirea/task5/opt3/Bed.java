public class Bed extends Furniture{
    private int slprsNum;
    private String colour;

    public int getSlprsNum() {
        return slprsNum;
    }

    public void setSlprsNum(int slprsNum) {
        this.slprsNum = slprsNum;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



    public Bed(String name, int cost, String material, int index, int slprsNum, String colour) {
        super(name, cost, material, index);
        this.slprsNum = slprsNum;
        this.colour = colour;
    }

    public void dispInfo(){
        System.out.println(
                "Название: " + super.getName() +
                ", Цена: " + super.getCost() +
                ", Материал: " + super.getMaterial() +
                ", Индекс: " + super.getIndex() +
                        ", Количество спальных мест: " + slprsNum +
                        ", Цвет: " + colour
        );
    }
}
