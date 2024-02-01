package corn.POO.EjerciciosModuloDos.PDFTres;
import java.util.Random;
public class MatrisTresPorTres {
    public static void main(String[] args) {
        // Creamos una instancia de la clase random;
        Random random = new Random();
        int matrizUno [][] = new int[3][3];
        int matrizDos [][] = new int[3][3];
        int matrizTres [][] = new int[3][3];

        // Agregar numeros aleatorios entre 0 y 100 matriz uno
        // Escogemos numeros que sean pares
        System.out.println("Almacenar numeros pares: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrizUno[i][j] = (random.nextInt(50) * 2);
                System.out.print(matrizUno[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Almacenar numeros impares: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrizDos[i][j] = (random.nextInt(50) * 2) + 1;
                System.out.print(matrizDos[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Almacenar suma de numeros: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrizUno[i][j] = (random.nextInt(50) * 2);
                matrizDos[i][j] = (random.nextInt(50) * 2) + 1;
                matrizTres[i][j] = matrizUno[i][j] + matrizDos[i][j];

                System.out.print(matrizTres[i][j] + " ");
            }

            System.out.println(" ");
        }


    }
}
