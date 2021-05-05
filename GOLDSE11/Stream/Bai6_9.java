package Stream;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Bai6_9 {
    public static void main(String[] args) {
        UnaryOperator<String> uo = s -> s.concat(s.toUpperCase());
        Arrays.asList("aa", "bb", "cc").stream().map(uo).forEach(System.out::print);
    }
}
