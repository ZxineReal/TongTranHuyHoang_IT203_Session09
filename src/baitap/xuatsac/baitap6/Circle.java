package baitap.xuatsac.baitap6;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double scale) {
        this.radius = radius * scale;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
