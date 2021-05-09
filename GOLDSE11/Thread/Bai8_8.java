package Thread;

import java.util.ArrayList;
import java.util.concurrent.*;

class exTest implements Callable<String> {
    private String name;

    public exTest(String name) {
        this.name = name;
    }

    @Override
    public String call() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.name + " ");
            Thread.sleep(1000);
        }
        return this.name + "-END";
    }

}

public class Bai8_8 {
    public static void main(String[] args) {
        ArrayList<Future<String>> list = new ArrayList<>();
        ExecutorService e = Executors.newCachedThreadPool();
        try {
            list.add(e.submit(new exTest("1")));
            list.add(e.submit(new exTest("2")));
            e.shutdown();
            list.add(e.submit(new exTest("3")));
            for (Future<String> f : list) {
                System.out.println(f.get());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
