package academia.devdojo.maratona.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Nome do Anime : " +    this.nome;
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
