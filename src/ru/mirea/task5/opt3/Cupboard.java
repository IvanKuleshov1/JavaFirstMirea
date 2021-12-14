public class Cupboard extends Furniture{
    private int hldngPoints;

    public Cupboard(String name, int cost, String material, int index, int hldngPoints) {
        super(name, cost, material, index);
        this.hldngPoints = hldngPoints;
    }
    public void dispInfo(){
        System.out.println(
                "Название: " + super.getName() +
                        ", Цена: " + super.getCost() +
                        ", Материал: " + super.getMaterial() +
                        ", Индекс: " + super.getIndex() +
                        ", Уровень вместимости: " + hldngPoints + "/10"
        );
    }
}
