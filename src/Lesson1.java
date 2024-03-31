
/**
 * Homework for TeachMeSkills - Java Lesson #1
 *
 * @author Lauren Gerasimova
 */

public class Lesson1 {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Lesson 1, Task 1");
        int b = 5;
        int c = 6;
        double a = 4 * (b + c - 1) /2d;
        System.out.println("b = " + b + ", c = " + c + ", result a = " + a);
    }

    public static void task2() {
        System.out.println("Lesson 1, Task 2");
        int n = 26;
        int result = 0;
        String text = String.valueOf(n);
        char[] numbers = text.toCharArray();
        for (char value : numbers) {
            int number = Character.getNumericValue(value);
            result = result + number;
        }
        System.out.println("n = " + n + ", result is " + result);
    }

}
