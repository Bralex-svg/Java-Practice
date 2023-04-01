import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // GUESS NUMBER GAME USING WHILE LOOP
        Scanner sc = new Scanner(System.in);

        int guess;
        int number = 10;
        int count = 0;

        System.out.println("Enter a number");
        guess = sc.nextInt();
        while (count < 3) {
            if (number == guess) {
                System.out.println("you won");

            } else if (number != guess) {
                System.out.println("try again");

            } else {
                System.out.println("you lost");
                guess++;
                break;
            }

        }

        // double guess;
        // double num = 10;
        // int count = 0;

        // do {
        // System.out.println("Enter a number");
        // guess = sc.nextInt();
        // if (guess == num) {
        // System.out.println("congrats");
        // break;

        // } else {
        // System.out.println("lost oo");
        // count++;
        // }

        // }

        // while (count < 3);
        // System.out.println("lost oo");
        sc.close();
    }
}
