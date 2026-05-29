package academia.devdojo.maratona.javacore.Gassociacao.teste;

import academia.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador j1 = new Jogador("Paulo (PAI)");
        Jogador j2 = new Jogador("Júcelio (TIO)");
        Jogador j3 = new Jogador("Rony Rústico");
        Jogador j4 = new Jogador("Flaco López");
        Jogador [] jogadores = new Jogador[]{j1,j2,j3,j4};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
