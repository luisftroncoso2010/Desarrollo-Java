package corn.POO.ClaseTres;
import java.util.Scanner;
public class Main {
    //Variables de clase se colocan aca
    public static void main(String[] args) {
        //Tipo de variable primitiva
        int numeroA = 1;

        //Tipos de variables no primitivas. Como tipos de datos de referencia u objeto
        Integer numeroB = 23;
        String text = "Luis";
        String nombre;
        String apellido;
        Integer edad;

        //Clase Scanner. Se encuntra en el paquete java.util
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor escribe tu nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Por favor escribe tu edad: ");
        edad = scanner.nextInt();
        //Imprimimos el mesnaje, atraves de los datos pedidos por consola
        System.out.println("Tu nombre es " + nombre + " y tu  edad es " + edad);

        if (esDvisible(numeroA, numeroA)) System.out.println("Es divisible");
        else System.out.println("No es divisible");
    }
    //Vamos a crear un metodo
    public static Boolean esDvisible(Integer numeroA, Integer numeroB){
        return numeroA % numeroB == 0;
    }
}
