package br.com.farchettiensis.marombada;

import java.util.HashSet;
import java.util.Set;

public class Atleta extends Usuario {
    private double altura;
    private double peso;
    private String matricula;
    private final Set<Modalidade> modalidades;

    public Atleta(String nome, int idade, boolean ativo, String matricula) {
        super(nome, idade, ativo);
        this.matricula = matricula;
        this.modalidades = new HashSet<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void adicionarModalidade(Modalidade modalidade) {
        this.modalidades.add(modalidade);
    }

    public void removerModalidade(Modalidade modalidade) {
        if (this.modalidades.contains(modalidade)) {
            this.modalidades.remove(modalidade);
        } else {
            throw new IllegalArgumentException("Modalidade não encontrada");
        }
    }

    public Set<Modalidade> getModalidades() {
        return modalidades;
    }

    public double calcularIMC() {
        if (this.altura <= 0 || this.peso <= 0) {
            throw new IllegalArgumentException("Valores inválidos.");
        }
        return this.peso / (this.altura * this.altura);
    }

    public String classificarIMC(double imc) {
        if (imc < 17) {
            return "Muito abaixo do peso";
        } else if (imc >= 17 && imc < 18.49) {
            return "Abaixo do peso";
        } else if (imc >= 18.50 && imc < 24.99) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.99) {
            return "Acima do peso";
        } else if (imc >= 30 && imc < 34.99) {
            return "Obesidade I";
        } else if (imc >= 35 && imc < 39.99) {
            return "Obesidade II (severa)";
        } else {
            return "Obesidade III (mórbida)";
        }
    }

    public String calcularEClassificarIMC() {
        double imc = calcularIMC();
        return classificarIMC(imc);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Nome: %s.%n", this.getNome());
        System.out.printf("Idade: %d.%n", this.getIdade());
        System.out.printf("Matrícula: %s.%n", this.getMatricula());
        System.out.printf("Altura: %.2f m.%n", this.getAltura());
        System.out.printf("Peso: %.2f kg.%n", this.getPeso());
        System.out.print("Modalidades: ");
        if (this.getModalidades().isEmpty()) {
            System.out.println("Nenhuma modalidade cadastrada.");
        } else {
            for (Modalidade modalidade : this.getModalidades()) {
                System.out.print(modalidade + " ");
            }
            System.out.println();
        }
        System.out.printf("IMC: %.2f%n", this.calcularIMC());
        System.out.printf("Classificação IMC: %s%n", this.calcularEClassificarIMC());
    }
}
