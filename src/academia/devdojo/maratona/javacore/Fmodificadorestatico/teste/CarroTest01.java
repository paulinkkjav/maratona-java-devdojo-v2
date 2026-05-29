package academia.devdojo.maratona.javacore.Fmodificadorestatico.teste;

import academia.devdojo.maratona.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Corolla", 180);
        Carro c3 = new Carro("Camry", 220);


        c1.impressora();
        c2.impressora();
        c3.impressora();


    }


}
