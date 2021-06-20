package ThiDau;

public class b11ArrayCopy {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,0};
        int [] arr2= {6,7,8,9,10,11};
        System.arraycopy(arr2,1,arr1,3,2); // lay 7,8,9 copy vao arr1 sau so 3
        for (int x: arr1){
            System.out.print(x+",");
        }
        System.out.println();
        for (int x: arr2){
            System.out.print(x+",");
        }
    }
}
