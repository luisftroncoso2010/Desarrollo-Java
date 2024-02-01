package corn.POO.EjerciciosModuloDos.PDFTres;
import java.util.Random;
public class Filas {
    public static int[][] matriz(){
        Random random = new Random();
        int matrizUno [][] = new int[3][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                matrizUno[i][j] = random.nextInt(50);
            }
        }
        return matrizUno;
    }
    public static void main(String[] args) {
        int [][] matriz = matriz();
        int numeroMayor = matriz[0][0];
        System.out.println("Generar la matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Primera fila ");
        for(int i = 0; i < 4; i++){
            System.out.print(matriz[0][i] + " ");
        }

        System.out.println("\nSegunda columna: ");
        for (int i = 0; i < 3; i++){
            System.out.println(matriz[i][1]);
        }

        System.out.println("Tercera fila ");
        for(int i = 0; i < 4; i++){
            System.out.print(matriz[2][i] + " ");
        }

    }
}
