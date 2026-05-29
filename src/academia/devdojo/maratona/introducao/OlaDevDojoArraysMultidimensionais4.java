package academia.devdojo.maratona.introducao;

public class OlaDevDojoArraysMultidimensionais4 {

    public static void main(String[] args) {


        int[][] ArrayI = new int[3][];
        int[] ArrayTeste = new int[]{1, 2, 3, 4, 5, 6};

        ArrayI[0] = new int[2];
        ArrayI[1] = new int[3];
        ArrayI[2] = ArrayTeste;

        int[][] ArrayTesteV2 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10, 11}};


        for (int[] ArrayBase : ArrayTesteV2) {
            System.out.println("\n/////////////////");
            for (int num : ArrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}

