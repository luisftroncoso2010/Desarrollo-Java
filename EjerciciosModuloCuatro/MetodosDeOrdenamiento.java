package corn.POO.EjerciciosModuloCuatro;
public class MetodosDeOrdenamiento {
    public static void Burbuja(int[] vector){
        int temp;
        // Primer ciclo de recorridos. Desde el segundo elemento hasta el ultimo
        for(int i = 1; i < vector.length; i++){
            // Segundo ciclo de recorrido. Desde el Inicio hasta el penultimo
            for(int j = 0; j < vector.length -1; j++){
                // Compracion de las posciones y sus valores
                // Para determinar en mayor de la comparacion
                if (vector[j] > vector[j + 1]){
                    // Intercambio de posiciones y valores
                    temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }
    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }
    public static void insercion(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++){
            // ACa se lamacena el elemento que se desea evaluar
            int aux = arreglo[i];
            int j;
            // Segundo ciclo de recorrido
            for (j = i - 1; j >= 0 && arreglo[j] > aux; j--){
                arreglo[j + 1] = arreglo[j];
            }
            // Asignacion de valores al ciclo
            arreglo[j + 1] = aux;
        }
    }
    public static void insercionWhile(int[] arreglo){
        // Creamos el ciclo para recorrer el vector del mismo tamaño
        for (int i = 1; i < arreglo.length; i++){
            // Almacenamos en la key el elemento del actual del arreglo
            int key = arreglo[i];
            // Iniciamos la variable j en -1 (Poscicion)
            int j = i - 1;
            //Si la poscion de j es mayor que 0
            //Y la poscion del arreglo de j es mayor a la key (Key tiene el elemento del arreglo de i "arreglo[i]")
            while (j >= 0 && arreglo[j] > key){
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
    }
    public static void main(String[] args)  {
        System.out.println("-- Ordenamiento burbuja");
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("-- Vector original: ");
        imprimirArreglo(arreglo);

        System.out.println("\n-- Areglo ordenado: " );
        Burbuja(arreglo);
        imprimirArreglo(arreglo);

        System.out.println("\n-- Ordenamiento Por Inserccion: ");
        int[] arregloDos = {10, 64, 34, 25, 12, 22, 11, 90};
        insercion(arregloDos);
        imprimirArreglo(arregloDos);

        System.out.println("\n-- Ordenamiento Por Inserccion While: ");
        int[] arregloTres = {10, 64, 34, 25, 12, 22, 11, 90};
        insercionWhile(arregloTres);
        imprimirArreglo(arregloTres);
    }
}
