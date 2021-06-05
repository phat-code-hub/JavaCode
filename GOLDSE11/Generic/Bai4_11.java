package Generic;

import java.util.*;

public class Bai4_11 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // OK neu dung Hasmap
        // Map<String, String> map = Map.of("001", "Phat"); // Exeption since of is
        // immutable
        map.put("001", "Phat");
        map.putIfAbsent("001", "Thuy");
        System.out.println(map.get("001"));
    }
}
