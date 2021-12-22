package ru.mirea.task5.opt3;


import java.util.Scanner;
public class FurnitureShop {
    public static void main(String[] args) {
        Furniture bedBig = new Bed("Королевская кровать", 320, "Дерево и сталь", 456356256, 2, "Белый");
        bedBig.dispInfo();
        Furniture chairGood = new Chair("Пластмассовый стул", 7, "Пластик", 29834729, 5 );
        chairGood.dispInfo();
        Furniture cupboardOk = new Cupboard("Шкаф спальный", 280, "Дерево", 23454385, 7);
        cupboardOk.dispInfo();
        Furniture tableFine = new Table("Обеденный стол", 617, "Дерево, сталь, поверхность-стеклянная", 25483590, 4, 8);
        tableFine.dispInfo();
        System.out.println("Если вас что-нибудь заинтересовало, вы можете найти товар по названию или по индексу");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        int str2 = sc1.nextInt();
        //System.out.println(str1);
        if (bedBig.getName().equals(str1) || bedBig.getIndex()==str2) {
            System.out.println("Спасибо за покупку!");
            System.out.println(str1);
            //bedBig.dispInfo();



        }
    }
}
