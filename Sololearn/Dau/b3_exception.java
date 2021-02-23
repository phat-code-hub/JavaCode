package Sololearn.Dau;

public class b3_exception {
    public static void main(String[]  args){
        int n=6;
        for (int i =0;i <3;i++){
            try {
                n /=i;
            } catch(Exception e) {
                n+=2;
            }
        }
        System.out.println(n);
    }
}
