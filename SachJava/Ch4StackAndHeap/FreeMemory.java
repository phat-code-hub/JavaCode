package Ch4StackAndHeap;
class Dataset {
    int[]  data= new int[100];
}
public class FreeMemory {
    
    public static void main(String[] args) {
        System.out.println("空きメモリサイズ: "+ Runtime.getRuntime().freeMemory());
        Dataset[] data = new Dataset[10000];
        for (int i=0;i <data.length;i++){
            data[i] = new Dataset();
            if((i+1) % 100 == 0) {
                System.out.println("生成済みインスタンス数："+Runtime.getRuntime().freeMemory());
            }
        }
    }   
}
