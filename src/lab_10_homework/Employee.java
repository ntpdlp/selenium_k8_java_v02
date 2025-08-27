package lab_10_homework;

public abstract class Employee {
    private String name;
    protected int salary;

    public Employee(String name){
        this.name = name;
    }

    public abstract void setSalary();
    public int getSalary(){
        return this.salary;
    }

}
