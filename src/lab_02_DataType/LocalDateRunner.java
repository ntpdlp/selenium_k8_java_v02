package lab_02_DataType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LocalDateRunner {
    public static void main(String[] args) {
        //initialize
        LocalDate now = LocalDate.now();
        LocalDate now2 = LocalDate.of(2026,01,02);
        System.out.println(now.toString());
        System.out.println(now2.toString());

        //operators
        LocalDate yesterday = now.minusDays(1);
        LocalDate tomorrow = now.plusDays(1);

        List<String> names = new ArrayList<>();

    }

}
