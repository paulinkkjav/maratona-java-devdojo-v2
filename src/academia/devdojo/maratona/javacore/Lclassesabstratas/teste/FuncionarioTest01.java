package academia.devdojo.maratona.javacore.Lclassesabstratas.teste;

import academia.devdojo.maratona.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academia.devdojo.maratona.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jucélio", 10000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Fpzin", 9000);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Paulo", 9000);
        Desenvolvedor desenvolvedor3 = new Desenvolvedor("Choose" ,  15000);
        System.out.println(gerente);
        System.out.println(desenvolvedor1);
        System.out.println(desenvolvedor2);
        System.out.println(desenvolvedor3);
        gerente.imprime();
        desenvolvedor1.imprime();
    }
}