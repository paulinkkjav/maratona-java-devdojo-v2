package academia.devdojo.maratona.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[]args){
        LocalDate date = LocalDate.now();
        String f1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String f2 = date.format(DateTimeFormatter.ISO_DATE);
        String f3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        LocalDate parse1 = LocalDate.parse("20260722", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);
        //dd mm yyyy
        //mm dd yyyy
        DateTimeFormatter formaterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatbr = LocalDate.now().format(formaterBrasil);
        System.out.println(formatbr);
        LocalDate parseBr = LocalDate.parse("22/07/2026", formaterBrasil);
        System.out.println(parseBr);

        DateTimeFormatter FormatterGr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.ENGLISH);
        String formatGR = LocalDate.now().format(FormatterGr);
        System.out.println(formatGR);



    }
}
