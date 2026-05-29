package academia.devdojo.maratona.javacore.Bintroduçãometodos.teste;

import academia.devdojo.maratona.javacore.Bintroduçãometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

funcionario.setNome("Paulo");
funcionario.setIdade(17);
funcionario.setSalarios(new double []{1234,3000, 500, 2134});
funcionario.impressora();

        System.out.println("-----------------");
        System.out.println(funcionario.getMedia());
    }
}
