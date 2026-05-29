package academia.devdojo.maratona.javacore.Aintroduçãoclasses.teste;

import academia.devdojo.maratona.javacore.Aintroduçãoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.Nome = "Civic";
        carro1.Modelo = "Honda";
        carro1.cor = "Vermelho";
        carro1.ano = 2021;


        carro2.Nome ="Ford";
        carro2.Modelo = "Audi";
        carro2.cor = "Vermelho";
        carro2.ano = 2026;

        carro1 = carro2;


        System.out.println("Nome do Carro: " + carro1.Nome);
        System.out.println("Modelo do Carro: " + carro1.Modelo);
        System.out.println("Cor do Carro: " + carro1.cor);
        System.out.println("Ano do Carro: " + carro1.ano);

        System.out.println("-----------------------------");

        System.out.println("Nome do Carro: " + carro2.Nome);
        System.out.println("Modelo do Carro: " + carro2.Modelo);
        System.out.println("Cor do Carro: " + carro2.cor);
        System.out.println("Ano do Carro: " + carro2.ano);


    }
}
