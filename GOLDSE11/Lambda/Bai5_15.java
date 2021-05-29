package Lambda;

import java.util.*;

class ValueCheck {
    public static int checkDef(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

public class Bai5_15 {

    public static void main(String[] args) {
        String[] arr = { "Tiger", "Rat", "Cat", "Lion" };
        Arrays.sort(arr, ValueCheck::checkDef);
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
