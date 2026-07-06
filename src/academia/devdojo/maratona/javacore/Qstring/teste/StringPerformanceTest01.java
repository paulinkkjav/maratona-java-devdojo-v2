package academia.devdojo.maratona.javacore.Qstring.teste;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String - " + (fim - inicio) + "Ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder - " + (fim - inicio) + "Ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_0000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer - " + (fim - inicio) + "Ms");

    }


    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; //0,01 0,012 0,013
        }

    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder string = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            string.append(i);

        }

    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer string = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            string.append(i);
        }
    }
}
