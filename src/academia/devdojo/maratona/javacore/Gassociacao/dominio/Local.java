package academia.devdojo.maratona.javacore.Gassociacao.dominio;

public class Local {
    private String Endereço;

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public Local(String endereço) {
        Endereço = endereço;
    }
}
