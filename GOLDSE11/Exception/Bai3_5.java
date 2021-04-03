package GOLDSE11.Exception;

public class Bai3_5 {
    static void func(String[] st) {
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(st[i]);
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
        }
    }

    public static void main(String[] args) {
        String[] str = { "Java", null, "Phat" };// Null van in ra binh thuong
        func(str);
    }
}
