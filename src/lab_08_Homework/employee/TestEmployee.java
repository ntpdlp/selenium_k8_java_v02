package lab_08_Homework.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        Employee adnan = new FulltimeEmployee("Adnan");
        Employee mike = new FulltimeEmployee("Mike");
        Employee tem = new FulltimeEmployee("Tem");
        Employee vo = new ContractEmployee("Vo");
        Employee quynh = new ContractEmployee("Quynh");

        List<Employee> employees = new ArrayList<>(Arrays.asList(adnan,mike,tem,vo,quynh));
        int totalSalry = EmployeeController.calculateSalary(employees);
        System.out.println(totalSalry);
    }
}
