import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int numGerado = rand.nextInt(10)+1;
        int numAdvinhado;

        do {
            numAdvinhado = entrada.nextInt();
            if (numAdvinhado == numGerado) {
                System.out.println("acertou");
            }
            else
                System.out.println("errou ze");
        }while (numGerado != numAdvinhado);
    }
}
