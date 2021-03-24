package GOLDSE11.NIO2;

import java.io.Console;

public class Bai9_2 {
    public static void main(String[] args) {
        Console c = System.console();
        while (true) {
            System.out.print(">>");
            String data = c.readLine();
            if (data.equals(""))
                break;
            System.out.println("Input: " + data);
        }
        System.out.println("--Finish--");
    }
}
