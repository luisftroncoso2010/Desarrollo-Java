package corn.POO.ClaseUno;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class practicas {
    public static void main(String[] args) {
        Integer valorUno = 10;
        Integer valorDos = 30;
        int comprar;
        if (valorUno.equals(valorDos)) System.out.println("Son iguales");
        else {
            comprar = valorUno.compareTo(valorDos);
            System.out.println(comprar);
            if (comprar > 0)System.out.println("Valor uno es mayor que valor dos");
            else System.out.println("Valor dos e mayor que valor uno");
            }

        float num = 2.5f;
        System.out.println(num);
        Date fecha = new Date();
        System.out.println(fecha.toString());//Esto lo convierte a mayusculas
        Date fehchaPropia = new Date(2023, 15, 5);
        System.out.println(fehchaPropia.toString());
        int numeroUno;
        int numeroDos;
        float coeficiente;
        String nombre;
        char inicial;
        Scanner scanner = new Scanner(System.in); //Creamoa el objeto escaner
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();//nextLine para pedir caracteres por consola
        System.out.println("Ingrese numero uno");
        numeroUno = scanner.nextInt();
        System.out.println("Ingrese numero dos");
        numeroDos = scanner.nextInt();
        System.out.println("Ingrese el coeficiente");
        coeficiente = scanner.nextFloat();
        inicial = nombre.charAt(0);//lobtenermos el primer caracter del qeu pedimos por consola
        //Aca mostramos lo pedido por consola
        System.out.println("El nombre es " + nombre);
        System.out.println("El primer caracter es del nombre es: " + inicial);
        System.out.println("Coeficiente: " + coeficiente);
        System.out.println("Numero Uno: " + numeroUno);
        System.out.println("Numero Dos: " + numeroDos);
        System.out.println("El nombre es : " + nombre);
        scanner.close();


    }
}
