package Seminar1;

public class task12 {
    public static void main(String[] args) {
        System.out.println(length(12.3, 3.0, 10.0, 5.4));
    }

    public static double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}
