package prova_lab_1;

public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos;
    private int energiaMaxima;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeRobos() {
        return totalDeRobos;
    }

    public void setTotalDeRobos(int totalDeRobos) {
        this.totalDeRobos = totalDeRobos;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    public void trabalhar(){
        this.energia = (this.getEnergia() - 5);
    }

    public void trocarEnergia(Robo roboAlvo){
        int energiaInicial = this.energia;
        roboAlvo.energia += 5;
        this.energia -= 5;
        if (this.energia < energiaInicial){
            roboAlvo.energia -= (energiaInicial);
        } else if (energiaInicial == 0) {
            ;
        }
        if (roboAlvo.energia >= roboAlvo.energiaMaxima) {
            roboAlvo.energia = roboAlvo.energiaMaxima;
        }
    }

    public void recarregar(int horas){
        this.energia += (horas * 3);
        if(this.energia >= this.energiaMaxima){
            this.energia = this.energiaMaxima;
        }
    }
}
