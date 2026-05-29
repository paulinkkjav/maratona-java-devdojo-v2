package academia.devdojo.maratona.javacore.Bintroduçãometodos.teste;

import academia.devdojo.maratona.javacore.Bintroduçãometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Calculadora calculadora2 = new Calculadora();

      double resultado =  calculadora.divideDoisNumeros(10, 2);
      System.out.println(resultado);

        calculadora2.imprimeDivisaoDeDoisNumeros(10 , 2);

    }
}
