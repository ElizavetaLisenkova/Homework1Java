package tasksForRepetition;

import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable {
    private double monthlySalary;
    private String name;
    private int id;
//    ArrayList<Employee> lst = new ArrayList<>();

    public Employee( String name, int id, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
//        lst.add(this);
    }

//    public ArrayList<Employee> getLst() {
//        return lst;
//    }


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
