package br.com.farchettiensis.marombada;

import java.util.ArrayList;
import java.util.List;

public class Refeicao {
    private RefeicaoTipo refeicao;
    private final List<Alimento> alimentos;

    public Refeicao(RefeicaoTipo refeicao) {
        this.refeicao = refeicao;
        this.alimentos = new ArrayList<>();
    }

    public RefeicaoTipo getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(RefeicaoTipo refeicao) {
        this.refeicao = refeicao;
    }

    public void adicionarAlimento(Alimento alimento) {
        this.alimentos.add(alimento);
    }

    public void removerAlimento(Alimento alimento) {
        this.alimentos.remove(alimento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Refeição: %s.%n%n", this.refeicao));
        for (int i = 0; i < alimentos.size(); i++) {
            sb.append(String.format("%d. %s%n", i + 1, alimentos.get(i)));
        }
        return sb.toString();
    }
}
