package GOLDSE11.Lambda;

public class Bai5_4 {
    interface Sample {
        public int func(int i);
    }

    public static void main(String[] args) {
        Sample s1 = i -> i + i + 10;
        Sample s2 = i -> Integer.valueOf(i);
        Sample s3 = i -> 100;
        Sample s4 = i -> {
            throw new RuntimeException();
        };
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
    }
}
