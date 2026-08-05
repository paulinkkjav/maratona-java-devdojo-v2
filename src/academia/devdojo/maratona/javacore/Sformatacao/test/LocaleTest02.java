package academia.devdojo.maratona.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[]args ){
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String pais : isoCountries) {
            System.out.print(pais + " ");
        }
        System.out.println();

        for (String lingua : isoLanguages) {
            System.out.print(lingua + " ");
        }

    }
}
