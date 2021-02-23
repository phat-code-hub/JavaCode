package Sololearn.Dau;

public class b2 {
    public static void main(String[] args) {
        int a=5, f=3;
        for (;;){
            if ((a+=f+1) >8) {
                System.out.println(a);
                break;
            } else {
                f=a % (f+1);
                System.out.println(f);
                }
        }
        System.out.println("Cuoi: "+(f*a));
    }
}
