package academia.devdojo.maratona.javacore.Oexpection.exception.test;


import academia.devdojo.maratona.javacore.Oexpection.exception.dominio.LoginInvalido;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalido e) {
        e.printStackTrace();
        }
    }
        private static void logar() throws LoginInvalido {
        Scanner teclado = new Scanner(System.in);
        String usuarioBD ="Goku";
        String senhaDB = "123";
            System.out.println("Usuario");
            String Username = teclado.nextLine();
            System.out.println("Senha");
            String Password = teclado.nextLine();
            if (!usuarioBD.equals(Username) || !Password.equals(senhaDB)){
          throw new LoginInvalido("Usuario ou senha invalido");
            }
            System.out.println("Logado com sucesso! Bem vindo de volta " + usuarioBD + "  😀");
        }
    }
