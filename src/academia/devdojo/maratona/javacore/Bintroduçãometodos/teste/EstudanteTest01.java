package academia.devdojo.maratona.javacore.Bintroduçãometodos.teste;

import academia.devdojo.maratona.javacore.Bintroduçãometodos.dominio.Estudante;
import academia.devdojo.maratona.javacore.Bintroduçãometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new  ImpressoraEstudante();
        estudante01.nome = "Felipe";
        estudante01.idade = 20;
        estudante01.sexo = 'M';


        estudante02.nome = "Paulo";
        estudante02.idade = 21;
        estudante02.sexo = 'M';

            impressora.imprime(estudante01);
            impressora.imprime(estudante02);


    }
}
