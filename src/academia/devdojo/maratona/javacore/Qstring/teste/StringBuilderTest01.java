package academia.devdojo.maratona.javacore.Qstring.teste;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Paulo";
        nome.concat(" Silva");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Paulo");
        sb.append(" João Pocoyo Kokimoto");
        System.out.println(sb);
    }
}
