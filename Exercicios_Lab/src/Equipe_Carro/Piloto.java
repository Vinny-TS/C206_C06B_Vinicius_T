public class Piloto {
    private String nome = new String();
    private int idade;
    private String nacionalidade = new String();
    private static int idGeral = 0;
    private int ID;

    public void correr(Carro carro){
        System.out.println(this.nome + " faz vrum vrum");
    }

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        setIdGeral(getIdGeral() + 1);
        setID(getIdGeral());
    }

    public static int getIdGeral() {
        return idGeral;
    }

    public static void setIdGeral(int idGeral) {
        Piloto.idGeral = idGeral;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", ID=" + ID +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
