package academia.devdojo.maratona.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeCanada = Locale.CANADA;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance(localeIT);
        nf[1] = NumberFormat.getInstance(localeJP);
        nf[2] = NumberFormat.getInstance(localeBR);
        nf[3] = NumberFormat.getInstance(localeCanada);

        double valor  = 12000.2130;
        for (NumberFormat numeroformat : nf) {
            System.out.println(numeroformat.getMaximumFractionDigits());
            System.out.println(numeroformat.format(valor));

        }
        String valorString = "12000.2130";
        try {
            System.out.println(nf[2].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
