package academia.devdojo.maratona.javacore.Qstring.teste;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Paulao"; //String Constant pool
        String nome2 = "Lucas";
        nome = nome.concat(" Oliveira");
System.out.println(nome == nome2);
        System.out.println(nome );
        String nome3 = new String("Lucas"); // 1 variavel de referencia, 2 objetos do [tipo string , 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
