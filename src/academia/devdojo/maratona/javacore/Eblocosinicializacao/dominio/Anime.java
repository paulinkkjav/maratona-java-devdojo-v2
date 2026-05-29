package academia.devdojo.maratona.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
// 1 - Alocado em espaço de memoria pro objeto
    //  2- cada atributo de classe e criado e inicializado com valores default ou que for passado
    // 3 - bloco de inicialização é executado
    // 4 - construtor é inciado


    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[150];
        for (int i = 0; i < episodios.length; i++)
            episodios[i] = i + 1;
    }

    public Anime(String nome) {
        this.nome = nome;


    }

    public Anime() {
        episodios = new int[150];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int eposidio : this.episodios) {
            System.out.print(eposidio + " ");

        }

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
