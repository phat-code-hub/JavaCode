package ThiDau;
class A {
    int x=10;
    int pp() {
        return 22;
    }
}
class B extends A {
    int x=20;
    int pp(){
        int c=this.x;
        return c;
    }
}
public class b8_Class {
    public static void main(String[] args) {
        A a= new B();
        System.out.println(a.x);
        System.out.println(a.pp());
        System.out.println(Integer.toString(2));
    }
}
