package academia.devdojo.maratona.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate data = LocalDate.of(2022, Month.DECEMBER, 25);
        LocalDate dataDeAgora = LocalDate.now();
        dataDeAgora = dataDeAgora.plusYears(80);
        System.out.println(data.getYear());
        System.out.println(data.getMonth());
        System.out.println(data.getMonthValue());
        System.out.println(data.getDayOfWeek());
        System.out.println(data.getDayOfMonth());
        System.out.println(data.lengthOfMonth());
        System.out.println(data.isLeapYear());
        System.out.println(data.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(data);
        System.out.println(dataDeAgora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }

}
