import java.util.Scanner;

public class FlowingWord {
    static String[] words;
    static String isFlowing(String[] sts){
        char last=sts[0].charAt(sts[0].length()-1);
        char first=sts[1].charAt(0);
        int i=1;
        do {
            if (last !=first) {
                return "false";
            } else {
                if (i<sts.length-1){
                    last=sts[i].charAt(sts[i].length()-1);
                    first=sts[++i].charAt(0);
                }
            }
        }while(i<sts.length-1);
        return "true";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            String sentence=sc.nextLine();
            words=sentence.trim().toLowerCase().split(" ");
            if (words.length >1){
                System.out.println(isFlowing(words));
            } else {
                System.out.println("false");
            }
        }
        finally {
            sc.close();
        }

    }
}
