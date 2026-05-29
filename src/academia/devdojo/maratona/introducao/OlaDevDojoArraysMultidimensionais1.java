package academia.devdojo.maratona.introducao;

import java.util.ArrayList;

public class OlaDevDojoArraysMultidimensionais1 {
    public static void main(String[] args) {
        //1 , 2, 3, 4 ,5 meses
        // 29 , 30 ,31 dias

        int [][] Meses  = new int[3][3];
        Meses [0][0] = 31;
        Meses [0][1] = 28;
        Meses [0][2] = 31;

        Meses [1][0] = 31;
        Meses [1][1] = 28;
        Meses [1][2] = 31;

        Meses [2][0] = 31;
        Meses [2][1] = 28;
        Meses [2][2] = 31;


        for (int i = 0; i < Meses.length; i++) {
            for (int j = 0; j < Meses[i].length; j++) {
                System.out.println(Meses[i][j]);
            }
        }
        for (int arraybase []: Meses) {
            for (int numero : arraybase) {
                System.out.println(numero);
            }
        }

    }
}
