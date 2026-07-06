package academia.devdojo.maratona.javacore.Jmodificadorfinal.test;

import academia.devdojo.maratona.javacore.Jmodificadorfinal.dominio.Carro;
import academia.devdojo.maratona.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        carro.COMPRADOR.setNome("FPZIN");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari F40");
        ferrari.imprime();

    }
}
