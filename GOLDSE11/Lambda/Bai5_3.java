package Lambda;

@FunctionalInterface
interface Portable<T> {
    public void handCarry(Integer weigth);
}

public class Bai5_3 {
    public static void main(String[] args) {
        // Portable<Integer> p = n -> System.out.println("Carry: " + n + " Kg");
        // Cach chinh thong
        Portable<Integer> p = new Portable<Integer>() {
            public void handCarry(Integer weight) {
                System.out.println("Troi oi nang qua : " + weight + " Kg lan");
            }
        };
        p.handCarry(100);
    }

}
