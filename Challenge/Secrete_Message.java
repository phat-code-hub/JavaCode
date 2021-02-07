package Challenge;

import java.util.Scanner;

public class Secrete_Message {
    static char invert_Char(char w) {
        char c =' ';
        if (Character.isAlphabetic(w)){
            c = (char) ((int)'z'- ((int)w- (int)'a'));
        }
        return c;
    }
    public static void main(String[] args) {
        String words;
        Scanner sc=new Scanner(System.in);
        words=sc.nextLine().trim().toLowerCase();
        for( char c: words.toCharArray()) {
            System.out.print(invert_Char(c));
        }
        sc.close();
    }
}
