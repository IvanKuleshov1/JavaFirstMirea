public class Chair extends Furniture{
    private int cmfrtPoints;

    public int getCmfrtPoints() {
        return cmfrtPoints;
    }

    public void setCmfrtPoints(int cmfrtPoints) {
        this.cmfrtPoints = cmfrtPoints;
    }

    public Chair(String name, int cost, String material, int index, int cmfrtPoints) {
        super(name, cost, material, index);
        this.cmfrtPoints = cmfrtPoints;
    }
    public void dispInfo(){
        System.out.println(
                "Название: " + super.getName() +
                        ", Цена: " + super.getCost() +
                        ", Материал: " + super.getMaterial() +
                        ", Индекс: " + super.getIndex() +
                        ", Уровень комфорта: " + cmfrtPoints + "/10"
        );
    }

}
