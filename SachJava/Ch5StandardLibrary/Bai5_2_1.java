package Ch5StandardLibrary;

import java.util.regex.*;

public class Bai5_2_1 {
    public static void main(String[] args) {
        var str = "住所は〒160-0000 新宿区南町0-0-0です。" + "\nあなたの住所は〒210-9999 川崎市北町1-1-1ですね。";
        System.out.println(str);
        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}");
        var mat = pattern.matcher(str);
        while (mat.find()) {
            System.out.println(mat.group());
        }
        ;

    }
}