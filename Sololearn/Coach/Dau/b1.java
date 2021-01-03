package Dau;

public class b1 {
    public static void main(String[] args){
        String x="5a";
        int y=0;
        try {
            y=Integer.parseInt(x)%2;
            System.out.println(y);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
