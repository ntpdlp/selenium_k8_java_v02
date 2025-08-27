package lab_10_homework;

public class ContractorEmployee extends Employee{

    final static int CONTRACTOR_EMPLOYEE_SALARY = 40000;

    public ContractorEmployee(String name){
        super(name);
        this.setSalary();
    }

    @Override
    public void setSalary() {
        this.salary = CONTRACTOR_EMPLOYEE_SALARY;
    }
}
