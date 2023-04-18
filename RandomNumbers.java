import java.util.Scanner;

class RandomNumber {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 6, 1, 2, 3, 4 };
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The num " + num + " is found");
        } else {
            System.out.println("The num " + num + " is not valid");
        }
        input.close(); // Close the input stream

    }
}