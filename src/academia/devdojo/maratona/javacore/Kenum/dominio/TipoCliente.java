package academia.devdojo.maratona.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1 ,  "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private final int valor;
    private final String nomeRelatorio;
    TipoCliente(int valor , String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    public static TipoCliente tipoClientePorRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : TipoCliente.values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
return null;


   }
    public int getVALOR() {
        return valor;
    }
    public String getNomeRelatorio(){
        return nomeRelatorio;
    }

}
