public class Main {
    public static void main(String[] args) {

        double raio = 2;
        double altura = 5;
        double circun = Calculadora.circunferencia(raio);
        double cilin = Calculadora.volumeCilindro(raio, altura);
        double esfera = Calculadora.volumeEsfera(raio);

        System.out.println(circun);
        System.out.println(cilin);
        System.out.println(esfera);

    }
}