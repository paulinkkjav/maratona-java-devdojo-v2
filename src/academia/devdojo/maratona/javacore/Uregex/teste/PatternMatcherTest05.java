package academia.devdojo.maratona.javacore.Uregex.teste;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // 1.3 = 123, 133, 132, 103, 1@3


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z]+)+";
        String texto = "Goku@hotmail.com , paulao@hotmail.com , 1238Kaka@imaiel.com, teste@gmail, eu@mail";
        System.out.println(Arrays.toString(texto.split(",")));
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