package academia.devdojo.maratona.javacore.Npolimorfismo.servico;

import academia.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
