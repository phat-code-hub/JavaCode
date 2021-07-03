package Ch5StandardLibrary;

import java.time.*;

public class TimeBetween {
    public static void main(String[] args) {
        var dt1 = LocalDateTime.of(2021, 6, 27, 0, 0, 0);
        var dt2 = LocalDateTime.of(2018, 10, 5, 10, 20, 30);
        var period = Period.between(dt2.toLocalDate(), dt1.toLocalDate());
        var duration = Duration.between(dt2, dt1);
        System.out.println("この日付の差：" + period.getYears() + "年間" + period.getMonths() + "ヵ月" + period.getDays() + "日間");
        System.out.println("時間の差: " + duration.toHours() + "時間");
    }

}
