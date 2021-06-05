package ThiDau;

import java.util.Vector;

public class b7_Vector {
   public static void main(String[] args) {
       Vector<Integer> obj = new Vector<>(4,2);
    // System.out.println(obj.capacity());
    obj.addElement(3);
    obj.addElement(6);
    obj.addElement(5);
    // System.out.println(obj.elementAt(1));
    for(int i:obj){
        System.out.println(i);
    }
   } 
}
