package Prova_2_Lab_POO;

import java.util.ArrayList;

public class Cozinheiro extends Pirata {
    private ArrayList<Receita> livroDeReceitas = new ArrayList<>();

    public Cozinheiro(String nome, String comidaFavorita, int poder, ArrayList<Receita> livroDeReceitas) {
        super(nome, comidaFavorita, poder);
        this.livroDeReceitas = livroDeReceitas;
    }

    public String prepararPrato(int index){
        try{
            System.out.println(this.getNome() + " cozinhou um " + livroDeReceitas.get(index).getNome());
            return this.livroDeReceitas.get(index).getNome();
        }
        catch (IndexOutOfBoundsException e){
            String erro = String.valueOf(e);
            System.out.println(erro);
            return erro;
        }

    }

    public void mostrarReceitas(){
        try{
            for (Receita receita : livroDeReceitas){
                System.out.println("Nome: " + receita.getNome() + " ======= Dificuldade: " + receita.getDificuldade());
            }
        }
        catch (Error error){
            System.out.println("Erro: " + error);
        }
    }

    public void setLivroDeReceitas(ArrayList<Receita> livroDeReceitas) {
        this.livroDeReceitas = livroDeReceitas;
    }
}
