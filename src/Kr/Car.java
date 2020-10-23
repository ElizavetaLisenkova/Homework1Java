package Kr;

abstract public class Car {
    private String color;
    private int maxSpeed;
    private String transmission;
    private int currentSpeed = 0;
    private int price;


    protected Car(String color, int maxSpeed, String transmission, int price) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.price = price;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        System.out.println(this.color);
        return color;
    }

    public String getTransmission() {
        return transmission;
    }


    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void start() {
        if (this.currentSpeed == 0) {
            this.accelerate(15);
            System.out.println("Поехали");
        } else {
            System.out.println("Мы уже едем");
        }

    }

    public void stop() {
        if (this.currentSpeed != 0) {
            this.setCurrentSpeed(0);
            System.out.println("Остановились");
        } else {
            System.out.println("Мы уже стоим");
        }

    }

    public void accelerate(int speed) {
        if (isLowerThanMaxSpeed(speed)) {
            this.setCurrentSpeed(getCurrentSpeed() + speed);
        } else {
            this.setCurrentSpeed(getMaxSpeed());
            System.out.println("Вы достигли максимальной скорости");
        }
    }

    public boolean isLowerThanMaxSpeed(int speed) {
        if (this.getCurrentSpeed() + speed >= this.getMaxSpeed()) {
            return false;
        }else return true;
    }

}
