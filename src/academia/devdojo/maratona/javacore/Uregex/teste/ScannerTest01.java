package academia.devdojo.maratona.javacore.Uregex.teste;

public class ScannerTest01 {
    public static void main(String[]args){

        String texto= "Paulo Felipe Joao Jucelio true 200";

        String[] nomes = texto.split(" ");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }


    }
}
