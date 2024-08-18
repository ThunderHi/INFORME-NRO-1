package suma_arreglo;	//Paquete suma_arreglo
import java.util.Scanner;	//Importación de Scanner

public class suma_arreglo {
	public static void main(String[] args) { //Rutina Principal
		Scanner entrada = new Scanner(System.in); //Objeto dinamico de Scanner
		int[] arreglo = new int[10];	//Definición de arreglo
		
		System.out.println("Ingrese 10 numeros en orden ascendente: ");
		for(int i=0; i < arreglo.length;i++) {	//Entrada de numeros con FOR
			int numeroIngresado;
			do {	//Control para ingreso de numero mayores
				System.out.print("Numero " + (i+1) + ":");
				numeroIngresado = entrada.nextInt();	//Entrada por teclado
			}while(i > 0 && numeroIngresado <= arreglo[i-1]);
			
			arreglo[i] = numeroIngresado;	//Se añade número al arreglo
		}
		System.out.println("Números ingresados: ");
        for (int num : arreglo) {	//Muestra numero ingresados
            System.out.print(num + " ");
        }
	}
}
