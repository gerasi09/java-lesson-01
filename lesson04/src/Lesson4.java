import java.util.Arrays;
import java.util.Scanner;

/**
 * Homework for TeachMeSkills - Java Lesson #4
 *
 * @author Lauren Gerasimova
 */

public class Lesson4 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Lesson #04, Task #1");
        int[] array = getIntArrayFromInput();
        System.out.println("User entries: " + Arrays.toString(array));
        System.out.println("Forward iteration:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Backward iteration:");
        for (int j = array.length; j > 0; j--) {
            System.out.println(array[j - 1]);
        }
    }

    public static void task2() {
        System.out.println("Lesson #04, Task #2");
        int size = getArraySizeFromInput();
        if (size < 1) {
            System.out.println("Size can't be less than one. Size will be use 1.");
            size = 1;
        }
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println("Our array is: " + Arrays.toString(array));
        double min = array[0];
        double max = array[0];
        for (double val : array) {
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void task3() {
        System.out.println("Lesson #04, Task #3");
        int size = getArraySizeFromInput();
        if (size < 1) {
            System.out.println("Size can't be less than one. Size will be use 1.");
            size = 1;
        }
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println("Our array is: " + Arrays.toString(array));
        int minPosition = 0;
        int maxPosition = 0;
        double min = array[minPosition];
        double max = array[maxPosition];
        for (int j = 0; j < array.length; j++) {
            double min1 = Math.min(min, array[j]);
            double max1 = Math.max(max, array[j]);
            if (min != min1) {
                min = min1;
                minPosition = j;
            }
            if (max != max1) {
                max = max1;
                maxPosition = j;
            }
        }
        System.out.println("Min: " + min + ", position: " + minPosition);
        System.out.println("Max: " + max + ", position: " + maxPosition);
    }

    public static void task4() {
        System.out.println("Lesson #04, Task #4");
        int[] array = getIntArrayFromInput();
        System.out.println("User entries: " + Arrays.toString(array));
        int count = 0;
        for (int val : array) {
            if (val == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Zeros was not found in the array");
        } else {
            System.out.println(count + " zeros were found in the array");
        }
    }

    public static void task5() {
        System.out.println("Lesson #04, Task #5");
        int[] array = getIntArrayFromInput();
        System.out.println("User entries: " + Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int buf = array[i];
            int position = array.length - 1 - i;
            array[i] = array[position];
            array[position] = buf;
        }
        System.out.println("Result is: " + Arrays.toString(array));
    }

    public static void task6() {
        System.out.println("Lesson #04, Task #6");
        int[] array = getIntArrayFromInput();
        System.out.println("User entries: " + Arrays.toString(array));
        boolean flag = isArrayIncreaseSequentially(array);
        if (flag) {
            System.out.println("The array is increase sequentially");
        } else {
            System.out.println("The array is NOT increase sequentially");
        }
    }

    private static boolean isArrayIncreaseSequentially(int[] array) {
        if (array.length < 2) {
            return false;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                return false;
            }
        }
        return true;
    }

    private static int getArraySizeFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter array size: ");

        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Error!!! Something goes wrong. It's not a number.");
            return 0;
        }

    }

    private static int[] getIntArrayFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array with numbers separates by coma: ");
        String input = sc.nextLine();
        String[] values = input.split(",");
        int[] buffer = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            buffer[i] = Integer.parseInt(values[i].trim());
        }
        return buffer;
    }

}