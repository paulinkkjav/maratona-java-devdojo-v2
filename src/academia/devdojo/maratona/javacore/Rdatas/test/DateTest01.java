package academia.devdojo.maratona.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1783426252409L); // trabalha com long e representa milissegundo desde 1 de janeiro de 1970
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);

    }
}
