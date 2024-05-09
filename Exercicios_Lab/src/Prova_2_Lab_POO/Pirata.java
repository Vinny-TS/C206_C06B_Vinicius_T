package Prova_2_Lab_POO;

public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public String getNome() {
        return nome;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public int getPoder() {
        return poder;
    }

    public void comer(Cozinheiro cozinheiro, int index){
        String pratoFeito = cozinheiro.prepararPrato(index);
        this.poder += 1;
        if (pratoFeito == this.comidaFavorita){
            this.poder += 1;
        }
    }

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public Pirata lutar(Pirata pirata){
        if (this.poder > pirata.getPoder()){
            System.out.println(this.getNome() + " eh mais forte que " + pirata.getNome());
            return this;
        }
        else {
            System.out.println(pirata.getNome() + " eh mais forte que " + this.getNome());
            return pirata;
        }
    }
}
