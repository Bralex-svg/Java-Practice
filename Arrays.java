public class Arrays {
    public static void main(String[] args) {
        // Array instantiating
        // int[] array1 = new int[10];
        // array1[0] = 10;
        // array1[1] = 20;

        int[] age = { 10, 20, 30 };
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);

        }
        // Declaring and initializing an array
        // String[] names = { "ADAM", "ALEX", "Eliasu" };
        // for (String name : names) {

        // System.out.println(name);

        // }
        // accessing the array by referencing their index
        // System.out.println(names[0]);

        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum = 0;
        double average;
        for (int number : numbers) {
            sum += number;
        }

        int Length_Array = numbers.length;
        average = ((double) sum / (double) Length_Array);
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

    }
}