package Seminar2.task3;

import static java.lang.Math.*;

public class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius, Math.PI*radius*radius*height);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
