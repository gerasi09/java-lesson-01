import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson05 {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Lesson #05, Task #1");
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(10);
            }
        }
        System.out.println("Generated array:");
        printIntArray(array);
        System.out.println("Please enter random number: ");
        int number = getIntegerFromInput();
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + number;
                result = result + array[i][j];
            }
        }
        System.out.println("Calculated array:");
        printIntArray(array);
        System.out.println("Sum of all numbers: " + result);
    }

    public static void task2() {
        System.out.println("Lesson #05, Task #2");
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i+j)%2 == 0 ? "W" : "B";
            }
        }
        for (String[] o : array) {
            System.out.println(Arrays.toString(o));
        }
    }

    private static void printIntArray(int[][] array) {
        for (int[] o : array) {
            System.out.println(Arrays.toString(o));
        }
    }

    private static int getIntegerFromInput() {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Error!!! Something goes wrong. It's not a number.");
            return 0;
        }

    }

}