package corn.POO.EjerciciosModuloUno.PDFTres;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloca un numero para calcular la raiz cuadrada: ");
        int numero = scanner.nextInt();
        double operacion =  Math.sqrt(numero);
        System.out.println("La raiz Cuadrada de un numero es: " + operacion);
    }
}
