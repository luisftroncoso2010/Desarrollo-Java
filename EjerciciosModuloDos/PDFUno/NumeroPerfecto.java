package corn.POO.EjerciciosModuloDos.PDFUno;
import java.util.Scanner;
public class NumeroPerfecto {
    public static void main(String[] args) {
        // System.out.println("Por favor digita el numero del que quieres saber sus divisores: ");
        // Scanner scanner = new Scanner(System.in);
        int numero = 8128;
        int resultado = 0;
        System.out.println("Sus divisores son: ");
        for (int i = 1; i <=numero; i++){
            if (numero % i == 0 && i != numero ){
                System.out.print(i + "\t");
                resultado = resultado + i;
            }
        }
        System.out.println("\nUn numero perfecto es cuando la suma de de sus divisores es igual al mismo numero.\nEL numero es : " + resultado);
        if (resultado == numero) System.out.println("El numero es perfecto: " + resultado);
        else System.out.println("El " + numero + " no es perfecto");
    }
}
