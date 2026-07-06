package academia.devdojo.maratona.javacore.Qstring.teste;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Goku";
        String numeros = "012345";
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.replace("k", "c"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(1, 4));
        System.out.println(numeros.substring(0));
        System.out.println(nome.trim());
    }
}
