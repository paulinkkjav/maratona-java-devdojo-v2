package academia.devdojo.maratona.javacore.Npolimorfismo.teste;

import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;
import academia.devdojo.maratona.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("I7 12450H" , 2000);
   Tomate tomate = new Tomate("Tomate Siciliano" , 10);
   tomate.setDataDeValidade("20/10/2026");

   CalculadoraImposto.calcularImposto(tomate);



    }
}