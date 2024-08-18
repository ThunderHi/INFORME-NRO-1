package suma_arreglo;

public class Cargo {

    public static double calcularCargo(double horas) {	//Método para calcular cargo
        double cargo;

        if (horas <= 1) {
            cargo = 3.00; // Cargo por la primera hora
        } else {
            cargo = 3.00 + (horas - 1) * 0.50; // Cargo por cada hora adicional
        }

        if (cargo > 12.00) {
            cargo = 12.00; // Cargo máximo por día
        }

        return cargo;
    }

    public static void main(String[] args) {	//Rutina principal
        double horas = 15; // Ejemplo de horas de estacionamiento
        double cargo = calcularCargo(horas);	//Almacena el cargo del método
        System.out.println("El cargo por " + horas + " horas de estacionamiento es: S/" + cargo);
    }
}

