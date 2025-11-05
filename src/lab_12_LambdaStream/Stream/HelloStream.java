package lab_12_LambdaStream.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloStream {
    public static void main(String[] args) {
        List<String> names = List.of("I","am","a","list","of","String");
        Stream<String> stream = names.stream();
        Stream<String> limit = stream.limit(4); //stream intermediate operator > return a stream
        long result = limit.count(); //stream terminal operator
        System.out.println(result);

        List<String> collected = names.stream().limit(2).collect(Collectors.toList());
        System.out.println(collected);
    }
}
