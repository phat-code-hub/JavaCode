package Exception;

class Test implements AutoCloseable {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public void close() {
        System.out.println(this.name + " close ");
    }

}

public class Bai3_9 {

    public static void main(String[] args) {
        try (Test t1 = new Test("A"); Test t2 = new Test("B");) {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
