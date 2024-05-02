public class Motor {
    private int potencia;
    private boolean turbo;

    public Motor(int potencia, boolean turbo) {
        this.potencia = potencia;
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", turbo=" + turbo +
                '}';
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
