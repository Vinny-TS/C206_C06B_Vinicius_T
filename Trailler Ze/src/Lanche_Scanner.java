import java.util.Scanner;

public class Lanche_Scanner {
    public static void main(String[] args) {
        Scanner lanche = new Scanner(System.in);
        int lanche1 = lanche.nextInt();
        int lanche2 = lanche.nextInt();
        int lanche3 = lanche.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        float media = (float)total/3;

        System.out.println(media);

    }
}
