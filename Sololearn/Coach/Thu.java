class Number{

}
public class Thu {
    
    public static void main(String[] args) {
        // int x=0;
        // int y=0;
        // System.out.println("Tong cua x va y la: "+x+y);
        String s="@Dayla @";
        String[] st=s.split("@");
        System.out.println(st.length);
        for (String tt:st){
            System.out.println("Em :" +tt);
        }
    }
}