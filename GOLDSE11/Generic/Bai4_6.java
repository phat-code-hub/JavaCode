package GOLDSE11.Generic;

import java.util.*;

public class Bai4_6 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.add("AA");
        link.add("DD");
        link.add("BB");
        Collections.sort(link);
        for (String st : link) {
            System.out.println(st);
        }
        link.push("CC"); // add at the begin 0
        Collections.reverse(link);
        System.out.println();
        for (String st : link) {
            System.out.println(st);
        }
    }
}
