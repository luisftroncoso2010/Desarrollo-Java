package corn.POO.EjerciciosModuloDos.PDFCinco;
import java.util.Scanner;
/*
- El promedio general de cada grupo.
- El promedio general de ambos grupos.
- El grupo con mejor promedio
 */
public class SumaDeVectores {
    public static float [] vectorGrupoA(){
        float[] grupoA = new float[10];
        grupoA[0] = 4.5f;
        grupoA[1] =  3.4f;
        grupoA[2] =  2.4f;
        grupoA[3] =  4.5f;
        grupoA[4] =  3.5f;
        grupoA[5] =  1.8f;
        grupoA[6] =  0.9f;
        grupoA[7] =  4.9f;
        grupoA[8] =  2.6f;
        grupoA[9] =  1.2f;
        return grupoA;
    }
    public static float [] vectorGrupoB(){
        float[] grupoB = new float[10];
        grupoB[0] = 0.9f;
        grupoB[1] =  1.8f;
        grupoB[2] =  2.7f;
        grupoB[3] =  4.6f;
        grupoB[4] =  5.5f;
        grupoB[5] =  1.4f;
        grupoB[6] =  2.3f;
        grupoB[7] =  3.2f;
        grupoB[8] =  4.1f;
        grupoB[9] =  5.0f;
        return grupoB;
      }

    public static void main(String[] args) {
        // Instanciamos los vectores
        float [] vectorGrupoA = vectorGrupoA();
        float [] vectorGrupoB = vectorGrupoB();
        float sumaGrupoA = 0;
        float sumaGrupoB = 0;


        // Recorremos el primer grupo y los mostramos
        System.out.println("-- Mostramos el Grupo A: --");
        for(int i = 0; i < vectorGrupoA.length; i++){
            System.out.println("EL indice es: \t" + i + " El elemento es:\t" + vectorGrupoA[i]);
        }
        System.out.println("-- Suma de notas de grupo A --");
        for (int i = 0; i < vectorGrupoA.length; i++){
            sumaGrupoA += vectorGrupoA[i];
        }
        float promedioGrupoA = sumaGrupoA / vectorGrupoA.length;
        System.out.println("La suma del grupo A es: " + sumaGrupoA + "\tEl promedio del grupo A es:\t" + promedioGrupoA);


        // Recorremos el segundo grupo y los mostramos
        System.out.println("-- Mostramos el Grupo B: --");
        for(int i = 0; i < vectorGrupoB.length; i++){
            System.out.println("EL indice es: \t" + i + " El elemento es:\t" + vectorGrupoB[i]);
        }
        System.out.println("-- Suma de notas de grupo B --");
        for (int i = 0; i < vectorGrupoB.length; i++){
            sumaGrupoB += vectorGrupoB[i];
        }
        float promedioGrupoB = sumaGrupoB / vectorGrupoB.length;
        System.out.println("La suma del grupo B es: " + sumaGrupoB + "\tEl promedio del grupo B es:\t" + promedioGrupoB);


        // * Promedio general de ambos grupos
        System.out.println("-- Promedio General de ambos Grupos --");
        float promedioAmbosGrupos = (promedioGrupoA + promedioGrupoB)/2;
        System.out.println("EL promedio General de los grupos es: " + promedioAmbosGrupos);


        //Grupo con mejor promedio
        System.out.println("-- Grupo con mejor promedio --");
        if (promedioGrupoA > promedioGrupoA) System.out.println("El grupo A tiene mayor pormedio");
        else System.out.println("El grupo B, tiene mayor promedio");
    }
}
