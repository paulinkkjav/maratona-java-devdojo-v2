package academia.devdojo.maratona.javacore.Oexpection.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar()throws LoginInvalido , FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
