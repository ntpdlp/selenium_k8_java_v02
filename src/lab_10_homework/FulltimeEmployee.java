package lab_10_homework;

public class FulltimeEmployee extends Employee{

    final static int FULLTIME_EMPLOYEE_SALARY = 50000;

    public FulltimeEmployee(String name){
        super(name);
        this.setSalary();
    }

    //protected field from super class: y do la o sub-class su dung duoc, update duoc field 'salary' nay
    @Override
    public void setSalary() {
        salary = FULLTIME_EMPLOYEE_SALARY;
    }
}
