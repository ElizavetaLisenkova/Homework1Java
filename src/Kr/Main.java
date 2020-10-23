package Kr;

public class Main {

    public static void main(String[] args) {
        Toyota t = new Toyota("black", 35, "Automatic", 7000000, "Corolla", true);
        t.start();
        t.accelerate(300);
        Garage g = new Garage(10);
        g.add(t);


    }
}
