package Kr;

public class Toyota extends Car{

    private String model;
    private boolean isInStock;

    protected Toyota(String color, int maxSpeed, String transmission, int price, String model, boolean isInStock) {
        super(color, maxSpeed, transmission, price);
        this.model = model;
        this.isInStock = isInStock;
    }


}
