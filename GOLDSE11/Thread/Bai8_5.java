package Thread;

public class Bai8_5 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.print("*");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // e.printStackTrace();
            System.out.println("Interrupt");
        }
    }

    public static void main(String[] args) {
        Bai8_5 t = new Bai8_5();
        t.start();
        try {
            int st = 3000 + (int) (Math.random() * 10000);
            Thread.sleep(st);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
