package academia.devdojo.maratona.javacore.Oexpection.exception.test;


import academia.devdojo.maratona.javacore.Oexpection.exception.dominio.SaldoInsuficiente;

import java.util.Scanner;

public class SaldoInsuficienteTest01 {
    public static void main(String[] args) {
        try {
            contaBancaria();
        } catch (SaldoInsuficiente e) {
            e.printStackTrace();
        }

    }
    private static void contaBancaria() throws SaldoInsuficiente {
        String nomeDb = "Goku";
        String senhaDb = "123";
        double saldo = 10;
        double saque = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeDigitado = sc.nextLine();
        System.out.println("Digite seu senha: ");
        String senhaDigitado = sc.nextLine();
        if (!nomeDb.equals(nomeDigitado) || !senhaDb.equals(senhaDigitado)){
            throw new SaldoInsuficiente("Nome ou senha invalidos");
        }
        System.out.println("Bem vindo "+nomeDigitado + "Seu saldo disponivel é " + saldo);
        System.out.println("Qual valor do saque que voce deseja realizar? ");
        saque = sc.nextDouble();
        if (saque > saldo){
            throw new SaldoInsuficiente("Saldo insuficiente");
        }
        System.out.println("Saque realizado com sucesso! Seu saldo atual é " + (saldo - saque) + " reais");
        }


    }


