package academia.devdojo.maratona.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate data = LocalDate.parse("2027-09-20");
        LocalTime time = LocalTime.parse("12:30:17");
        System.out.println(ldt);
        System.out.println(data);
        System.out.println(data.lengthOfMonth());
        System.out.println(time);
        System.out.println(data.atTime(time));

        
    }
}
