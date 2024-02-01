package corn.POO.EjerciciosModuloDos.PDFCinco;
import java.util.Scanner;
public class VectoresPeso {
    public static float [] vectorPeso(){
        Scanner scanner = new Scanner(System.in);
        float[] vectorPeso = new float[5];
        for (int i = 0; i < vectorPeso.length; i++){
            System.out.println("Por favor ingresa el peso: ");
            float peso = scanner.nextFloat();
            vectorPeso[i] = peso;
        }
        return vectorPeso;
    }
    public static void main(String[] args) {
        float [] vectorPeso = vectorPeso();
        float suma = 0;
        float contadorPromedioArriba = 0;
        float contadorPromedioAbajo = 0;

        for(int i = 0; i < vectorPeso.length; i++){
            System.out.println("EL indice es: \t" + i + " El elemento es:\t" + vectorPeso[i]);
        }
        System.out.println("Suma de los promedios: ");
        for (int i = 0; i < vectorPeso.length; i++){
            suma += vectorPeso[i];
        }
        float promedio = suma / vectorPeso.length;
        System.out.println("-- La suma es: " + suma );
        System.out.println("-- El promedio es: " + promedio);


        System.out.println("-- Las que superan el promedio --");
        for(int i = 0; i < vectorPeso.length; i++){
            if (vectorPeso[i] > promedio){
                System.out.println("Estas superan el promedio: " + vectorPeso[i]);
                contadorPromedioArriba += 1;
            }else {
                System.out.println("Esta NO superan e prmedio: " + vectorPeso[i]);
                contadorPromedioAbajo +=1;

            }
        }
        System.out.println("Personas que superan el promedio: " + contadorPromedioArriba);
        System.out.println("Persona que NO superan el promedio: " + contadorPromedioAbajo);

    }
}
