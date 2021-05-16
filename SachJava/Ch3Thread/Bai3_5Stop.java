package Ch3Thread;
class MyThread4 extends Thread {
    public boolean isRunning =true;
    public void run() {
        while (isRunning) {
            System.out.print("*");
        }
        System.out.println("\nThread has stopped!");
    }
}
public class Bai3_5Stop {
    public static void main(String[] args) {
        MyThread4 mt =new MyThread4();
        mt.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mt.isRunning=false;
    }
}
