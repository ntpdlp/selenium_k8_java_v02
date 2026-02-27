package lab_17_java_tips;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;
import static java.util.Collections.sort;

public class ImportStatic {
    public static void main(String[] args) {
        System.out.println("normal");
        out.println("static import");


        List<String> fruits = new ArrayList<>(List.of("grape","banana","apple","kiwi"));
        sort(fruits);
        out.print(fruits);
    }
}
