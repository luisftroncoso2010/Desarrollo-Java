package corn.POO.EjerciciosModuloDos;
public class Matriz {
    public static void main(String[] args) {
        System.out.println("-- Matricez");
        // Matrices. [][] filas y columnas
        int edades[][] = {{19, 18, 16}, {15, 14, 12}, {12, 11, 18}};

        // Iteramos la matriz
        for (int filas = 0; filas < 3; filas++){
            for (int columnas = 0; columnas < 3; columnas++){
                // Se imprime el print sin el ln, ya que se necesita imprimir la primera fila
                System.out.print(edades[filas][columnas] + " ");
            }
            System.out.println("");
        }

        System.out.println("-- Añadir datos a una matriz: ");
        int numeros[][] = new int [5][4];
        for (int filas = 0; filas < 5; filas++){
            for (int columnas = 0; columnas < 4; columnas++){
                System.out.print(numeros[filas][columnas] = (int) Math.ceil(Math.random()*100));
                System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println("Operaciones aritmeticas con una matriz: ");
        int suma = 0, resta = 0;
        int multiplicacion = 1;
        double division;
        double raiz;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                suma = suma + numeros[i][j];
                resta = resta + numeros[i][j];
                multiplicacion = multiplicacion * numeros[i][j];
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        division = multiplicacion / suma;
        raiz = Math.sqrt(suma);
        System.out.println("La suma es : " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + division);
        System.out.println("La raiz cuadrada es: " + raiz);
    }
}
