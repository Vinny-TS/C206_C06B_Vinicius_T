import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int np3, npa;

        npa = entrada.nextInt();

        if(npa >= 60){
            System.out.println("passaste");
        } else{
            System.out.println("carma ze, ainda da");
            np3 = entrada.nextInt();

            if ((npa+np3)/2 >= 50){
                System.out.println("boa ze passou na fina");
            }
            else{
                System.out.println("se fodeu");
            }
        }
        entrada.close();
    }
}
