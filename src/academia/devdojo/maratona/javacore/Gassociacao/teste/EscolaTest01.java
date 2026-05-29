package academia.devdojo.maratona.javacore.Gassociacao.teste;

import academia.devdojo.maratona.javacore.Gassociacao.dominio.Escola;
import academia.devdojo.maratona.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Carol");
        Professor professor2 = new Professor("Celso");
        Professor [] professores = {professor1 , professor2};

        Escola escola = new Escola("Clarice Lispector", professores);

        escola.imprime();


    }
}
