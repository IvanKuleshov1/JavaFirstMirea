import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestDogOpt6 extends Dog{



    public TestDogOpt6() {
    }

    public static void main(String[] args) {
        TestDogOpt6 obj1 =new TestDogOpt6();
            obj1.addMoreDogs();
        }



    public void addMoreDogs() {

        List<Dog> dogie = new ArrayList<Dog>();
        while (true) {

            System.out.println("Введите имя собаки: ");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите возраст собаки: ");
            Scanner sc2 = new Scanner(System.in);
            dogie.add(new Dog(sc1.next(), sc2.nextInt()));
            System.out.println("Хотите добавить в массив еще одну собаку? (да или нет) ");
            Scanner sc3 = new Scanner(System.in);
            String next = sc3.next();
            if (next.equals("нет")) {
                break;
            }
        }
        for (int i = 0; i < dogie.size(); i++) {
            System.out.println(dogie.get(i));
            dogie.get(i).toString();
        }
    }
}

