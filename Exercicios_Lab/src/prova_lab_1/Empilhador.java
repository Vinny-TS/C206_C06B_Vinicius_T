package prova_lab_1;

public class Empilhador extends Robo {
    Pacote[] pacote_empilhador = new Pacote[10];
    private int pesoMaximo; //pesoMaximo é o peso maximo de um pacote só

    public Empilhador(Pacote[] pacote_empilhador, int pesoMaximo) {
        this.pacote_empilhador = pacote_empilhador;
        this.pesoMaximo = pesoMaximo;
        super.setTotalDeRobos(super.getTotalDeRobos() + 1);
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public void adicionaPacote(int peso) {
        for (int i = 0; i < this.pacote_empilhador.length; i++) {
            if (this.getEnergia() > 3) {
                if (pacote_empilhador[i] == null) {
                    if (peso > pesoMaximo) {
                        System.out.println("nao foi possivel adicionar pacote");
                        break;
                    } else {
                        this.pacote_empilhador[i] = new Pacote(peso);
                        System.out.println("pacote adicionado");
                        this.setEnergia(getEnergia() - 3);
                        break;
                    }
                }
            }
        }
    }


    public void removePacote(int posicao){
        if (this.pacote_empilhador[posicao] != null){
            this.pacote_empilhador[posicao] = null;
        }
        else {
            this.pacote_empilhador[posicao] = this.pacote_empilhador[posicao];
        }
    }

    public void mostraPacotes(){
        for (int i = 0; i < this.pacote_empilhador.length; i++) {
            if (this.pacote_empilhador[i] != null){
                System.out.println(this.pacote_empilhador[i].toString());
            }

        }
    }
}
