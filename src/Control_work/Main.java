package Control_work;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Dish d1 = new Dish("Салат цезарь", 200.0, "гр.", 250.0, "помидоры");
        Dish d2 = new Dish("Салат греческий", 220.0, "гр.", 280.0, "помидоры");
        Dish d3 = new Dish("Филе", 230.0, "шт.", 2.0, "курица");
        Dish d4 = new Dish("Суп", 230.0, "гр.", 200.0, "курица");

        ArrayList<Dish> ar = new ArrayList<Dish>();
                ar.addAll(Arrays.asList(d1, d2));

        Menu menu = new Menu(ar);

        menu.printCurrentMenu();

        menu.addDishesToMenu(d3, d4);
        menu.removeDishesFromMenu(d2);

        Order order1 = new Order(2, menu, d1, d3);


    }
}
