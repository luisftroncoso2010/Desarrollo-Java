package corn.POO.EjerciciosModuloDos.PDFUno;
import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
        System.out.println("Por favor digita el numero del que quieres saber sus divisores: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println("Sus divisores son: ");
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0 && i != numero){
                System.out.println(i);
            }
        }
    }
}
