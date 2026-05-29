package academia.devdojo.maratona.introducao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OlaDevDojo21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Qual a sua idade? ");

            try {
                idade = input.nextInt();
                entradaValida = true; // ele não ensinou try ainda mas eu já sei

            } catch (InputMismatchException e) {
                System.out.println("❌ Digite apenas números inteiros!");
                input.nextLine();
            }
        }

        boolean IsAutorizadoComprarBebida = idade >= 18;

        if (IsAutorizadoComprarBebida) {
            System.out.println("Você tem a idade necessária para comprar bebidas!");
        } else {
            System.out.println("Você é menor de idade e não pode comprar bebidas!");
            System.out.println("Faltam " + (18 - idade) + " anos para comprar bebidas!");
        }
    }
}