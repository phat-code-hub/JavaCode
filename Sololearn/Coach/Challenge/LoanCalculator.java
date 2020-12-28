package Challenge;

import java.util.Scanner;

public class LoanCalculator {
    static final double RATE=0.1;
    static final int MONTHS=6;
    static int calPayment (int amount ){
        double pay=(double) amount;
        int month=1;
        do {
            pay=pay*(1-RATE);
        } while (++month<=MONTHS);
        return (int)pay ;
    }
    public static void main (String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            int amount= scanner.nextInt();
            System.out.println(calPayment(amount));
        }
        finally{
            scanner.close();
        } 

    }
}
