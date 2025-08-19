package lab_08_Homework.employee;

import java.util.List;

public class EmployeeController {

    public static int calculateSalary(List<Employee> employeeList){
        int totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary+=employee.getSalary();
        }

        return totalSalary;
    }
}
