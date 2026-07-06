package academia.devdojo.maratona.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calculalDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calculalDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calculalDesconto(double valor);
}