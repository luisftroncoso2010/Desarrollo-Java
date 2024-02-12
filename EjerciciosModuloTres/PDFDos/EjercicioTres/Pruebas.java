package corn.POO.EjerciciosModuloTres.PDFDos.EjercicioTres;
public class Pruebas {
    public static void main(String[] args) {
        int numero = ((int) Math.floor(Math.random() * 3 + 1));
        System.out.println(numero);
        char minusculas = (char) ((int)Math.floor(Math.random()* (123-97)+ 97));
        System.out.println(minusculas);
        char numeros = (char)((int) Math.floor(Math.random()*(58-48)+48));
        System.out.println(numeros);

        System.out.println("-- Prueba algoritmo por Seleccion --");
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        for (int i = 1; i < arreglo.length -1; i++){
            int p = i;

            System.out.print(p + "\t");

        }

    }
}
