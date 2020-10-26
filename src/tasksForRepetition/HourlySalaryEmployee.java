package tasksForRepetition;

public class HourlySalaryEmployee extends Employee{
    public double hourlyPayment;
    public double monthlySalary;


    public HourlySalaryEmployee(String name, int id, double hourlyPayment) {
        super(name, id, 20.8*8*hourlyPayment);
        this.hourlyPayment = hourlyPayment;
//        lst.add(this);
    }

}
