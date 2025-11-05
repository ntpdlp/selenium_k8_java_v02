package lab_12_LambdaStream.Stream;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HelloStream02 {
    public static void main(String[] args) {
        List<String> coffees = List.of("Cappuccino","Americano","Espresso","Cortado","Mocha","Cappuccino","Flat White","Latte");
        Set<String> coffeesEndingInO =
                coffees.stream()
                .distinct()
                .filter(s -> s.endsWith("o"))
                .sorted( (s1,s2) -> s1.compareTo(s2))
                .collect(Collectors.toSet());

        Set<String> coffeeOrdered = new TreeSet<>(coffeesEndingInO);

        System.out.println(coffeeOrdered);

    }
}
