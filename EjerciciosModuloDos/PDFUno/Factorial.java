package corn.POO.EjerciciosModuloDos.PDFUno;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres saber su factorial: ");
        int numero = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= numero; i++){
            resultado = resultado * i;
        }
        System.out.println("El factorial de un numero es:\t" + resultado);
    }
}
