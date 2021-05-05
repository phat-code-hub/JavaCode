package NIO2;

import java.io.*;

public class Bai9_4 {
    public static void main(String[] args) {
        String file = "test.bin";
        try (OutputStream fos = new FileOutputStream(file); InputStream fis = new FileInputStream(file);) {
            byte[] buf = { (byte) 1, (byte) 2, (byte) 3, (byte) 4 };
            fos.write(buf);
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print(i);
            }
        } catch (IOException e) {
            System.err.println(e.getClass());
        }

    }
}
