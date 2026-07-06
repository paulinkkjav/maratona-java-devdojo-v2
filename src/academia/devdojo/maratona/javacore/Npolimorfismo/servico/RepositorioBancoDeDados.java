package academia.devdojo.maratona.javacore.Npolimorfismo.servico;

import academia.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando dados no banco de dados");
    }
}
