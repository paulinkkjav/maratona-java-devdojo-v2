package academia.devdojo.maratona.javacore.Oexpection.error.teste;

public class StackOverflowTest01 {
    public static void main(String[] args) {
recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
