import java.util.Scanner;

/**
 * Homework for TeachMeSkills - Java Lesson #2
 *
 * @author Lauren Gerasimova
 */

public class Lesson2 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Lesson 2, Task 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number%2 == 0) {
                System.out.println("Number " + number + " is even number");
            } else {
                System.out.println("Number " + number + " is odd number");
            }
        } else {
            System.out.println("Something goes wrong. It's not a number.");
        }
    }

    public static void task2() {
        System.out.println("Lesson 2, Task 2");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter temperature: ");

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            if (t > -5) {
                System.out.println("Warm");
            } else if (-5 >= t &&  t > -20) {
                System.out.println("Normal");
            } else if (-20 >= t) {
                System.out.println("Cold");
            }
        } else {
            System.out.println("Something goes wrong. It's not a number.");
        }
    }

    public static void task3() {
        System.out.println("Lesson 2, Task 3");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + " = " + i*i);
        }
    }

    public static void task4() {
        System.out.println("Lesson 2, Task 4");
        int i = 0;
        while (i < 98) {
            i = i + 7;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Lesson 2, Task 5");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number < 1) {
                System.out.println("Number must be positive.");
            } else {
                long result = 0;
                for (int i = 1; i <= number; i++) {
                    result = result + i;
                }
                System.out.println("Calculation for " + number + " result is " + result);
            }
        } else {
            System.out.println("Something goes wrong. It's not a number.");
        }
    }

}
