import java.util.Scanner;

public class Prime_String {
    static String isPrimeString(String word){
        String ans="not prime"; 
        if (word.length()>0 && (word.length() % 2 == 0)){
            int repeat=2;
            do {

            } while(repeat <1);
            ans="prime";
        } 
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            String text=sc.nextLine().trim();
            System.out.println(isPrimeString(text));
        }
        finally{
            sc.close();
        }
    }
}
