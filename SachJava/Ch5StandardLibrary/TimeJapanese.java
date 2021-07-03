package Ch5StandardLibrary;

import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;

public class TimeJapanese {
    public static void main(String[] args) {
        var a = JapaneseDate.of(JapaneseEra.REIWA, 3, 6, 27);
        var b = JapaneseDate.of(JapaneseEra.HEISEI, 29, 12, 25);
        System.out.println(a);
        System.out.println(b);
        var df = DateTimeFormatter.ofPattern("Gy年MM月dd日");
        System.out.println(a.format(df));
    }
}