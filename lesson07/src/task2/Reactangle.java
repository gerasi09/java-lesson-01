package task2;

public class Reactangle extends Shape {

    private int sideA;
    private int sideB;

    public Reactangle (int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getShapeType() {
        return "reactangle";
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public double getPerimeter() {
        return (this.sideA + this.sideB) * 2;
    }
}
