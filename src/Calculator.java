import java.util.Scanner;

public class Calculator {

    public static class calculate {

        static void calculate(double num1, double num2, double num3) {

            double result;
            result =  div5(num1);
            System.out.println(" Результат : " + result);
            result =  div5(num2);
            System.out.println(" Результат : " + result);
            result =  div5(num3);
            System.out.println(" Результат : " + result);
           return;
        }
        static double div5(double number) {
            return number/5;
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



