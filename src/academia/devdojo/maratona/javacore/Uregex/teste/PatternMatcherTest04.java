package academia.devdojo.maratona.javacore.Uregex.teste;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for digito
        // \s = todos Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, Dígitos _ (exclui todos os caracteres especiais
        // \W = Tudo o que não for incluso no /w
        // [] Range [A-Za-z-A-C]
        //? Zero ou Uma Ocorrência
        // * Zero ou Mais
        // + uma, ou mais ocorrências
        // {n, m} de n até m//
        // ()
        // | o(v|c)o // ovo | oco
        // $ fim da linha


        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "0x 12 993 0x12 0x1G 0xAF";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto " + texto);
        System.out.println("indice: 012345678");
        System.out.println("regex " + regex);
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        int numeroHexadecimal = 0x186A0;
    }


}