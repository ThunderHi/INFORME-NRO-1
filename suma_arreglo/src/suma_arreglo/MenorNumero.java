package suma_arreglo;

public class MenorNumero {

    public static double menor(double a, double b, double c) {
        if (a <= b && a <= c) {	//Control para verificar el menor
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    
    public static void main(String[] args) {	//Rutina Principal
        double num1 = 5.5;	//Definición de los 3 decimales
        double num2 = 3.3;
        double num3 = 7.7;

        double menorNumero = menor(num1, num2, num3);	//Almacena al menor decimal
        System.out.println("El menor de los tres numeros es: " + menorNumero);
    }
}