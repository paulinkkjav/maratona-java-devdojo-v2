package academia.devdojo.maratona.javacore.Gassociacao.teste;

import academia.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;
import academia.devdojo.maratona.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador j1 = new Jogador("Paulo (PAI)");
        Time time = new Time("Rolim de Moura Esporte Clube");
        j1.setTime(time);
        j1.imprime();
        Jogador j2 = new Jogador("Júcelio (TIO)");
        j2.setTime(time);
        j2.imprime();
        Jogador j3 = new Jogador("Fernandinho");
        j3.setTime(time);
        j3.imprime();
    }
}
