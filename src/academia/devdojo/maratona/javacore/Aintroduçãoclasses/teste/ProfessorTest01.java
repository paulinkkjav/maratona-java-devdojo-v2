package academia.devdojo.maratona.javacore.Aintroduçãoclasses.teste;

import academia.devdojo.maratona.javacore.Aintroduçãoclasses.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor1 = new Professor();

        professor1.nome = "Carolina Souza Silva";
        professor1.sexo = 'F';
        professor1.disciplina = "Física";
        professor1.idade = 31;
        professor1.salario = 5000.00;

        System.out.println("Nome do Profesor - " + professor1.nome);
        System.out.println("Sexo - " + professor1.sexo);
        System.out.println("Disciplina a qual leciona - " + professor1.disciplina);
        System.out.println("Idade do Professor - " + professor1.idade);
        System.out.println("Salário - " + professor1.salario);


    }
}
