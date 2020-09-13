package Seminar1;

public class task4 {
    public static void main(String[] args) {

        int x = 4;
        int y = 2;
        int t;
        System.out.println("x = " + x + ", y =" + y);
        x = x+y-(y = x);
        System.out.println("x = " + x + ", y =" + y);
        x = x^y^(y = x);
        System.out.println("x = " + x + ", y =" + y);
        t = x;
        x = y;
        y = t;
        System.out.println("x = " + x + ", y =" + y);
    }
}
