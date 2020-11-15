import java.util.Scanner;

public class SumOfNumber {


    static void sumOfNum(int a, int b) {

        if (a > 0) {
            b = b + (a % 10);
            a = a / 10;

            sumOfNum(a, b);
        }
        else System.out.print(b);;

    }
    public static void main (String[] args){

        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = 0;
        sumOfNum(num, b);
    }

}
