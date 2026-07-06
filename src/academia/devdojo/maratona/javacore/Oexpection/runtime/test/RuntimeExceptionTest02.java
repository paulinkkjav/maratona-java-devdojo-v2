package academia.devdojo.maratona.javacore.Oexpection.runtime.test;

public class RuntimeExceptionTest02 {
    static void main() {
        try {
        divisao(1, 0);
    }catch (IllegalArgumentException e) {
        e.printStackTrace();
    }
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido, não pode ser zero");
        }

       return a/b;
    }
}