package Challenge;

import java.util.Scanner;

public class SnowBallingNumbers {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        String res="true";
        int sum=0;
        for (int i=0;i<n;i++){
            if (i == 0 ){
                sum += nums[i];
            } else {
                if (nums[i]<= sum) {
                    res="false";
                    break;
                } else {
                    sum +=nums[i];
                }
            }   
        }
        System.out.println(res);
    } 
}
