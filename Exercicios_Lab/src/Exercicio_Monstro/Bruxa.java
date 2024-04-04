package Exercicio_Monstro;

public class Bruxa extends Monstro {
    private Feitico feiticos[];

    public Bruxa(int idade, int vida, int energia, Feitico[] feiticos) {
        super(idade, vida, energia);
        this.feiticos = new Feitico[5];
    }

    public boolean aprenderFeitico(String nome, int poder){
        for (int i = 0; i < feiticos.length; i++) {
            if (feiticos[i] == null){
                feiticos[i] = new Feitico(nome, poder);
                break;
            }
        }
    }

    public void listarFeiticos(){
        for (int i = 0; i < feiticos.length; i++) {
            System.out.println(feiticos[i].toString());
        }
    }

    public void esquecerFeitico(int posicao){
        feiticos[posicao] = null;
    }

    public void lancarFeitico(Monstro monstroAlvo, int posicao){
        if (feiticos[posicao] != null){
            if (monstroAlvo.getVida() > 0) {
                monstroAlvo.setVida(monstroAlvo.getVida() - feiticos[posicao].getPoder());
            }
            else{
                System.out.println("ataque n realizado");
            }
        }
    }
}
