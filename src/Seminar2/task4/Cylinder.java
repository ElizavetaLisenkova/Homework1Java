package Seminar2.task4;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius, Math.PI*radius*radius*height);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
