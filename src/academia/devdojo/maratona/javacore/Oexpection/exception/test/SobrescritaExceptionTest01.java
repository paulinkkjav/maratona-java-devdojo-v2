package academia.devdojo.maratona.javacore.Oexpection.exception.test;

import academia.devdojo.maratona.javacore.Oexpection.exception.dominio.Funcionario;
import academia.devdojo.maratona.javacore.Oexpection.exception.dominio.LoginInvalido;
import academia.devdojo.maratona.javacore.Oexpection.exception.dominio.Pessoa;

import java.io.FileNotFoundException;


public class SobrescritaExceptionTest01 {
    public static void main(String[] args)  {
        Pessoa p1 = new Pessoa();
        Funcionario f1 = new Funcionario();
    try {
        p1.salvar();
    } catch (FileNotFoundException | LoginInvalido e) {
        e.printStackTrace();
    }
        try {
            f1.salvar();
        } catch (LoginInvalido | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
