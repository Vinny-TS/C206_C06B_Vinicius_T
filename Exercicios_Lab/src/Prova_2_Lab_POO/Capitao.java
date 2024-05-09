package Prova_2_Lab_POO;

public class Capitao extends Pirata implements Comandar{
    private int numeroDeSeguidores;

    public Capitao(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    public void conquistarNovoSeguidor(Pirata pirata){
        if (pirata.getPoder() <= super.getPoder()){
            this.numeroDeSeguidores += 1;
            System.out.println("Pirata " + pirata.getNome() + " agora segue " + this.getNome());
        }
        else {
            System.out.println("Nao eh possivel seguir " + this.getNome());
        }
    }

    @Override
    public void darOrdens() {
        System.out.println("O capitao " + this.getNome() + " esta ordenando " + this.numeroDeSeguidores + " tripulante(s)!");
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitao esta mudando a rota!");
    }
}
