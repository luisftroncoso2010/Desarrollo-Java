package corn.POO.EjerciciosModuloDos;
public class Vectores {
    public static void main(String[] args) {
        System.out.println("Calcular notas con vector: ");
        double notas[] = new double[5];
        int porcentaje[] = {20, 10, 30, 20, 20};
        notas[0] = 4.5;
        notas[1] = 3.2;
        notas[2] = 5.0;
        notas[3] = 1.5;
        notas[4] = 4.3;

        double promedio = 0;
        for(int i = 0; i < notas.length; i++){
            promedio = (notas[i] * porcentaje[i] / 100) + promedio;
        }
        System.out.println("Promedio final " + Math.round(promedio));

        // Cambio de nombres con letras por numeros
        System.out.println("-- Cambio de letras por numeros en Nombre: ");
        // Creamos el vector de nombres
        String nombres[] = {"JUAN", "EVELIN", "ANA", "MARK", "DIEGO", "ABCD", "ZY"};
        // Creamos el vestor de caracteres (Abecedario)
        char caracteres[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        // Creamos los vectores para el numero de caracteres
        int numeros [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
        // Iniciamos la variable del ciclo (While)
        int x = 0;
        // Variable para colocar los caracteres
        String nombreAuxiliar = "";
        final int NUM_ELEMENTOS = nombres.length;
        // Colocamos la variable x PARA INICIAR el ciclo while, ITERAR EL VECTOR NOMBRES
        while (x < NUM_ELEMENTOS){
            // Cuenta caracter de cada elemento, ya que x tiene los elementos
            for(int j = 0; j < nombres[x].length(); j++){
                // Recorre el vector de caracteres
                for (int k = 0; k < caracteres.length; k++){
                    // Colocamos la condicion para validar cada caracter, es decir si nombre tiene ese caracter (charAt() tiene un indice, en este caso j para que busque dentron del nombre que tenga la iteracion)
                    if(nombres[x].charAt(j) == caracteres[k]){
                        //Si tiene ese caracter le sumamos a nombreAuxiliar el numero que tenga k
                        nombreAuxiliar += numeros[k];
                    }
                }
            }
            // Almacenamos el nombre que tenga nombreAuxiliar conformado por numeros a nombres[x]
            // Se muestran los cambios de las itraciones (nombres[x], ya tiene el nombre concatenado de numeros)
            System.out.println("Nombre en numeros es: " + nombres[x] + "\tNombre es: " + nombreAuxiliar);
            // Se reinicia la variable auxiliar para la proxima iteracion
            nombreAuxiliar = "";
            // se coloca el x ++ para que termine las iteraciones (Son 6)
            x++;
        }
    }
}
