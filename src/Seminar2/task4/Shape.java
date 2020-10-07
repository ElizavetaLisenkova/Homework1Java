package Seminar2.task4;

public abstract class Shape {

    private double volume;

    protected Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
