package academia.devdojo.maratona.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId asiaShangai = ZoneId.of("Asia/Shanghai");
        ZoneId africaHarare = ZoneId.of("Africa/Harare");

        System.out.println(asiaShangai);
        System.out.println(africaHarare);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(asiaShangai);
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime2 = now.atZone(africaHarare);
        System.out.println(zonedDateTime2);

        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.atZone(asiaShangai));
        System.out.println(instant.atZone(africaHarare));


        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset manaus = ZoneOffset.of("+4");
        ZoneOffset eucla = ZoneOffset.of("+8");

        OffsetDateTime offSetDayTime = now.atZone(manaus).toOffsetDateTime();
        OffsetDateTime offSetDayTime2 = now.atZone(eucla).toOffsetDateTime();

        System.out.println(offSetDayTime);
        System.out.println(offSetDayTime2);

        OffsetDateTime offsetDateTime = instant.atOffset(manaus);
        OffsetDateTime offsetDateTime2 = instant.atOffset(eucla);
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime2);

        JapaneseDate japao = JapaneseDate.from(LocalDate.now());
        System.out.println(japao);

        LocalDate era = LocalDate.of(2000, 12, 1);
        JapaneseDate japaoEra = JapaneseDate.from(era);
        System.out.println(japaoEra);
    }
    }
