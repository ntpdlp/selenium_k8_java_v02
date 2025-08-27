package lab_10_homework;

public class FulltimeEmployee extends Employee{

    final static int FULLTIME_EMPLOYEE_SALARY = 50000;

    public FulltimeEmployee(String name){
        super(name);
        this.setSalary();
    }

    @Override
    public void setSalary() {
        this.salary = FULLTIME_EMPLOYEE_SALARY;
    }
}
