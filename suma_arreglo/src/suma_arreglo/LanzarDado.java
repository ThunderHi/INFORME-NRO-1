package suma_arreglo;	//Paquete suma_arreglo
import java.util.Random;	//Importa libreria Random

public class LanzarDado {
	public static void main(String[] args) {	//Rutina principal
        int[] frecuencia = new int[6];  // Arreglo para almacenar la frecuencia de cada cara
        Random random = new Random();	//Objeto dinamico de Random

        // Lanzar el dado 20,000 veces
        for (int i = 0; i < 20000; i++) {
            int resultado = random.nextInt(6) + 1;  // Genera un número entre 1 y 6
            frecuencia[resultado - 1]++;  // Incrementa la frecuencia de la cara correspondiente
        }

        // Imprimir las frecuencias de cada cara
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + frecuencia[i] + " veces");
        }
    }
}
