import java.util.Scanner;

public class Calculator {

    public static class calculate {

         static void calculate(double num1, double num2, double num3) {

            double num;

             num = num1/5;
             System.out.println("Результат деления числа " + (String.format("%.0f", num1))  + " на 5 : " + num );

             num = num2/5;
             System.out.println("Результат деления числа " + (String.format("%.0f", num2)) + " на 5 : " + num );

             num = num3/5;
             System.out.println("Результат деления числа " + (String.format("%.0f", num3)) + " на 5 : " + num );

            return;
        }

        public static void main(String[] args) {

            System.out.println("Введите число: ");
            Scanner sc = new Scanner(System.in);
            double num1 = sc.nextDouble();

            System.out.println("Введите число: ");
            sc = new Scanner(System.in);
            double num2 = sc.nextDouble();

            System.out.println("Введите число:  ");
            sc = new Scanner(System.in);
            double num3 = sc.nextDouble();

            calculate(num1, num2, num3);

        }

    }


}
