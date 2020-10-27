package Control_work;

public class Dish {

    private Double price;
    private String measure; //единица измерения
    private Double quantity;
    private String composition;
    private String name;

    public Dish(String name, Double price, String measure, Double quantity, String composition) {
        this.name = name;
        this.price = price;
        this.measure = measure;
        this.quantity = quantity;
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getComposition() {
        return composition;
    }

    public String getMeasure() {
        return measure;
    }
}
