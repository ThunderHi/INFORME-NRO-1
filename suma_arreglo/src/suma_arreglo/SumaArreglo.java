package suma_arreglo;

public class SumaArreglo {
	 public static int sumaArreglo(int[] arreglo) { //Método estático
	        int suma = 0;	//Definicion de variable suma
	        for (int i = 0; i < arreglo.length; i++) {
	            suma += arreglo[i];	//Suma de elementos del arreglo
	        }
	        return suma;	//Devuelve el valor de suma
	    }

	  public static void main(String[] args) {	//Rutina principal
	      int[] arreglo = {1, 2, 3, 4, 5};	//Definición de arreglo
	      int resultado = sumaArreglo(arreglo);	//Almacena valor DE SUMA
	      System.out.println("La suma es: " + resultado);
	  }
}
