package Prova_2_Lab_POO;

public class Espadachim extends Pirata implements Comandar {
    private String nomeDaEspada;

    public Espadachim(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    @Override
    public void darOrdens() {
        System.out.println("O imediato esta ordenando os tripulantes!");
    }

    @Override
    public void mudarRota() {
        System.out.println("O imediato esta mudando a rota!");
    }
}
