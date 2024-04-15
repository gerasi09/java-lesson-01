package task2;

public abstract class Shape {

    public abstract String getShapeType();

    public abstract double getArea();

    public abstract double getPerimeter();

    public String printShape() {
        return this.getShapeType() + " with area: " + this.getArea() + " and perimeter: " + this.getPerimeter();
    }

}
