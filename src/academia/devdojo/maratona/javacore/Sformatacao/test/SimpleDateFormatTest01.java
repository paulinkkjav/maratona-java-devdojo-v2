package academia.devdojo.maratona.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy G 'at' HH:mm:ss z";
        String pattern2 = "'United States' MMMM  dd,  yyyy";
        String pattern3 = "'Brazil' dd 'de' MMMM 'de' yyyy";
        Locale localeEUA = new Locale("en", "US");
        SimpleDateFormat sdf = new SimpleDateFormat(pattern2,localeEUA);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("United States July  10,  2026")); //control p
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
