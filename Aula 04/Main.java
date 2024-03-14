public class Main {
    public static void main(String[] args) {
        Musico mcr = new Musico();

        mcr.adicionar(new Album("Black Parade", 10));

        mcr.listar();
        mcr.deletar("Black Parade");
        mcr.buscar("Black Parade");
        mcr.listar();
    }
}