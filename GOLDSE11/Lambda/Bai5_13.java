package Lambda;

import java.util.*;
import java.util.function.Consumer;

public class Bai5_13 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10, 20, 30);
        // lst.forEach(System.out::println);
        Consumer<Integer> c1 = System.out::print;
        Consumer<Integer> c2 = c1.andThen(n -> System.out.println(":" + n * n));
        lst.forEach(c2);
    }
}
