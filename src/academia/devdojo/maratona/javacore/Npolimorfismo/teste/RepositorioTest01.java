package academia.devdojo.maratona.javacore.Npolimorfismo.teste;

import academia.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;
import academia.devdojo.maratona.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
     static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

         List list = new ArrayList();
         list.add("Goku");
         list.add("Naruto");
         list.add("Ichigo");
         list.add("Luffy");
         System.out.println(list);
    }
}
