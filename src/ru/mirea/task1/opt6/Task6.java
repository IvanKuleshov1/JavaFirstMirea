package mirea.ru.task6;


import java.util.Random;

public class Task6 {

    public static void main(String[] args) {


        int a = new Random().nextInt((40 - 1) + 1) + 1;

        int[] arr = new int[a];
        System.out.println("Количество элементов получившегося массива = " + a);
        for (int i = 0; i<a; i++){
            arr[i]= (int)(Math.random()*((400-1)+1))+1;
            System.out.println("["+i+"] = "+arr[i]);
        }
        System.out.println('\n'+"Отсортированный массив: "+'\n');
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
                System.out.println("["+i+"] = "+arr[i]);
            }
        }
    }

}
