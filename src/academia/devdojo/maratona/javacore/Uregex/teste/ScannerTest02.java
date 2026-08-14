package academia.devdojo.maratona.javacore.Uregex.teste;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {

        String texto = "Paulo,Felipe,Joao,Jucelio,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i + " É um valor Inteiro");
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println(b + " É um valor booleano");
            } else {
                System.out.println(scanner.next());
            }

        }

    }

}
