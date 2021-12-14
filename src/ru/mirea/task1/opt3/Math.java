package ru.mirea.task1.opt3;

public class Math {
    public Math() {
    }

    int[] myArray = new int[]{1, 2, 3};
        int sum = 0;
        public void For() {
            for (int i = 0; i < myArray[myArray.length - 1]; i++) {
                sum += myArray[i];
            }

            System.out.println(sum);
        }
    public void While(){
            int i = 0;
            while (i < myArray[myArray.length - 1]){
                sum += myArray[i];
                i++;
        }
        System.out.println(sum);

    }
    public void DoWhile(){
        int i = 0;
        do {
            sum += myArray[i];
            i++;
        }
                while (i < myArray[myArray.length - 1]);
        System.out.println(sum);
    }

}

