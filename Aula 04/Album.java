public class Album {
    private String nome;
    private int nota;

    public Album(java.lang.String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nome=" + nome +
                ", nota=" + nota +
                '}';
    }
}
