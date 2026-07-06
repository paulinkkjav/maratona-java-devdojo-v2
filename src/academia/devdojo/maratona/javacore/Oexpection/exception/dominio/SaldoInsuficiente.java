package academia.devdojo.maratona.javacore.Oexpection.exception.dominio;

public class SaldoInsuficiente extends Exception {
    public SaldoInsuficiente() {
    super("Saldo insuficiente");
    }

    public SaldoInsuficiente(String message) {
        super(message);
    }
}
