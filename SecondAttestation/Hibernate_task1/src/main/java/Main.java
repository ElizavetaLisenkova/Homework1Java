import models.Auto;
import models.User;
import services.AutoService;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        AutoService autoService = new AutoService();

        User user1 = new User("Liza", 19);
        User user2 = new User("Sasha", 20);
        User user3 = new User("Masha", 21);
        User user4 = new User("Tanya", 43);

        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
        userService.saveUser(user4);

        Auto auto1 = new Auto("Toyota", "black");
        Auto auto2 = new Auto("Bmw", "white");
        Auto auto3 = new Auto("Mercedes", "purple");
        Auto auto4 = new Auto("Lada", "blue");
        Auto auto5 = new Auto("Scoda", "black");

        user1.addAuto(auto1);
        userService.updateUser(user1);

        user2.addAuto(auto2);
        userService.updateUser(user2);

        user3.addAuto(auto3);
        userService.updateUser(user3);

        user4.addAuto(auto4);
        userService.updateUser(user4);

        user1.addAuto(auto5);
        userService.updateUser(user1);

        System.out.println(userService.findAllUsers());

        userService.deleteUser(user1);

        System.out.println(userService.findAllUsers());

        userService.findUserById(19);
        userService.findUserById(20);

        System.out.println(userService.findAutosByUserId(18));

        System.out.println(autoService.findAllAutos());
        System.out.println(autoService.findUserByAutoId(23));
        System.out.println(autoService.findAutoById(23));


    }
}