import java.util.Scanner;

public class FoorLoo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Pin = 1212;
        double balance = 100.00;
        int i = 0;
        int a = 0;

        while (i < 3) {
            System.out.println("Enter your pin code");
            int pin_code = sc.nextInt();

            if (pin_code == Pin) {
                System.out.println("Pin code entered succesfully");

                while (a < 3) {
                    System.out.println("Enter amount to withdraw");
                    double amount = sc.nextDouble();

                    if (amount < balance) {
                        System.out.println("Transaction successfully");
                        break;
                    } else {
                        System.out.println("Insufficient balance try again");
                    }
                    a++;
                }
                break;
            } else {
                System.out.println("You need to request to reset your pin.");
            }
            i++;
        }

    }
}
