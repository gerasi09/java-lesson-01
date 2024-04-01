
/**
 * Homework for TeachMeSkills - Java Lesson #1
 *
 * @author Lauren Gerasimova
 */

public class Lesson1 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Lesson 1, Task 1");
        int b = 5;
        int c = 6;
        double a = 4 * (b + c - 1) /2d;
        System.out.println("b = " + b + ", c = " + c + ", result a = " + a);
    }

    public static int calculateNumbers(int n) {
        int result = 0;
        String text = String.valueOf(n);
        char[] numbers = text.toCharArray();
        for (char value : numbers) {
            int number = Character.getNumericValue(value);
            result = result + number;
        }
        return result;
    }

    public static void task2() {
        System.out.println("Lesson 1, Task 2");
        int n = 26;
        int result = calculateNumbers(n);
        System.out.println("n = " + n + ", result is " + result);
    }

    public static void task3() {
        System.out.println("Lesson 1, Task 3");
        int n = 126;
        int result = calculateNumbers(n);
        System.out.println("n = " + n + ", result is " + result);
    }


    public static void task4() {
        System.out.println("Lesson 1, Task 4");
        double n = 59.7;
        long result = Math.round(n);
        System.out.println("n = " + n + ", result is " + result);
    }

    public static void task5() {
        System.out.println("Lesson 1, Task 5");
        int q = 21;
        int w = 8;
        double result = (double) q / w;
        System.out.println("g = " + q + ", w = " + w + ", result is " + result);
    }

    public static void task6() {
        System.out.println("Lesson 1, Task 6");
        int a = 1;
        int b = 2;
        System.out.println("before swap: a = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("after swap: a = " + a + ", b = " + b);
    }

}
