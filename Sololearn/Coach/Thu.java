public class Thu {
    static int ans(int a,int b){
        int c=a;
        System.out.println("First: "+c);
        for (c=a;c<b;c++){
            c+=c;
            System.out.println("i ("+c+")="+c);
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(Thu.ans(2,6));
        String s1="Phat";
        String s2="Ph";
        String s3=s2+"at";
        String s4="Phat";
        System.out.println(s1 == s3); 
        System.out.println(s1 == s4); 
    }
}