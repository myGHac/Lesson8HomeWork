import java.util.Scanner;

public class Delivery {

    static void delivery(int client) {

        int counter = 1;
        //client = 6;
        int factorial = 1;

        factorial = factorial * counter;
        counter++;

        //delivery(client);

//         do {
//             factorial = factorial * counter;
//             counter++;
//
//         } while (counter <= client);
//
//         System.out.println("Возможных вариантов доставки : " + factorial);

//        for (int i = 1; i <= client; i++) {
//
//            factorial = factorial * counter;
//            counter++;
//
//           }
        System.out.println("Вариантов доставки " + factorial);
    }
        public static void main (String[] args){

            System.out.println("Введите число клиентов: ");
            Scanner sc = new Scanner(System.in);
            int client = sc.nextInt();

            delivery(client);

        }

}