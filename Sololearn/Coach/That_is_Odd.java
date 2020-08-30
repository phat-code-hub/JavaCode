import java.util.Scanner;

public class That_is_Odd {
    public static void main(String[] args) {
        int[] num;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        num=new int[n];
        for(int i=0; i<n;i++){
            num[i]=sc.nextInt();
            if (num[i] %2 ==0 ) sum += num[i];
        }
        System.out.println(sum);
        sc.close();
        }
}