package corn.POO.EjerciciosPractica;
import java.util.Scanner;
public class Primo {
    //Se cre uan clase para saber si un numero es divisible por eso
    public static boolean esDivisible(int numeroUno, int numeroDos){
        /* Aca validamos si el numero es divisible por otro, para hacer un descarte, ya que un numero primo es solo divksible por el mismo y 1, y no por otro numero */
        return numeroUno%numeroDos == 0; //Retornamos si la division es exacta.
    }
    public static boolean esPrimio(int numero){//Creamoa esta funcion para validar si es primo o no
        if(numero<=1)return false;//Se descarta el numero 1, ya que no cuenta
        /*S inicia le ciclo en 2 ya que el 1 se descarta arriba */
        for (int i=2; i < numero/2; i++) if (esDivisible(numero, i))return  false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        int numero = scanner.nextInt();

        if (esPrimio(numero)) System.out.println("El numero es primo");
        else System.out.println("El numero no es primo");
    }
}
