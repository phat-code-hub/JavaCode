package Challenge;

import java.util.Scanner;

public class LoanCalculator2 {
    
    public static void main (String[] args) {
        Scanner scanner= new Scanner(System.in);
        int amount=scanner.nextInt();
        int payment;
        int remain=amount;
        int month=1;
        do {
            // payment=remain/10;
            payment=(int) Math.ceil(remain*0.1);
            remain =(int) (remain-payment);
            System.out.printf("Paid: %d con %d\n",payment,remain);
        } while (++month<=6);
        System.out.println(remain);
        scanner.close();
    }
}
