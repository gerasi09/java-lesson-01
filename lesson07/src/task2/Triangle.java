package task2;

public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (sideA + sideB - sideC < 0) {
            throw new IllegalArgumentException("It's not a triangle");
        }
    }

    @Override
    public String getShapeType() {
        return "triangle";
    }

    @Override
    public double getArea() {
        double pp = (this.sideA + this.sideB + this.sideC) / 2.0;
        return Math.sqrt(pp * (pp - this.sideA) * (pp - this.sideB) * (pp - this.sideC));
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

}
