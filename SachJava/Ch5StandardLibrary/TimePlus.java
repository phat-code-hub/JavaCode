package Ch5StandardLibrary;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimePlus {
    public static void main(String[] args) {
        var d = LocalDate.of(2021, 1, 10);
        System.out.println(d);
        System.out.println(d.plus(3, ChronoUnit.YEARS));
        System.out.println(d.minus(21, ChronoUnit.DAYS));
    }
}
