package tasksForRepetition;

public class FixSalaryEmployee extends Employee{

    private double fixSalary;


    public FixSalaryEmployee(String name, int id, double fixSalary) {
        super(name, id, fixSalary);
        this.fixSalary = fixSalary;
//        lst.add(this);
    }

}
