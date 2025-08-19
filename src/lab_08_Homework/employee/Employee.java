package lab_08_Homework.employee;

public class Employee {

    public String name;
    public int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }


    public int getSalary(){
        return this.salary;
    }

}
