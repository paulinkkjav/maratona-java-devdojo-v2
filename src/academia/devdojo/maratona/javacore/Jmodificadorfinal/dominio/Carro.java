package academia.devdojo.maratona.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public final static double VELOCIDADE_LIMITE;
    public final Comprador COMPRADOR = new Comprador();

    static{
        VELOCIDADE_LIMITE = 250;
    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public Carro() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
