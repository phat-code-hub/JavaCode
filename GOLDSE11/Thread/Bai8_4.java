package Thread;

public class Bai8_4 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Run... ");
        Thread t = new Thread(r);
        t.start();
        try {
            t.join(); // make main thread wait until this t thread finish
            System.out.println("main ");
        } catch (InterruptedException e) {
            // e.printStackTrace();
            System.err.println("Exception!");
        }
    }
}
