import task1.Accountant;
import task1.Director;
import task1.Employee;
import task1.Position;
import task2.Circle;
import task2.Shape;
import task2.Reactangle;
import task2.Triangle;

public class Lesson07 {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Lesson #07, Task #1");
        Position director = new Director();
        Position accountant = new Accountant();
        Position employee = new Employee();
        System.out.println(director.printPosition());
        System.out.println(accountant.printPosition());
        System.out.println(employee.printPosition());
    }

    public static void task2() {
        System.out.println("Lesson #07, Task #2");
        Shape triangle = new Triangle(10, 10, 15);
        Shape rectangle = new Reactangle(10, 5);
        Shape circle = new Circle(10);
        System.out.println(triangle.printShape());
        System.out.println(rectangle.printShape());
        System.out.println(circle.printShape());

        System.out.println("--------------------");
        Shape[] shapes = new Shape[]{
                new Triangle(10, 10, 15),
                new Reactangle(10, 5),
                new Circle(10),
                new Reactangle(4, 4),
                new Circle(13)
        };
        double result = 0;
        System.out.println("Calculate the perimeter of all of the following shapes:");
        for (Shape shape: shapes) {
            System.out.println(shape.printShape());
            result = result + shape.getPerimeter();
        }
        System.out.println("Perimeter sum is " + result);
    }

}
