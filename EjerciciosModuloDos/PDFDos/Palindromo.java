package corn.POO.EjerciciosModuloDos.PDFDos;
import java.util.Scanner;
public class Palindromo {
    // Metodo para verificar si es palindroma o no
    static boolean esPalindromo(String palabra){
        // Elimina espacios y convierte a minúsculas para una compración sin distincion de mayúsculas
        palabra = palabra.replaceAll("\\s", "").toLowerCase();

        // Invierte la palabra
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        // Compara la palabra con la invertida
        return palabra.equals(palabraInvertida);
    }
    public static void main(String[] args) {
        System.out.println("Primera opcion: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la palabra para validar si es o no palindroma: ");
        String palabra = scanner.next().toUpperCase();
        int i = palabra.length() - 1;
        String palabraAlReves = "";

        while (i >= 0) {
            char caracter = palabra.charAt(i);
            palabraAlReves += caracter;
            i--;
        }
        System.out.println("Palabra al reves es:\t" +  palabraAlReves);
        System.out.println("Palabra original:\t" + palabra);
        System.out.println("El tipo de dato es:\t" + palabraAlReves.getClass());
        System.out.println("Tipo de dato de la palabra original:\t" + palabra.getClass());

        System.out.println("La palabras es Palindroma:\t" + palabra.equals(palabraAlReves));

        System.out.println("-- Segunda Opcion -- ");
        String palabrados = "reconocer";

        if (esPalindromo(palabra)){
            System.out.println(palabrados + " es palindroma");
        }
        else {
            System.out.println(palabrados + " No es palindroma");
        }
    }
}
