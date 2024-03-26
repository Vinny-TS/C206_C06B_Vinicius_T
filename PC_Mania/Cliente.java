package PC_Mania;

public class Cliente {
    public String nome;
    public long cpf;

    Computador computador[] = new Computador[5];

    public float calculaTotalCompra(){
        float valorTotal = 0;
        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null){
                valorTotal += computador[i].preco;
            }
        }
        return valorTotal;
    }
}
