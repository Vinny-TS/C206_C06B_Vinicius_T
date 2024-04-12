package prova_lab_1;

public class Main {
    public static void main(String[] args) {

        //testando bracos
        Garra garra_bracinho = new Garra();
        Camera camera_bracinho = new Camera();
        Robo bracinho = new BracoArticulado(7, garra_bracinho, camera_bracinho);
        bracinho.setEnergiaMaxima(10);
        bracinho.setEnergia(10);
        bracinho.trabalhar();

        Garra garra_bracinho1 = new Garra();
        Camera camera_bracinho1 = new Camera();
        Robo bracinho1 = new BracoArticulado(2, garra_bracinho1, camera_bracinho1);
        bracinho1.setEnergiaMaxima(10);
        bracinho1.setEnergia(10);
        bracinho1.trabalhar();

        bracinho1.setEnergia(2);
        bracinho1.trabalhar();

        bracinho1.recarregar(4);
        bracinho1.trabalhar();
        //
        //testanto empilhador
        Pacote[] pacotes = new Pacote[10];
        Robo empilhador = new Empilhador(pacotes, 10);
        empilhador.setEnergiaMaxima(10);
        empilhador.setEnergia(10);

        ((Empilhador) empilhador).adicionaPacote(5);
        ((Empilhador) empilhador).adicionaPacote(11);
        ((Empilhador) empilhador).adicionaPacote(9);
        ((Empilhador) empilhador).adicionaPacote(8);
        ((Empilhador) empilhador).mostraPacotes();
        System.out.println(" ");
        ((Empilhador) empilhador).removePacote(0);
        ((Empilhador) empilhador).mostraPacotes();
    }
}
