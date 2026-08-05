package academia.devdojo.maratona.javacore.Uregex.teste;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for digito
        // \s = todos Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, Dígitos _ (exclui todos os caracteres especiais
        // \W = Tudo o que não for incluso no /w

        String regex = "\\d";
        String textoA = "uleululululululi";
        String textoB = "papai123@#papa i123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textoB);
        System.out.println("texto " + textoB);
        System.out.println("indice: 012345678");
        System.out.println("regex " + regex);
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }


}