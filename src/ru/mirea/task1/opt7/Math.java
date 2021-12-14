import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int factorial=1;

        for (int i = 1; i<=a; i++){
            factorial*=i;
            //System.out.println(factorial);
        }
        System.out.println(factorial);

    }
}
