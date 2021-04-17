package Thread;

public class Bai8_2 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println(Thread.currentThread().getName());

        try {
            Thread t1 = new Thread(r, "t1");
            t1.start();
            Thread.sleep(2000);
            Thread t2 = new Thread(r, "t2");
            t2.start();
            Thread.sleep(1000);
            System.out.println("Finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
