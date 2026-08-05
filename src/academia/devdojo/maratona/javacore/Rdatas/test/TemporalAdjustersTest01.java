package academia.devdojo.maratona.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withMonth(12).withDayOfMonth(1).withYear(2017);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());







    }
}
