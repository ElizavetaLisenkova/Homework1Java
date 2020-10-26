package tasksForRepetition;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> lst = new ArrayList<>();

        //Создание объектов работников
        HourlySalaryEmployee hourEmp1 = new HourlySalaryEmployee("Sasha", 1, 300);
        FixSalaryEmployee fixEmp1 = new FixSalaryEmployee("Ayla", 2, 300000);
        FixSalaryEmployee fixEmp2 = new FixSalaryEmployee("Liza", 3, 300000);


        //Добавление объектов в список
        lst.addAll(Arrays.asList(fixEmp1, fixEmp2, hourEmp1));


        //Сортировка списка
        Comparator<Employee> comparator = Comparator.comparing(obj -> obj.getMonthlySalary());
        comparator = comparator.reversed().thenComparing(obj -> obj.getName().toLowerCase());

        lst.sort(comparator);


        //Выводы
        System.out.println("---------------------");
        for (Employee emp: lst) {
            System.out.printf("id: %s, name: %s, salary: %s\n", emp.getId(), emp.getName(), emp.getMonthlySalary());
        }

        System.out.println("--------First--------");
        for (int i=0; i<2; i++) {
            System.out.println(lst.get(i).getName());
        }

        System.out.println("--------Last---------");
        for (Employee emp: lst.subList(lst.size()-2, lst.size())) {
            System.out.println(emp.getId());
        }

        //Запись объекта в файл

        try{
            FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\eelis\\IdeaProjects\\JavaHomework\\src\\tasksForRepetition\\EmployeeTest.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Запись объектов в файл
            for (Employee emp: lst) {
               oos.writeObject(emp);
            }
            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        // чтение из файла
        try{
            FileInputStream fis = new FileInputStream(new File("C:\\Users\\eelis\\IdeaProjects\\JavaHomework\\src\\tasksForRepetition\\EmployeeTest.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee s1 = (Employee) ois.readObject();
            Employee s2 = (Employee) ois.readObject();
            Employee s3 = (Employee) ois.readObject();
            System.out.println(s1.getName());
            System.out.println(s2.getName());
            System.out.println(s3.getName());
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
