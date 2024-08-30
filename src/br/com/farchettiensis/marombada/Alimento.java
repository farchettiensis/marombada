package br.com.farchettiensis.marombada;

public class Alimento {
    private String nome;
    private String medidaCaseira;
    private double quantidade;
    private UnidadeMedida unidade;
    private String observacoes;

    public Alimento(String nome, String medidaCaseira) {
        this.nome = nome;
        this.medidaCaseira = medidaCaseira;
    }

    public Alimento(String nome, String medidaCaseira, String observacoes) {
        this.nome = nome;
        this.medidaCaseira = medidaCaseira;
        this.observacoes = observacoes;
    }

    public Alimento(String nome, String medidaCaseira, double quantidade, UnidadeMedida unidade, String observacoes) {
        this.nome = nome;
        this.medidaCaseira = medidaCaseira;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMedidaCaseira() {
        return medidaCaseira;
    }

    public void setMedidaCaseira(String medidaCaseira) {
        this.medidaCaseira = medidaCaseira;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public UnidadeMedida getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeMedida unidade) {
        this.unidade = unidade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s.%nMedida caseira: %s.%nQuantidade: %.2f.%nUnidade: %s.%nObservações: %s.", nome, medidaCaseira, quantidade, unidade, observacoes);
    }
}
