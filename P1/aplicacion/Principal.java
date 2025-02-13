package aplicacion;
import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        long pasos = 1000000; // Número fijo de pasos
        double pi = Matematicas.generarNumeroPiIterativo(pasos);
        System.out.println("El número PI aproximado con " + pasos + " pasos es: " + pi);
    }
}
