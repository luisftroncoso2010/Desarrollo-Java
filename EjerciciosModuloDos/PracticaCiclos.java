package corn.POO.EjerciciosModuloDos;
public class PracticaCiclos {

    public static void main(String[] args) {
        boolean x = true;
        while (x){
            System.out.println("Ciclo while: ");
            x = false;
        }
        System.out.println("Nuevo valor de x: " + x);


        // Numeros impares
        int i = 1;
        while (i <= 10){
            if (i % 2 != 0) System.out.println(i + " ");
            i++;
        }


        // Descomponer todos sus caracteres
        System.out.print("Descomponer palabras: ");
        String palabra = "Luis Fernando";
        int j = 0;

        while (j < palabra.length()) {
            char caracter = palabra.charAt(j);
            System.out.print(caracter + " ");
            // Incrementa el índice para pasar al siguiente carácter
            j++;
        }

        System.out.println("\nDescomprener parabra: ");
        String palabraDos = "Diego";
        int k = 0;
        System.out.println("La palabrar " + palabraDos + " tiene " + palabraDos.length() + " caractares");
        while (k < palabraDos.length()){
            char caracteres = palabraDos.charAt(k);
            System.out.println(caracteres + " en la posición: " + k);
            k++;
        }

        System.out.println("Numeros randomm ultiplo de 10: ");
        boolean y = true;
        while (y){
            double n = Math.ceil(Math.random() * 60);
            System.out.println(n);
            if (n % 10 == 0) break;
        }

        System.out.println("-- Ejercicio do while: ");
        // Ejercicio con do while.
        do{
            System.out.println("Do While!");
        }while (false);

        // Do while mostrar i. Numeros del 0 a 5
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a <= 5);
    }
}
