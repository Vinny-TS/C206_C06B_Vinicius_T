package Prova_2_Lab_POO;

public class Receita {
    private String nome;
    private int dificuldade;

    public Receita(String nome, int dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
