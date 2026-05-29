package academia.devdojo.maratona.javacore.Aintroduçãoclasses.teste;

import academia.devdojo.maratona.javacore.Aintroduçãoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Stephanie";
        estudante.idade = 16;
        estudante.sexo = 'F';


        System.out.println("Nome: " + estudante.nome);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("Idade: " + estudante.idade);
    }
}
