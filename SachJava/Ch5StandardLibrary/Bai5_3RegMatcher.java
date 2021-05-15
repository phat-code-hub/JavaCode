package Ch5StandardLibrary;

import java.util.regex.*;

public class Bai5_3RegMatcher {
    public static void main(String[] args) {
        var msg = "会社は0123-99-0000です。自宅は000-123-4567ですよ！";
        var ptn = Pattern.compile("(?<area>\\d{2,4})-(?<city>\\d{2,4})-(?<local>\\d{4})");
        var mat = ptn.matcher(msg);
        while (mat.find()) {
            System.out.println("マーチング文字列：　" + mat.group());
        }
    }
}
