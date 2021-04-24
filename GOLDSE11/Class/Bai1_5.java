package Class;

class Super {
    int a = 1;

    public Super() {
        System.out.println("Main!!");
    }

    String method() {
        return "Super1";
    }

    protected static String method2() {
        return "Super2";
    }
}

public class Bai1_5 extends Super {
    int a = 2;

    public Bai1_5() {
        System.out.println("Hello");
    }

    String method() {
        Super.method2();
        return "Sub1";
    }

    protected static String method2() {
        return "Sub2";
    }

    void func() {
        Super s = new Bai1_5();
        System.out.println(s.method() + Super.method2() + s.a);
    }

    public static void main(String[] args) {
        new Bai1_5().func();
    }

}
