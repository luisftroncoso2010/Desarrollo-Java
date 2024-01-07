package corn.POO.ClaseTrece;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones {


    public static void main(String[] args) {
        // Declaramos el Scaner y las variables
        Scanner scanner = new Scanner(System.in);
        int numUno, numDos, division;
        try {
            // Colocamos un mensaje para aludir al primer y segundo numero
            System.out.println("Por favor coloca un numero de tipo entero: ");
            numUno = scanner.nextInt();
            System.out.println("Divisor. Coloca un valor entero: ");
            numDos = scanner.nextInt();
            division = numUno / numDos;
            System.out.println("El resultado es: " + division);
        }
        catch (InputMismatchException exception){
            System.err.println("Error. Se esperaba un numero entero " + exception.getMessage());
        }
        catch (ArithmeticException exception) {  // Aca Se coloca la excepcion por parametro. El tipo y la ex
            System.err.println("Error aritmético: " + exception.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Ejemplo finalizado");
            scanner.close();
        }
    }
}
