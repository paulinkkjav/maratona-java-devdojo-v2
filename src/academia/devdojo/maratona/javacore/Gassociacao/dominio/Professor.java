package academia.devdojo.maratona.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }
    public void imprime(){
        System.out.println("----------------------------------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminario == null) return;
        System.out.println("**** Seminários Cadastrados ****");
            for (Seminario seminario : this.seminario) {
                System.out.println("Título do Seminário: " + seminario.getTitulo());
                System.out.println("Endereço do Seminário: " + seminario.getLocal().getEndereço());
                if (seminario.getAluno() == null || seminario.getAluno().length == 0) continue;
                System.out.println("-### ALUNOS ###-");
                for (Aluno aluno : seminario.getAluno()) {
                    System.out.println("Nome do Aluno: " + aluno.getNome());;
                    System.out.println("Idade do Aluno:" + aluno.getIdade());
                }

            }



    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    private Seminario[] seminario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
