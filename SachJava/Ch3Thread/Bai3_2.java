package Ch3Thread;
class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Run Method MyThread ("+i+")");
        }
    }
    
}
public class Bai3_2 {
    public static void main(String[] args){
        MyThread2 th2= new MyThread2();
        Thread t= new Thread(th2);
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("Main Thread ("+i+")");
        }
    }

}
