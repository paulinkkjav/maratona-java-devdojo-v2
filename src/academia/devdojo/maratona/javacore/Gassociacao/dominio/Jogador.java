package academia.devdojo.maratona.javacore.Gassociacao.dominio;

public class Jogador {

    private String nome;
    private Time time;

    public void imprime(){
        System.out.print(this.nome);
        if (time != null){
            System.out.println(": Time - " + time.getNome());
        } else if (time == null) {
            System.out.println(" NÃO CADASTRADO ");

        }

    }
    public Jogador(String nome) {
        this.nome = nome;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
