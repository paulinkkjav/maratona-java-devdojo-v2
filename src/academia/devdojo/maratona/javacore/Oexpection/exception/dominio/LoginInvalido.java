package academia.devdojo.maratona.javacore.Oexpection.exception.dominio;


public class LoginInvalido extends Exception {
    public LoginInvalido() {
        super("Login invalido");
    }

    public LoginInvalido(String message) {
        super(message);
    }
}
