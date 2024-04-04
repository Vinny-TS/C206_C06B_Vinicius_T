package Exercicio_Monstro;

public class Feitico {
    private String nome;
    private int poder;

    public Feitico(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Feitico{" +
                "nome='" + nome + '\'' +
                ", poder=" + poder +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
