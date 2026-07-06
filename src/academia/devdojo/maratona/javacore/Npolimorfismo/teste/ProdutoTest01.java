package academia.devdojo.maratona.javacore.Npolimorfismo.teste;

import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Televisao;
import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;
import academia.devdojo.maratona.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("AcerNitro5" , 10000);
        Tomate tomate = new Tomate("Tomate Pachino", 10);
        Televisao televisao = new Televisao("LG 50 polegadas", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("______X______X_______X_______x");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("______X______X_______X_______x");
        CalculadoraImposto.calcularImposto(televisao);


    }
}
