package br.com.farchettiensis.marombada;

public abstract class Usuario {
    private String nome;
    private int idade;
    boolean ativo;

    public Usuario(String nome, int idade, boolean ativo) {
        this.nome = nome;
        this.idade = idade;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public abstract void exibirDetalhes();
}
