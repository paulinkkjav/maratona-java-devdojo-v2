package academia.devdojo.maratona.javacore.Uregex.teste;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        String regex = "ul";
        String textoA = "uleululululululi";
        String textoB = "uliuleuliuluc";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textoA);
        System.out.println("texto " + textoA);
        System.out.println("indice: 012345678");
        System.out.println("regex " + regex);
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }


}