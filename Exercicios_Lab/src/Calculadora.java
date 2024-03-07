public class Calculadora {

    private static float pi = 3.14f;

    public static double circunferencia(double raio){
        double circun = 2*pi*raio;
        return circun;
    }

    public static double volumeEsfera(double raio){
        double volume = (4/3)*pi*Math.pow(raio, 3);
        return volume;
    }

    public static double volumeCilindro(double raio, double altura){
        double volume = (pi*Math.pow(raio,2))*altura;
        return volume;
    }

}
