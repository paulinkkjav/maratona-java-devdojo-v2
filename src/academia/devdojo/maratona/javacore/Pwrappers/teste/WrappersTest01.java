package academia.devdojo.maratona.javacore.Pwrappers.teste;

public class WrappersTest01 {
    public static void main(String[] args) {


        byte byteP = 1;
        short shortP = 2;
        int intP = 3;
        long longP = 4L;
        float floatP = 5F;
        double doubleP = 6D;
        char charP = 'C';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 2;
        Integer intW = 3; // - > AutoBoxing/Boxing - é quando voce tem um tipo primitivo e o java faz a conversao pra um wrapper
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6D;
        Character charW = 'C';
        Boolean booleanW = false;

        intP = intW; // - > Unboxing -> de tipo wrapper pra tipo primitivo
        Integer intW2 = Integer.parseInt("0");
        Boolean booleanW2 = Boolean.parseBoolean("TrUe");
        System.out.println(booleanW2);
        System.out.println(Character.getNumericValue('8') + 1);
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.getNumericValue('l'));
        }

}