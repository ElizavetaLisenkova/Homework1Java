package Seminar2.task3;

public class SolidOfRevolution extends Shape {

    private double radius;

    protected SolidOfRevolution(double radius, double volume){
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
