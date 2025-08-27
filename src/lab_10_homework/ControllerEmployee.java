package lab_10_homework;

import java.util.List;

public class ControllerEmployee {

    public static int calculateSalary(List<Employee> employees){
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
