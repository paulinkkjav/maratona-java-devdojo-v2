package academia.devdojo.maratona.introducao;

import java.rmi.UnexpectedException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OlaDevDojoSwitchExercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte diadasemana = 0;
        boolean EscolhaValida = false;

        do {


            System.out.println("Digite um número entre 1-7 (Considerando 1 como domingo) e veja se é um dia útil ou um fim de semana");
            diadasemana = (byte) sc.nextInt();


            switch (diadasemana) {

                case 1:
                    System.out.println("Hoje é DOMINGO e é FIM DE SEMANA! 😄");
                    EscolhaValida = true;
                    break;
                case 2:
                    System.out.println("Hoje é SEGUNDA-FEIRA e é um dia útil 😢");
                    break;
                case 3:
                    System.out.println("Hoje é TERÇA-FEIRA e é um dia útil 😢");
                    break;
                case 4:
                    System.out.println("Hoje é QUARTA-FEIRA e é um dia útil 😢");
                    break;
                case 5:
                    System.out.println("Hoje é QUINTA-FEIRA e é um dia útil 😢");
                    break;
                case 6:
                    System.out.println("Hoje é SEXTA-FEIRA e é um dia útil 😢");
                    break;
                case 7:
                    System.out.println("Hoje é SÁBADO e é FIM DE SEMANA! 😄");
                    break;

                default:
                    System.out.println("Número invalido! Tente um número entre 1 - 7 !");
            }
        } while (!EscolhaValida);


        // ou oque tambem pode ser feito

//       switch (diadasemana){
//
//           case 1 , 7:
//               System.out.println("FIM DE SEMANA!😄");
//               break;
//           case 2,3,4,5,6:
//               System.out.println("É UM DIA ÚTIL!😢");
//           default -> throw new InputMismatchException("Valor inesperado" + diadasemana);
//       }


    }
}
