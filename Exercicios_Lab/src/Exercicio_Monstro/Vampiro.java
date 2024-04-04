package Exercicio_Monstro;

public class Vampiro extends Monstro {
    private int medidorDeSangue;
    private boolean formaDeMorcego;


    public void transformar(){
        formaDeMorcego = true;
        System.out.println("aaaaaaaaaaaaa vampiro doidao");
    }

    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMorcego) {
        super(idade, vida, energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMorcego = formaDeMorcego;
    }

    public void recuperarVida(){
        this.setVida(this.getVida() + 1);
    }

    public void atacarComMordida(Monstro monstroAlvo){
        monstroAlvo.setVida(monstroAlvo.getVida() - 5);
    }
}
