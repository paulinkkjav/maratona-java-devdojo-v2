package academia.devdojo.maratona.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime local = LocalTime.of(12, 20, 30);
        System.out.println(LocalTime.now());
        System.out.println(local);
        System.out.println(LocalTime.of(14,20, 30));
        System.out.println(local.get(ChronoField.HOUR_OF_DAY));
        System.out.println(local.get(ChronoField.MINUTE_OF_DAY));
        System.out.println(local.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(local.get(ChronoField.SECOND_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
