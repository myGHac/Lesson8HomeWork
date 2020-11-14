import java.util.Scanner;

public class numReverse {

    static void calculate(int a) {
        int b = 0, tmp =0;
        while (a > 0) {

            b = a % 10;
            tmp = a / 10;
            a = tmp;

            System.out.print(b);
            b = 0; tmp = 0;
            calculate(a);
            break;
        }
    }
    public static void main (String[] args){

        System.out.println("Введите не простое число, которое не содержит 0: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        calculate(num);
    }
}
