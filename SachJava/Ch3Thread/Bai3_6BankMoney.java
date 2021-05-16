package Ch3Thread;
class Bank {
    static int money=0;
    static synchronized void add_One(){ // add synchronized 
        money++;
    }
}
class Customer extends Thread {
    public void run() {
        for (int i=0;i<10000;i++){
            Bank.add_One();
        }
    }
}
public class Bai3_6BankMoney {   
    public static void main(String[] args) {
        Customer[] customer =new Customer[100];
        for (int i=0;i<customer.length;i++){
            customer[i] = new Customer();
            customer[i].start();
            // customer[i].join(); // exactly 1000000
        }
        for (int i=0;i<customer.length;i++){
            try {
                customer[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Bank.money);
    }
}
