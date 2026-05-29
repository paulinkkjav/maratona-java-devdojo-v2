package academia.devdojo.maratona.introducao;

public class OlaDevDojoExercicioBreak30 {
    public static void main(String[] args) {

        double ValorTotal = 30000;
        double C2;

        for (int parcela = (int)ValorTotal;parcela >= 1;parcela--) {

            double ValorParcela = ValorTotal / parcela;
            if (ValorParcela < 1000){
                continue;

            }
            System.out.println("PARCELAS: " + parcela + "R$" + ValorParcela);

        }
    }
}


//package academia.devdojo.maratona.introducao;
//
//public class OlaDevDojoExercicioBreak30 {
//    public static void main(String[] args) {
//
//        double ValorTotal = 3000;
//        double C2;
//
//        for (int parcela = 1; parcela <= ValorTotal; parcela++) {
//
//            double ValorParcela = ValorTotal / parcela;
//            if (ValorParcela < 1000){
//                break;
//
//
//
//            }
//            System.out.println("PARCELAS: " + parcela + "R$" + ValorParcela);
//
//        }
//    }
//}
