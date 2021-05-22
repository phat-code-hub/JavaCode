package Ch4StackAndHeap;
class DataSet2 {
    int[]  data= new int[100];
}
public class GarbageCollection {
    
    public static void main(String[] args) {
        System.out.println("空きメモリサイズ: "+ Runtime.getRuntime().freeMemory());
        DataSet2[] data = new DataSet2[10000];
        for (int i=0;i <data.length;i++){
            data[i] = new DataSet2();
            data[i] = null;
            if(i % 100 == 99) {
                System.out.println("生成済みインスタンス数："+
                (i+1)+ " 空きメモリサイズ: "+
                Runtime.getRuntime().freeMemory());
            }
        }
    }   
}
