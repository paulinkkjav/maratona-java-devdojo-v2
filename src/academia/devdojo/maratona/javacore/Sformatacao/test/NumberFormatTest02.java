package academia.devdojo.maratona.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeCanada = Locale.CANADA;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance(localeIT);
        nf[1] = NumberFormat.getCurrencyInstance(localeJP);
        nf[2] = NumberFormat.getCurrencyInstance(localeBR);
        nf[3] = NumberFormat.getCurrencyInstance(localeCanada);

        double valor  = 12000.2130;
        for (NumberFormat numeroformat : nf) {
            System.out.println(numeroformat.getMaximumFractionDigits());
            System.out.println(numeroformat.format(valor));

        }
        String valorString = "￥12,000\n";
        try {
            double resultado = nf[1].parse(valorString).doubleValue();
            System.out.println("Parse Worked + " + resultado);
        } catch (ParseException e) {
            e.printStackTrace();
        }




    }
}
