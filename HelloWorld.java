
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Accepting user input

        // System.out.println("Enter your name pls");
        // String name = sc.nextLine();
        // System.out.println(name);

        // Increment demo
        // int x = 10;
        // System.out.println(++x);

        // CONDITIONAL STATEMENTS DEMO

        // GRADING SYSTEM USING IF ELSE STATEMENT
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter score 1-100");
        int score = sc.nextInt();
        sc.close();

        String grade;
        if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";

        } else if (score >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Your name" + name);
        System.out.println("Your score" + score);
        System.out.println("Your grade" + grade);

    }

}
