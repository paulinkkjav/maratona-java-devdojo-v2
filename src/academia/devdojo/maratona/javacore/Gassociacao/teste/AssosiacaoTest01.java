package academia.devdojo.maratona.javacore.Gassociacao.teste;

import academia.devdojo.maratona.javacore.Gassociacao.dominio.Aluno;
import academia.devdojo.maratona.javacore.Gassociacao.dominio.Local;
import academia.devdojo.maratona.javacore.Gassociacao.dominio.Professor;
import academia.devdojo.maratona.javacore.Gassociacao.dominio.Seminario;

public class AssosiacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Das Flores, 123");
        Aluno aluno1 = new Aluno("Paulo", 18);
        Aluno aluno2 = new Aluno("Mária", 19);
        Aluno[] alunosParaSeminario = {aluno1, aluno2};
        Professor professor = new Professor("Celso", "Java");
        Seminario seminario = new Seminario("Maratona Java", alunosParaSeminario, local);

        Seminario[] seminariosdisponiveis = {seminario};
        professor.setSeminario(seminariosdisponiveis);

        professor.imprime();




    }
}