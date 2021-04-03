package GOLDSE11.Stream;

import java.util.*;
import java.util.stream.*;

class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }
}

public class Bai6_3 {
    public static void main(String[] args) {
        List<Book> b = Arrays.asList(new Book("Platium"), new Book("Gold"), new Book("Silver"));
        Stream<Book> st = b.stream();
        st.map(bb -> bb.title).forEach(s -> System.out.println("Ten: " + s));
    }
}
