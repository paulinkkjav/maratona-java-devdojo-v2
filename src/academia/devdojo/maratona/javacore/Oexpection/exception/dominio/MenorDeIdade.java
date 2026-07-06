package academia.devdojo.maratona.javacore.Oexpection.exception.dominio;

public class MenorDeIdade extends Exception {
    public MenorDeIdade() {
        super("Conteudo para maiores de 18! 🔞");
    }

    public MenorDeIdade(String message) {
        super(message);
    }
}
