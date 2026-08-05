package academia.devdojo.maratona.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String []args){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime nowTime = LocalTime.now();
        LocalTime nowMinusrTenHours = LocalTime.now().minusHours(10);
        System.out.println(now);
        System.out.println(nowAfterTwoYears);
        System.out.println(nowTime);
        System.out.println(nowMinusrTenHours);
        Duration d1 = Duration.between(now , nowAfterTwoYears);
        Duration d2 = Duration.between(nowTime , nowMinusrTenHours);
        Duration d3 = Duration.between(Instant.now() , Instant.now().plusSeconds(999));
        Duration d4 = Duration.ofDays(3);
        Duration d5 = Duration.ofMinutes(100);
        Duration d6 = Duration.of(7, ChronoUnit.DAYS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
}
