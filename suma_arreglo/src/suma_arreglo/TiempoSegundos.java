package suma_arreglo;
import java.util.Scanner;	//Importa librería Scanner

public class TiempoSegundos {

    public static int convertirSegundos(int horas, int minutos, int segundos) {
        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
        return totalSegundos;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);	//Objeto dinámico de Scanner

        //Ingreso de horas, minutos y segundos
        System.out.print("Ingrese el numero de horas: ");
        int horas = entrada.nextInt();
        System.out.print("Ingrese el numero de minutos: ");
        int minutos = entrada.nextInt();
        System.out.print("Ingrese el numero de segundos: ");
        int segundos = entrada.nextInt();
        //Almacena valor de Método
        int totalSegundos = convertirSegundos(horas, minutos, segundos);

        //Muestra el resultado
        System.out.println("El tiempo total en segundos es: " + totalSegundos);
    }
}
