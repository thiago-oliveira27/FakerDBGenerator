package classes;

public class Selecao {
    String nome;
    Figurinha[] jogadores;
    String tecnico;

    Selecao(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Figurinha[] getJogadores() {
        return this.jogadores;
    }

    public void setJogadores(Figurinha[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

}