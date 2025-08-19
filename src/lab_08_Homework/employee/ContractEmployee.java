package lab_08_Homework.employee;

public class ContractEmployee extends Employee{

    final static int CONTRACT_SALARY = 40000;

    ContractEmployee(String name){
        super(name,CONTRACT_SALARY);
    }
}
