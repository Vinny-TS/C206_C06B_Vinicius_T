package prova_lab_1;

public class Camera {
    private int qualidade;
    private int rand = (int) ((Math.random() * 9) + 1);

    public int acharPecas(){
        if (rand+qualidade >= 7){
            return 1;
        }
        System.out.println("nao achou peca");
        return 0;
    }
}
