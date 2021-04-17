package Other;

import java.util.BitSet;

public class b1_BitSet {
    public static void main(String[] args){
        BitSet a=new BitSet(5);
        for (int i=0;i<5;i++){
            a.set(i);
        }
        BitSet b= new BitSet(2);
        b.set(4);
        b.set(5);
        a.and(b);
        System.out.print(a);
    }
}
