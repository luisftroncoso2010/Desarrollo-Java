package corn.POO.EjerciciosModuloDos.PDFDos;
import java.util.Scanner;
public class InvertirPalabras {
    public static void main(String[] args) {
        // Pedimos la palabra
        System.out.println("Por favor indique la palabra: ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();

        // Contamos la palabra. Y por convencion iteramos desde el final contando los elementos y -1
        int i = palabra.length() - 1;

        // Si la longitud es mayor que el inicio, iteramos hacia atras --i
        System.out.println("La palabra invertida es: ");
        while (i >= 0){
            char caracter = palabra.charAt(i);
            System.out.print(caracter);
            i--;
        }
    }
}
