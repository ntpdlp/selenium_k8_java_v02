package lab_08_Homework.employee;

public class FulltimeEmployee extends Employee{

    final static int FULLTIME_SALARY = 50000;

    FulltimeEmployee(String name) {
        super(name, FULLTIME_SALARY);
    }
}
