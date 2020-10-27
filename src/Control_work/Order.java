package Control_work;

import java.util.ArrayList;
import java.util.Arrays;



public class Order {

    private int table;
    private Double orderPrice;
    public ArrayList<Dish> orderingDishes;
    private boolean closed = false;



    public Order(int table, Menu availableDishes, Dish... dishes) {

        this.table = table;
            for (Dish dish : dishes) {
                if (checkOrder(availableDishes, dish)) {
                    this.getOrderingDishes().add(dish);
                    setOrderPrice(dish.getPrice());
                } else {
                    System.out.println("К сожалению, сегодня блюдо " + dish.getName() + "заказать нельзя.");
                }
            }

    }

    public void addDishesToOrder(Dish... dishes) {

        this.getOrderingDishes().addAll(Arrays.asList(dishes));
        System.out.println("В заказ добавлены новые блюда. ");

    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice += orderPrice;
    }

    public void closeOrder() {
        System.out.println("Сумма вашего заказа к оплате: " + this.getOrderPrice());
        setClosed(true);
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public ArrayList<Dish> getOrderingDishes() {
        return orderingDishes;
    }


    public Double getOrderPrice() {
        return orderPrice;
    }

    public boolean getClosed(){
        return getClosed();
    }

    public int getTable() {
        return table;
    }



    public boolean checkOrder(Menu menu, Dish dish) {

            if (!menu.getStopList().contains(dish)) {
                return false;
            }
        return true;

    }


}
