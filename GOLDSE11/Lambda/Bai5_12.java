package Lambda;

import java.util.*;
import java.util.function.*;

public class Bai5_12 {
    public static void main(String[] args) {
        List<Double> codes = Arrays.asList(10.0, 20.0);
        UnaryOperator<Double> uo = s -> s + 10.0;
        codes.replaceAll(uo);
        codes.forEach(s -> System.out.println(s));
    }
}
