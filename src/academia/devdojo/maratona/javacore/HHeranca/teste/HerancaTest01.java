package academia.devdojo.maratona.javacore.HHeranca.teste;

import academia.devdojo.maratona.javacore.HHeranca.dominio.Endereco;
import academia.devdojo.maratona.javacore.HHeranca.dominio.Funcionario;
import academia.devdojo.maratona.javacore.HHeranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 8");
        endereco.setCep("023456-294");

        Pessoa pessoa = new Pessoa("João");
        pessoa.setCpf("123.456.789-00");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Paulo");

        funcionario.setSalario(2500);
        funcionario.setCpf("123.456.798-00");
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
