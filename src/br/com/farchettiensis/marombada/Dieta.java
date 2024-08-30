package br.com.farchettiensis.marombada;

import java.util.ArrayList;
import java.util.List;

public class Dieta {
    private DiaDaSemana diaDaSemana;
    private final List<Refeicao> refeicoes;

    public Dieta(DiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
        this.refeicoes = new ArrayList<>();
    }

    public DiaDaSemana getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public void adicionarRefeicao(Refeicao refeicao) {
        refeicoes.add(refeicao);
    }

    public void removerRefeicao(Refeicao refeicao) {
        refeicoes.remove(refeicao);
    }

    public Refeicao getRefeicaoPorTipo(RefeicaoTipo refeicaoTipo) {
        for (Refeicao refeicao : refeicoes) {
            if (refeicao.getRefeicao() == refeicaoTipo) {
                return refeicao;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Dia da semana: %s%n", this.diaDaSemana));
        sb.append(String.format("Plano alimentar:%n"));
        for (int i = 0; i < refeicoes.size(); i++) {
            sb.append(String.format("%d. %s%n", i + 1, refeicoes.get(i)));
        }
        return sb.toString();
    }
}
