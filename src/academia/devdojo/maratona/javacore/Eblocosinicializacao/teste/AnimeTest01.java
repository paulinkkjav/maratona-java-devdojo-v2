package academia.devdojo.maratona.javacore.Eblocosinicializacao.teste;

import academia.devdojo.maratona.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("goku");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
