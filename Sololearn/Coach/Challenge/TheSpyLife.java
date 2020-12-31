package Challenge;

import java.util.Scanner;

public class TheSpyLife {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String mess=sc.nextLine().trim();
        String spyLife=""; 
        for (char c:mess.toCharArray()){
            if(Character.isAlphabetic(c)){
                spyLife =c +spyLife;
            }
        }
        System.out.println(spyLife);
        sc.close();
    }
}
