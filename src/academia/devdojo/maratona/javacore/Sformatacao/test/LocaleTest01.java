package academia.devdojo.maratona.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {
        Locale localeItaly = Locale.ITALY;
        Locale localeBR = new Locale("pt", "br");
        Locale localeJapao = new Locale("ja", "jpa");
        Locale localeFranca= new Locale("fr", "fra");
        Locale localeAlemanha= new Locale("de", "ger");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeAlemanha);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeFranca);

        System.out.println("Brasil: "  + df1.format(calendar.getTime()));
        System.out.println("Italia: " + df2.format(calendar.getTime()));
        System.out.println("Japao: " + df3.format(calendar.getTime()));
        System.out.println("Franca: " + df4.format(calendar.getTime()));
        System.out.println("Alemanha: " + df5.format(calendar.getTime()));

        System.out.println(localeBR.getDisplayCountry(localeFranca));
        System.out.println(localeBR.getDisplayCountry(localeAlemanha));
        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeItaly.getDisplayName(localeFranca));
    }
}
