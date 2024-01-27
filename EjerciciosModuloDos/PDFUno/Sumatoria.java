package corn.POO.EjerciciosModuloDos.PDFUno;

import java.util.Random;
import java.util.Scanner;
public class Sumatoria {
    public static void main(String[] args) {
        System.out.println("Por favor ingresa un numero para las operaciones: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int sumatoria = 0;
        int ayudaDivisores = 0;
        int ayudaFactorial = 1;
        int ayudaNumeroPerfecto = 0;

        // creamos la sumatoria
        for(int i = 0; i <=numero; i++){
            sumatoria += i;
        }
        System.out.println("-- La sumatoria es: " +  sumatoria);
        System.out.println("-- La raiz cuadrada de la sumatoria es: " + Math.sqrt(sumatoria));
        System.out.print("-- Los divisores son: " );
        for (int i = 1; i <= sumatoria; i++){
            if (sumatoria % i == 0 && i != sumatoria){
                System.out.print(i + "\t");
                ayudaDivisores = ayudaDivisores +  i;
            }
        }


        // Buscamos el factorial de la sumatoria
        for (int i = 1; i <= sumatoria; i++){
            ayudaFactorial *= i;
        }
        System.out.print("\n-- Factorial del resultado: " + ayudaFactorial);

        System.out.println("\n-- Saber si es  perfecto o no: ");
        System.out.print("Divisores: ");
        for (int i = 1; i <=sumatoria; i++){
            if (sumatoria % i == 0 && i != sumatoria ){
                System.out.print(i + "\t");
                ayudaNumeroPerfecto +=  i;
            }
        }
        System.out.println("\nUn numero perfecto es cuando la suma de de sus divisores es igual al mismo numero");
        if (ayudaNumeroPerfecto == sumatoria) System.out.println("El numero es perfecto: " + ayudaNumeroPerfecto);
        else System.out.println("El " + sumatoria + " no es perfecto");


        // Generamos un numero entre 1 y la sumatoria
        int limiteInferior = 1;
        int limiteSuperior = sumatoria;

        // Creamos el objeto random
        Random random = new Random();

        // Generar un numero aleatorio del rango
        int numeroAleatorio = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;

        // Imprimir el número aleatorio
        System.out.println("Número aleatorio entre " + limiteInferior + " y " + limiteSuperior + ": " + numeroAleatorio);

    }
}
