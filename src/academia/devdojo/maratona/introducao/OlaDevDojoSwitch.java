package academia.devdojo.maratona.introducao;

import java.util.Scanner;

public class OlaDevDojoSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diadasemana = 0;


        System.out.println("Digite um número de 1 a 7 e veja qual dia da semana representa esse número!");
        diadasemana = sc.nextInt();

        switch (diadasemana) {

            case 1:
                System.out.println("O número 1 representa Domingo!");
                break;
            case 2:
                System.out.println("O número 2 representa a segunda!");
                break;
            case 3:
                System.out.println("O número 3 representa a terça-feira!");
                break;
            case 4:
                System.out.println("O número 4 representa a quarta-feira");
                break;
            case 5:
                System.out.println("O número 5 representa a quinta-feira!");
                break;
            case 6:
                System.out.println("O número 6 representa a sexta-feira!");
                break;
            case 7:
                System.out.println("O número 7 representa o sábado! ");
                break;

            default:
                System.out.println("Não é um número valído, digite outro número");

        }


    }
}
