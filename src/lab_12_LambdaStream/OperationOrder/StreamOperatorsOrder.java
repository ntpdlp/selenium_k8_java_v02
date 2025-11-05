package lab_12_LambdaStream.OperationOrder;

import java.util.List;
import java.util.Optional;

public class StreamOperatorsOrder {
    public static void main(String[] args) {
        System.out.println("Stream operator order will affect the output result");

        List<String> coffees = List.of("Cappuchino","Mocha","Americano","Latte");

        Optional<String> result01 = coffees.stream()
                .filter(s -> s.endsWith("o"))
                .sorted()
                .findFirst();

        Optional<String> result02 = coffees.stream()
                .sorted()
                .filter(s -> s.endsWith("o"))
                .findFirst();

        System.out.println("result01: " + result01);
        System.out.println("result02: " + result02);
    }
}
