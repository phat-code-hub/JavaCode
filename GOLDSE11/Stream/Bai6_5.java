package Stream;

import java.util.*;
import java.util.function.*;

interface BookFilter extends Predicate<String> {
    public default boolean test(String st) {
        return st.equals("SE11");
    }
}

public class Bai6_5 {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("SE11", "Java SE11 Silver", "Java SE11 Gold");
        Predicate<String> f1 = s -> s.length() > 5;
        Predicate<String> f2 = new BookFilter() {
            public boolean test(String sts) {
                return sts.contains("SE11");
            }
        };
        int count = (int) strs.stream().filter(f1).filter(f2).count();
        System.out.println(count);
    }
}
