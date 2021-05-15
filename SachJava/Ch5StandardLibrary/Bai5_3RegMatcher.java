package Ch5StandardLibrary;

import java.util.regex.*;

public class Bai5_3RegMatcher {
    public static void main(String[] args) {
        String msg = "会社は0123-99-0000です。自宅は000-123-4567ですよ！";
        Pattern ptn = Pattern.compile("(?<area>\\d{2,4})-(?<city>\\d{2,4})-(?<local>\\d{4})");
        Matcher mat = ptn.matcher(msg);
        while (mat.find()) {
            System.out.println("開始位置: " + mat.start());
            System.out.println("終了位置: " + mat.end());
            System.out.println("マーチング位置: " + mat.group());
            System.out.println("市街局番: " + mat.group("area"));
            System.out.println("市内局番: " + mat.group("city"));
            System.out.println("加入者番号: " + mat.group("local"));
            System.out.println("------------------------------");
        }
    }
}
