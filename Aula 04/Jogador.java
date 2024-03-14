public class Jogador {
    Arma arma;
    int energia;
    int vida;

    void atacar(Jogador alvo){
        if(this.energia >= this.arma.custoDeEnergia){
            alvo.vida -= this.arma.dano;
            this.energia -= this.arma.custoDeEnergia;
        }

    }

    Jogador() {

    }

    Jogador(Arma arma, int vida, int energia){
        this.energia = energia;
        this.vida = vida;
    }


    public String toString() {
        return "vida " + this.vida + " energia " + this.energia;
    }
}