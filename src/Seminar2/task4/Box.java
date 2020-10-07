package Seminar2.task4;

public class Box extends Shape {

    public Box(double volume) {
        super(volume);
    }

    public boolean add(Seminar2.task4.Shape shape) {
        if (shape.getVolume() <= this.getVolume()) {
            this.setVolume(this.getVolume()-shape.getVolume());
            System.out.println("Добавлено.  Объем коробки стал: " + this.getVolume());
            return true;
        }
        else {
            System.out.println("Для этой фигуры в коробке не хватает места. Объем фигуры: " + shape.getVolume() + ", свободного места в коробке: " + this.getVolume());
            return false;
        }
    }

}
