package academia.devdojo.maratona.introducao;

public class DevDojoTernario {
    public static void main(String[] args) {

        double salario = 5000;

        double doacao = salario > 5000 ? salario * 0.05 : salario * 0.01;
        String resultado = salario > 5000 ? "Vou doar 5% do meu salário para caridade"
                : "Vou doar apenas 1 % do meu salário para caridade";


        System.out.println(resultado);
        System.out.println("Valor da doação: " + doacao);
    }
}