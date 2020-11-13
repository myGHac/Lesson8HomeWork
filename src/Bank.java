import java.util.Scanner;

   public class Bank {

       static void credit(double payment) {


       }

    public static void main (String[] args){

        System.out.println("Введите сумму платежа: ");
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        credit(payment);

    }

}
