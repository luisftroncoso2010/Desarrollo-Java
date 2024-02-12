package corn.POO.EjerciciosModuloCuatro;
public class OrdenamientoSelecccion {
    public static void Seleccion(int[] vector){
        // Variable auxiliar
        int aux;

        //Primer ciclo de recorrido
        for (int k = 0; k <= vector.length -1; k++){

            // Alacenado la variable de racorrido
            int p = k;

            // Almacenado de variable de recorrido
            for (int i = k+1; i <= vector.length - 1; i ++){

                // Comparacion de valores y almacenaje de posiciones
                if (vector[i] < vector[p]) {
                    p = i;
                }
            }
            // Comparación de pociones y cambio
            if(p != k){
                aux = vector[p];
                vector[p] = vector[k];
                vector[k] = aux;
            }
        }
    }

    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n-- Ordenamiento Por Seleccion. for: ");
        int[] arreglo = {10, 64, 34, 25, 12, 22, 4, 11, 90};
        Seleccion(arreglo);
        imprimirArreglo(arreglo);
    }
}

