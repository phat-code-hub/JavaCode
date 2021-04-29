package Ch3Thread;
class MyThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Run Method MyThread ("+i+")");
        }
    }
}
public class Bai3_1 {
    public static void main(String[] args){
        MyThread t= new MyThread();
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("Main Thread ("+i+")");
        }
     }
}
