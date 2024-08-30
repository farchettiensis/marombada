package br.com.farchettiensis.marombada;

import java.util.HashMap;
import java.util.Map;

public class PlanoAlimentar {
    private final Map<DiaDaSemana, Dieta> planoSemanal;

    public PlanoAlimentar() {
        this.planoSemanal = new HashMap<>();
    }

    public void adicionarDieta(DiaDaSemana diaDaSemana, Dieta dieta) {
        planoSemanal.put(diaDaSemana, dieta);
    }

    public void removerDieta(DiaDaSemana diaDaSemana) {
        planoSemanal.remove(diaDaSemana);
    }

    public void atualizarDieta(DiaDaSemana dia, Dieta dieta) {
        this.planoSemanal.put(dia, dieta);
    }

    public Dieta getDieta(DiaDaSemana dia) {
        return this.planoSemanal.get(dia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plano Alimentar Semanal:\n");
        for (DiaDaSemana day : DiaDaSemana.values()) {
            Dieta plano = planoSemanal.get(day);
            if (plano != null) {
                sb.append(day).append(":\n").append(plano).append("\n");
            } else {
                sb.append(day).append(": Não há plano\n");
            }
        }
        return sb.toString();
    }
}
