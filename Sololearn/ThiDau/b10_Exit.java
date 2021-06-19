package ThiDau;

public class b10_Exit {
    private int a=10;

    public b10_Exit(int a) {
        this.a =a;
    }

    public static void main(String[] args) {
        int x=0;
        boolean b=false;
        System.out.println(x);
        System.out.println(b);
        b10_Exit pp= new b10_Exit(20);
        pp.a += 50;
        System.out.println(pp.a);
        System.exit(2); // phai co code exit 0 hay 1
        System.out.println("1");
    }
}
