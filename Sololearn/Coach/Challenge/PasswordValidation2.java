package Challenge;

import java.util.Scanner;

public class PasswordValidation2 {
    static boolean checkPassword(final String word){
        final String SpecialWords="!@#$%&*";
        final char[] chars= word.toCharArray();
        boolean chk =false;
        boolean cond1,cond2;
        int sum1=0,sum2=0;
        for (char c: chars){
            cond1=SpecialWords.contains(Character.toString(c));
            cond2=Character.isDigit(c);
            if (cond1) sum1++;
            if (cond2) sum2++;
        }
        chk = word.trim().length()>=7 && sum1 >=2 && sum2 >=2 ;
        return chk; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine().trim().toLowerCase();
        System.out.println(checkPassword(password));
        sc.close();
    }
}
