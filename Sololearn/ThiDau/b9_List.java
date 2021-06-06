package ThiDau;

import java.util.*;

public class b9_List {
    public static void main(String[] args) {
        String[] str={"1","2","3"};
        List<String> lst=Arrays.asList(str);
        // System.out.println(str[2]);
        // lst.forEach(System.out::println);
        lst.set(2,"two"); // str[2] also change to "two" 
        System.out.println(str[2]); 
        lst.forEach(System.out::println);
        str[0]="@we";
        System.out.println(lst.get(0)+","+str[2]);
    }
}
