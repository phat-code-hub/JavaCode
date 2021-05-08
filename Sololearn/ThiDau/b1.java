package ThiDau;
class access {
    static int x;
    void increment(){++x;}
}
public class b1 {
   
    public static void main(String[] args) {
        access o1=new access();
        access o2 =new access();
        // System.out.println(o1.x+","+o2.x);
        System.out.println(access.x+","+access.x);
        o1.increment();
        o2.increment();
        System.out.println(access.x+","+access.x);
    }
}
