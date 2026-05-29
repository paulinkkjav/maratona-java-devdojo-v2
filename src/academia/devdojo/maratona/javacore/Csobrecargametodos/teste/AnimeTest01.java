package academia.devdojo.maratona.javacore.Csobrecargametodos.teste;

import academia.devdojo.maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

   Anime anime = new Anime();

   anime.inicializacao("Naruto", "Shonen", 500);
   anime.inicializacao("Dragon ball", "TV ABERTA", 50, "Shonen");
   anime.imprime();
    }

}
