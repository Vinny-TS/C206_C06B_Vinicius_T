import java.util.Arrays;

public class Equipe {
    private Carro carro;
    private Piloto[] pilotos = new Piloto[4];
    private Piloto pilotoAtual;
    private String nome = new String();

    private boolean trocarPilotoAtual(int pilotoID){
        boolean sucessoTroca = false;
        for (int i = 0; i < pilotos.length; i++) {
            if (this.pilotos[i].getID() == pilotoID){
                this.pilotoAtual = this.pilotos[i];
                return true;
            }
        }
        return false;

    }

    public Carro getCarro() {
        return carro;
    }

    public Piloto getPilotoAtual() {
        return pilotoAtual;
    }

    public void setPilotoAtual(Piloto pilotoAtual) {
        this.pilotoAtual = pilotoAtual;
    }

    public Piloto[] getPilotos() {
        return pilotos;
    }

    private boolean trocarPneu(int tipoDePneu){
        if (tipoDePneu >= 1 && tipoDePneu <= 5){
            this.carro.setTipoDePneu(tipoDePneu);
            return true;
        }
        else {
            System.out.println("Pneu inválido");
            return false;
        }
    }

    // Nessa função entendi q ela precisava receber o parametro do ID do piloto para fazer a troca
    // No enunciado n pedia o ID do piloto
    public void pitstop(int tipoDePneu, int pilotoID){
        for (int i = 0; i < this.pilotos.length; i++) {
            if (this.pilotos[i].getID() == this.pilotoAtual.getID()){
                trocarPilotoAtual(pilotoID);
                System.out.println("Piloto novo: " + this.pilotoAtual.getNome());
                break;
            }
        }
        trocarPneu(tipoDePneu);
        System.out.println("Pneu novo: " + this.carro.getTipoDePneu());
    }

    public boolean adicionarPiloto(Piloto piloto){
        for (int i = 0; i < pilotos.length; i++) {
            if (this.pilotos[i] == null){
                this.pilotos[i] = piloto;
                return true;
            }
        }
        return false;
    }

    public boolean retirarPiloto(Piloto piloto){
        for (int i = 0; i < pilotos.length; i++) {
            if (this.pilotos[i].getID() == piloto.getID()){
                this.pilotos[i] = null;
                return true;
            }
        }
        return false;
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "carro=" + carro +
                ", pilotos=" + Arrays.toString(pilotos) +
                ", pilotoAtual=" + pilotoAtual +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo){
        Carro carro = new Carro(tipoDePneu, potencia, turbo);
        this.carro = carro;
        this.carro.setTipoDePneu(tipoDePneu);
    }
}