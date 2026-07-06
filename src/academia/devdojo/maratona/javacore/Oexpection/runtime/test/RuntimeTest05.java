package academia.devdojo.maratona.javacore.Oexpection.runtime.test;

public class RuntimeTest05 {
    static void main(String[] args) {
        System.out.println(divisao(1,0   ));
    }
    private static double divisao(double a, double b){
        double divisaototal = a / b;
        if (b == 0){
            throw new ArithmeticException("Não é possível dividir por zero");
        }

return divisaototal;

    }
}
