package GOLDSE11.NIO2;

import java.io.*;

public class Bai9_1 {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(">> ");
            String st = in.readLine();
            System.out.println(st);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}