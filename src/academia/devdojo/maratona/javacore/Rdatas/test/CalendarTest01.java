package academia.devdojo.maratona.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        if(cal.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println(cal);
        cal.add(Calendar.DAY_OF_MONTH, 0);
        cal.add(Calendar.HOUR, -4);
        cal.roll( Calendar.HOUR, 4);
        date = cal.getTime();
        System.out.println(date);
    }
}
