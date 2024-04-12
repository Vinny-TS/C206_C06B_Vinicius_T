package prova_lab_1;

public class BracoArticulado extends Robo{
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int numeroDeArticulacoes, Garra garra, Camera camera) {
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        this.garra = garra;
        this.camera = camera;
        super.setTotalDeRobos(super.getTotalDeRobos() + 1);
    }

    @Override
    public void trabalhar(){
        if (this.camera != null){
            if (this.getEnergia() > 3) {
                if (this.numeroDeArticulacoes >= 5) {
                    int achou = this.camera.acharPecas();
                    if (achou == 1){
                        this.garra.agarraPeca(2);
                        setEnergia(getEnergia() - 3);
                    }
                } else {
                    this.garra.agarrarPeca();
                }
            }
            else {
                System.out.println("energia insuficiente");
            }
        }
        else {
            System.out.println("braco nao possui camera");
        }
    }
}
