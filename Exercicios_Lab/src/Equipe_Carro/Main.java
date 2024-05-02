//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Equipe scuderia_ferrari = new Equipe("Scuderia Ferrari");
        Piloto charles_leclerc = new Piloto("Charles Leclerc", 26, "Monegato");
        Piloto carlos_sainz = new Piloto("Carlos Sainz", 29, "Espanhol");
        Piloto robert_shwartzan = new Piloto("Robert Shwartzan", 24, "Russo");
        scuderia_ferrari.adicionarPiloto(charles_leclerc);
        scuderia_ferrari.adicionarPiloto(carlos_sainz);
        scuderia_ferrari.adicionarPiloto(robert_shwartzan);
        for (int i = 0; i < scuderia_ferrari.getPilotos().length; i++) {
            if (scuderia_ferrari.getPilotos()[i] != null){
                System.out.println("Piloto: " + scuderia_ferrari.getPilotos()[i].getNome());
                System.out.println("Piloto: " + scuderia_ferrari.getPilotos()[i].getID());
            }
        }
        System.out.println("=========================================================================================");
        scuderia_ferrari.retirarPiloto(robert_shwartzan);
        for (int i = 0; i < scuderia_ferrari.getPilotos().length; i++) {
            if (scuderia_ferrari.getPilotos()[i] != null){
                System.out.println("Piloto: " + scuderia_ferrari.getPilotos()[i].getNome());
            }
        }
        System.out.println("=========================================================================================");
        scuderia_ferrari.setPilotoAtual(charles_leclerc);
        System.out.println("Piloto Atual: " + scuderia_ferrari.getPilotoAtual().getNome());
        System.out.println("=========================================================================================");
        // ====================================================================
        scuderia_ferrari.constroiCarro(1, 980, true);
        System.out.println(scuderia_ferrari.getCarro().toString());
        // ====================================================================
        System.out.println("=========================================================================================");
        scuderia_ferrari.pitstop(4, 1);
        System.out.println("=========================================================================================");
        // ====================================================================
        carlos_sainz.correr(scuderia_ferrari.getCarro());
        System.out.println("=========================================================================================");
        // ====================================================================
        scuderia_ferrari.getCarro().correr();
        System.out.println("=========================================================================================");
    }
}