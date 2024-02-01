package corn.POO.EjerciciosModuloDos.PDFTres;
import java.util.Random;
public class MayorNumeroDeUnaMatriz {
    public static int[][] matriz(){
        Random random = new Random();
        int matrizUno [][] = new int[5][3];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                matrizUno[i][j] = (random.nextInt(50) * 2);
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

       for(int i = 0; i < 5; i++){
           for(int j = 0; j < 3; j++){
               if (matriz[i][j] > numeroMayor){
                   numeroMayor = matriz[i][j];
               }
           }
       }
        System.out.println("El numero mayor es:\t" + numeroMayor);
    }
}
