import java.util.Scanner;

   public class Bank {

       static void pay(int sum, int credit) {
           if (sum == credit) {
               System.out.println("Кредит погашен ");
           } else if (sum > credit) {
               int result = sum - credit;
               System.out.println("Кредит погашен. Ваша сдача - " + result);
           } else if (sum < credit) {
               int result = credit - sum;
               System.out.println("Кредит не погашен. Доплатите - " + result);

               System.out.println("Введите сумму платежа: ");
               Scanner sc = new Scanner(System.in);
               int payment = sc.nextInt();
               pay(payment, result);
           }
       }

    public static void main (String[] args){

        System.out.println("Введите сумму платежа: ");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();

        System.out.println("Введите сумму кредита: ");
        sc = new Scanner(System.in);
        int credit = sc.nextInt();

        pay(payment, credit);

    }

}
