package lab_11_OOP_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeController01 {

    public static void main(String[] args) {
        Employee teo = new Employee("Teo",20);
        Employee ti = new Employee("Ti",15);
        Employee tun = new Employee("Tun",30);

        List<Employee> employeeList = Arrays.asList(teo,ti,tun);

        Collections.sort(employeeList);
        System.out.println(employeeList);



    }
}
