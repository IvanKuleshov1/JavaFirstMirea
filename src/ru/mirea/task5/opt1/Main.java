public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate ("Тарелка","Черный", "стандартный", "пельмени");
        plate.TellUsAboutThisDish();
        Glass cup = new Glass("Кружка","Белый", "маленький","керамика","маленький",true);
        cup.TellUsAboutThisDish();
        Tableware fork = new Tableware("Вилка", "серебрянный", "маленький","макароны");
        fork.TellUsAboutThisDish();
    }
}
