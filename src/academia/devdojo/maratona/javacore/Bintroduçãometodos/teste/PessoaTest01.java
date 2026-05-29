package academia.devdojo.maratona.javacore.Bintroduçãometodos.teste;

import academia.devdojo.maratona.javacore.Bintroduçãometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("PAULO");
        pessoa.setidade(17);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());



    }
}
