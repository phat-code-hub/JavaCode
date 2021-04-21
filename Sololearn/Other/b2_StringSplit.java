package Other;

public class b2_StringSplit {
    public static void main(String[] args){
        System.out.println('a'+'i');
        String msg="Welcome@to@solo@learn";
        String[] spl1=msg.split("@");
        for (String st:spl1) System.out.print(st+",");
        int l1=spl1.length;
        System.out.println("\n"+l1);
        String[] spl2=msg.split("@",-3);
        for (String st:spl2) System.out.print(st+",");
        int l2=spl2.length;
        System.out.println("\n"+l2);
        String[] spl3=msg.split("@",-1);
        for (String st:spl3) System.out.print(st+",");
        int l3=spl3.length;
        System.out.println("\n"+l3);
        String[] spl4=msg.split("@",2); // Welcome, to@solo@learn
        for (String st:spl4) System.out.print(st+",");
        int l4=spl4.length;
        System.out.println("\n"+l4);
    }
}
