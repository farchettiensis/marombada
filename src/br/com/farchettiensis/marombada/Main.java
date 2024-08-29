package br.com.farchettiensis.marombada;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Donald Fagen", 76, true, "1");
        atleta1.setAltura(1.85);
        atleta1.setPeso(70.0);
        atleta1.adicionarModalidade(Modalidade.MUSCULACAO);
        atleta1.adicionarModalidade(Modalidade.NATACAO);

        atleta1.exibirDetalhes();

        atleta1.removerModalidade(Modalidade.NATACAO);

        atleta1.exibirDetalhes();
    }
}
