package Anotation;

@interface Customer {
    String name();

    String type() default "visitor";
}

// @Customer(name="Phat");
// Customer(name="Thuy", type ="visitor");
public class Bai2_4 {
    public static void main(String[] args) {
        System.out.println("Anotation!");
    }
}
