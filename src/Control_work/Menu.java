package Control_work;


import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    private ArrayList<Dish> stopList;

    public Menu(ArrayList<Dish> stopList) {
        this.stopList = stopList;
    }



    public void addDishesToMenu(Dish... dishes) {
        stopList.addAll(Arrays.asList(dishes));
        System.out.println("В меню добавлены новые блюда. Новый стоп-лист:");
        this.printCurrentMenu();
    }

    public void removeDishesFromMenu(Dish... dishes) {
        stopList.removeAll(Arrays.asList(dishes));
        System.out.println("Из меню удалили некоторые блюда. Новый стоп-лист:");
        this.printCurrentMenu();
    }

    public ArrayList<Dish> getStopList() {
        return stopList;
    }

    public void printCurrentMenu() {
        System.out.println("В меню сегодня: ");
        for (Dish dish: getStopList()) {
            System.out.printf("               %s по цене %s за %s %s Состав блюда: %s.\n", dish.getName(), dish.getPrice(), dish.getQuantity(), dish.getMeasure(), dish.getComposition());
        }
    }
}
