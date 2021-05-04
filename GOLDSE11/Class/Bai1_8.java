package Class;

interface Test {
};

class Parent implements Test {
};

class Child extends Parent {
};

class Duke {
};

public class Bai1_8 {
    public static void main(String[] args) {
        Test t = new Child();
        new Child();
        new Duke();
        if (t instanceof Parent) {
            System.out.println("AAA");
        }
        if (t instanceof Test) {
            System.out.println("BBB");
        }
        // Error cannot change (cast) to Child Class
        // if (d instanceof Child) {
        // System.out.println("CCC");
        // }
    }
}
