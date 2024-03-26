package PC_Mania;

public class Computador {
    public String marca;
    public float preco;

    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwareBasico;
    MemoriaUSB memoriaUSB;

    public Computador(SistemaOperacional sistemaOperacional, HardwareBasico[] hardwareBasico) {
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasico = hardwareBasico;
    }

    public void mostraPCConfigs(){
        System.out.println("Marca do PC: " + marca);
        System.out.println("Valor: R$" + preco);
        System.out.println(this.hardwareBasico[0].nome + " " + this.hardwareBasico[0].capacidade + "GHz");
        System.out.println("Memória " + this.hardwareBasico[1].nome + ": " + this.hardwareBasico[1].capacidade + "GB");
        if(this.hardwareBasico[2].capacidade < 1000){
            System.out.println(this.hardwareBasico[2].nome + " " + this.hardwareBasico[2].capacidade + "GB");
        }
        else {
            System.out.println(this.hardwareBasico[2].nome + " " + (this.hardwareBasico[2].capacidade/1000) + "TB");
        }
        System.out.println(this.sistemaOperacional.nome + this.sistemaOperacional.tipo + "bits");
        if (this.memoriaUSB != null){
            if(this.memoriaUSB.capacidade < 1000){
                System.out.println(this.memoriaUSB.nome + " " + this.memoriaUSB.capacidade + "GB");
            }
            else {
                System.out.println(this.memoriaUSB.nome + " " + (this.memoriaUSB.capacidade/1000) + "TB");
            }
        }
    }

    public void addMemoriaUSB (MemoriaUSB musb){
        this.memoriaUSB = musb;
    }
}
