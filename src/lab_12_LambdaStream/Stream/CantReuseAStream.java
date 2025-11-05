package lab_12_LambdaStream.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CantReuseAStream {
    public static void main(String[] args) {
        List<String> strings = List.of("You","can't","reuse","a","stream");

        Stream<String> stringStream = strings.stream().sorted();

        List<String> twoStrings = stringStream.limit(2).collect(Collectors.toList());
        List<String> fourStrings = stringStream.limit(4).collect(Collectors.toList());

    }
}
