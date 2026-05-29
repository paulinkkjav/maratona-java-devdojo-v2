package academia.devdojo.maratona.javacore.Bintroduçãometodos.teste;

import academia.devdojo.maratona.javacore.Bintroduçãometodos.dominio.Estudante;
import academia.devdojo.maratona.javacore.Bintroduçãometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {


        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        estudante01.nome = "Felipe";
        estudante01.idade = 20;
        estudante01.sexo = 'M';


        estudante02.nome = "Paulo";
        estudante02.idade = 21;
        estudante02.sexo = 'M';


        estudante01.imprime();
        estudante02.imprime();


    }


    }
