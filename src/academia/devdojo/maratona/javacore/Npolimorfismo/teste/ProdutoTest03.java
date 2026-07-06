package academia.devdojo.maratona.javacore.Npolimorfismo.teste;

import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Mesa;
import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academia.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {

    Produto produto = new Computador("I7 12450H" , 2000);
    Produto produto2 = new Tomate("Tomate Siciliano" , 10);
    Produto produto3 = new Mesa("Porcelana" , 1200);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("--------------------------------");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("------------------------------");
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.calcularImposto());
        


    }
}