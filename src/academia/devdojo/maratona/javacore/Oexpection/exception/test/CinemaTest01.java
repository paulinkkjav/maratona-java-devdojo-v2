package academia.devdojo.maratona.javacore.Oexpection.exception.test;

import academia.devdojo.maratona.javacore.Oexpection.exception.dominio.MenorDeIdade;

import java.util.Scanner;

public class CinemaTest01 {
    public static void main(String[] args) {
        try {
            entrarCinema();
        } catch (MenorDeIdade e) {
            e.printStackTrace();
        }
    }
    private static void entrarCinema() throws MenorDeIdade {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme que você quer assistir: 1: IT A COISA , 2: Toy Story");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("Digite sua idade");
            idade = sc.nextInt();
            if(idade <18){
                throw new MenorDeIdade();
            }
            System.out.println("Você escolheu IT A COISA! Aproveite seu filme");
        }

        if(escolha == 2){
            System.out.println("Você escolheu Toy Story! Aproveite seu filme");
        }
        if (escolha != 1 && escolha != 2) {
            System.out.println("Opção inválida!");

        }
    }
}
