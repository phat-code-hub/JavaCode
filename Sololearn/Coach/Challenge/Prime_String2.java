package Challenge;


import java.util.Scanner;

public class Prime_String2 {
    static String text;
    static int len;
    static String ans="prime";
    //-----------------------------------------
    static void trace_String(int toIndex){
        String subWord=text.substring(0,toIndex);
        int i=0;
        int cnt=0;
        while(i>-1){
            i=text.indexOf(subWord,i);
            if (i>=0){
                cnt++;
                i+=subWord.length();
            }
        };
        ans=(subWord.length()*cnt==len) ? "not prime":"prime";
    }   
    //----------------------------------------------------------
    //Main code
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter text: ");
            text=sc.nextLine().trim();
            len=text.length();
            if (len>0) {
               for (int n=len/2;n>=0;n--){
                   trace_String(n);
                   if (ans.equals("not prime")) break;
               }
            }
            System.out.println(ans);
        }
        finally{
            sc.close();
        }
    }
    
   
}
