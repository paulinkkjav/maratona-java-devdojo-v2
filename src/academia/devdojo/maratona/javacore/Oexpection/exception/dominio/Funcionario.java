package academia.devdojo.maratona.javacore.Oexpection.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{


    public void salvar() throws LoginInvalido , FileNotFoundException {
        System.out.println("Salvando funcionarios");
        }
    }
