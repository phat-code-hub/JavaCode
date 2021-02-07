import java.util.Scanner;

public class Prime_String {
    static String  text;
    static String ans="prime"; 
     //----------------------------------------------------------
    //Create compared String 
    static String concatString(String sub,  int times) {
        String temp = "";
        for (int k = 1; k <= times; k++) {
            temp += sub;
        }
        return temp;
    }
    //----------------------------------------------------------
    //Loop from half of text length to 1 to check prime
    static  String isPrimeString() {
        final int len = text.length();
        String subst;
        String cmpst;
        for (int i = (len / 2); i >= 1; i--) {
            if (len % i == 0) {
                subst = text.substring(0, i);
                cmpst = concatString(subst, len / i);

                if (cmpst.equals(text)) {
                    ans = "not prime";
                    break;
                }
            }
        }
        return ans;
    }
    //----------------------------------------------------------
    //Main code
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            text=sc.nextLine().trim();
            if (text.length()>0) {
                System.out.println(isPrimeString());
            }
            else {
                System.out.println(ans);
            }
        }
        finally{
            sc.close();
        }
    }
}
