package academia.devdojo.maratona.javacore.Gassociacao.teste;

import academia.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;
import academia.devdojo.maratona.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Fernandinho");
        Jogador jogador2 = new Jogador("Paulinho");
        Time time = new Time("Rolim de Moura Esporte Clube");
        Jogador[] jogadores = {jogador1, jogador2};
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("--- Jogador ---");
        jogador1.imprime();
        System.out.println("--- Jogador ---");
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
