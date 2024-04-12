package prova_lab_1;

public class Pacote {
    private int peso;

    @Override
    public String toString() {
        return "Pacote{" +
                "peso=" + peso +
                '}';
    }

    public Pacote(int peso) {
        this.peso = peso;
    }
}
