package Generic;

import java.util.*;

public class Bai4_12 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(400);
        dq.push(600);
        dq.push(200);
        dq.push(800);
        dq.forEach(e -> System.out.print(e + ","));
        System.out.println();
        System.out.println(dq.pop());
    }
}
