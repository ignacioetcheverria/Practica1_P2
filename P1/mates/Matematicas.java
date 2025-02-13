package mates;
import java.util.Random;

public class Matematicas {
    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo.
     * El parámetro `pasos` indica el número de puntos generados.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        Random rand = new Random();
        long dentro = 0;

        for (long i = 0; i < pasos; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            if (x * x + y * y <= 1.0) {
                dentro++;
            }
        }

        return 4.0 * dentro / pasos;
    }
}
