package academia.devdojo.maratona.javacore.HHeranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;


    {
        System.out.println("OI1 (Pessoa)");
    }
    static {
        System.out.println("OI2 (Pessoa)");
    }
    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("OI3 (Pessoa)");
    }
    public Pessoa(String nome, String cpf){
//        this(nome);
//        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + " - " + this.endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
