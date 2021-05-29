package Generic;

import java.util.*;

public class Bai4_9 {
    public static void main(String[] args) {
        Map<String, String> m = new TreeMap<>();
        m.put("02", "AA");
        m.put("01", "BB");
        m.put("02", "CC");
        for (String k : m.keySet()) {
            System.out.println((k) + ": " + m.get(k));
        }
    }
}
