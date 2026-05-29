package academia.devdojo.maratona.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização estático é executado quando a classe é carregada, ou seja, antes da criação de qualquer objeto
    // 1 - Alocado em espaço de memória pro objeto
    //  2- cada atributo de classe e criado e inicializado com valores default ou que for passado
    // 3 - bloco de inicialização é executado
    // 4 - construtor é inciado


    static {
        System.out.println("Dentro do bloco de inicialização estático");
        episodios = new int[150];
        for (int i = 0; i < episodios.length; i++)
            episodios[i] = i + 1;
    }
        {
            System.out.println("Dentro do bloco de inicialização não estático");
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
        for (int eposidio : Anime.episodios) {
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
