package lab_10_homework;

import java.util.Arrays;

public class TestEmployee {

    public static void main(String[] args) {
        Employee fte = new FulltimeEmployee("Fulltime");
        Employee ctt = new ContractorEmployee("Contractor");

        System.out.println("Total Salary: " + ControllerEmployee.calculateSalary(Arrays.asList(fte,ctt)));
    }
}
