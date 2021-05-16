package Ch3Thread;
class MyThread3 extends Thread {
    public void run() {
        for (int i =0; i<100;i++){
            System.out.println("My Theadのrun method:( "+ i+ ")");
        }
    }
}
public class Bai3_4Join {
    public static void main(String[] args) {
        MyThread3 mt = new MyThread3();
        mt.start();
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i =0; i<100;i++){
            System.out.println("Main method:( "+ i+ ")");
        }
    }
}
