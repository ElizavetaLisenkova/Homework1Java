package Seminar2.task3;

public class Box extends Shape{

    public Box(double volume) {
        super(volume);
    }

    public boolean add(Shape shape) {
        if (shape.getVolume() <= this.volume) {
            this.volume -= shape.getVolume();
            System.out.println("Добавлено.  Объем коробки стал: " + this.volume);
            return true;
        }
        else {
            System.out.println("Для этой фигуры в коробке не хватает места. Объем фигуры: " + shape.getVolume() + ", свободного места в коробке: " + this.volume);
            return false;
        }
    }

}
