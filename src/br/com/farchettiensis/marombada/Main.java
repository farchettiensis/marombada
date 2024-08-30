package br.com.farchettiensis.marombada;

public class Main {
    public static void main(String[] args) {
//        Atleta atleta1 = new Atleta("Donald Fagen", 76, true, "1");
//        atleta1.setAltura(1.85);
//        atleta1.setPeso(70.0);
//        atleta1.adicionarModalidade(Modalidade.MUSCULACAO);
//        atleta1.adicionarModalidade(Modalidade.NATACAO);
//
//        atleta1.exibirDetalhes();
//
//        atleta1.removerModalidade(Modalidade.NATACAO);
//
//        atleta1.exibirDetalhes();

        Alimento carvao = new Alimento("Carvão fresquinho", "1 pedacinho médio", 10.0, UnidadeMedida.G, "Mexer bem");
//        System.out.println(carvao);
//        System.out.println();
        Alimento gelatinaAtum = new Alimento("Gelatina de atum", "1 unidade", "Pode ser substituída por gelatina de frango");
//        System.out.println(gelatinaAtum);
//        System.out.println();
        Alimento aveia = new Alimento("Aveia", "2 colheres de sopa", 30.0, UnidadeMedida.G, "Misture com leite ou iogurte");
//        System.out.println(aveia);
//        System.out.println();

        Refeicao desjejum = new Refeicao(RefeicaoTipo.DESJEJUM);
        desjejum.adicionarAlimento(carvao);

        Refeicao cafeDaManha = new Refeicao(RefeicaoTipo.LANCHE_MANHA);
        cafeDaManha.adicionarAlimento(carvao);
        cafeDaManha.adicionarAlimento(gelatinaAtum);
        cafeDaManha.adicionarAlimento(aveia);
//        System.out.println(cafeDaManha);

        Refeicao almoco = new Refeicao(RefeicaoTipo.ALMOCO);
        almoco.adicionarAlimento(gelatinaAtum);

        Dieta dietaSegunda = new Dieta(DiaDaSemana.SEGUNDA);
        dietaSegunda.adicionarRefeicao(cafeDaManha);
        dietaSegunda.adicionarRefeicao(almoco);

//        System.out.println(dietaSegunda);

        Dieta dietaTerca = new Dieta(DiaDaSemana.TERCA);
        dietaTerca.adicionarRefeicao(desjejum);

        PlanoAlimentar plano1 = new PlanoAlimentar();
        plano1.adicionarDieta(DiaDaSemana.SEGUNDA, dietaSegunda);
        plano1.adicionarDieta(DiaDaSemana.TERCA, dietaTerca);

        System.out.println(plano1);
    }
}
