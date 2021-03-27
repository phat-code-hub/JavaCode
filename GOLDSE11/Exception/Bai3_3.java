package GOLDSE11.Exception;

public class Bai3_3 {
    public static void main(String[] args) {
        try {
            String[] str = new String[3]; // Null initialized
            func(str);
            System.out.println("try");
        } catch (NullPointerException ex) {
            System.err.println("catch");
        } catch (RuntimeException e) {
            System.err.println("Nem Throw roi");
        }
        System.out.println("Finish");
    }

    static void func(String[] str) throws RuntimeException {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i].toString() + " ");
        }
        // throw new RuntimeException();
    }
}
