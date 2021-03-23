package GOLDSE11.Thread;

public class Bai8_1 {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println(Thread.currentThread().getName());
        Runnable r2 = () -> System.out.println(Thread.currentThread().getName());
        new Thread(r1, "Thread1").start();
        new Thread(r2, "Thread2").start();
    }
}
