package ThiDau;

public class b5Class {
    static class R{
        static String s="RA!"; // Phai la static
        R A;
        R() {
            System.out.println(R.s);
        }
    }
    public static void main(String[] args) {
        System.out.println(R.s);
    }
}
