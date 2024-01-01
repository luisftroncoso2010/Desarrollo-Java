package corn.POO.ClaseDoce;
import java.util.ArrayList;  // Paquete para las ArraysList
import java.util.Collections;
public class PracticaList {
    //Se pueden eliminar y agregar eleemntos cuando se desee
    ArrayList<String> cars = new ArrayList<String>(); // Lsit de objetos de itpo string
    ArrayList<Integer> numeros = new ArrayList<Integer>(); // Lista de enteros
    public static void main(String[] args) {
        // Instanciamos la clase para acceder a sus datos
        PracticaList lista = new PracticaList();


        // Llenamos la lista con el metodo add
        lista.cars.add("Volvo");
        lista.cars.add("BMW");
        lista.cars.add("Ford");
        lista.cars.add("Mazda");
        //Mostramos la lista entera
        System.out.println("Lista marca carros: " + lista.cars);

        // Accedemos a un elemento de las lsitas
        System.out.println("Elemento de la lista: " + lista.cars.get(2));

        //Cambiaremos un eleento atra ves de su indice
        lista.cars.set(0, "Renault");// Actualizamos el elemento en al poscicion dada
        // Vovlemos a imprimir la lsita actualizada
        System.out.println(lista.cars);

        //Eiminaremos un elemento
        lista.cars.remove(3);
        System.out.println("Lista actualizada con elemento eliminado: " + lista.cars);

        //Tamaño de la lista
        System.out.println("Lista de numero de elementos: " + lista.cars.size());


        //Recorrer la lista, ciclo for
        for (int i = 0; i < lista.cars.size(); i++){
            System.out.println("Indice: " + i + "\tMarca: " + lista.cars.get(i));
        }

        // Recorrer una lista con for each
        for(String i: lista.cars) System.out.println(i);

        lista.cars.add("10"); //Para añadir un numero se debe colocar entre comilla para que lal lista lo tome como string
        System.out.println(lista.cars);

        //Agregar elementos a la lista de enteros
        lista.numeros.add(1);
        lista.numeros.add(10);
        lista.numeros.add(5);
        lista.numeros.add(88);
        lista.numeros.add(89);
        lista.numeros.add(11);

        //Imprimimos la lista de numeros
        System.out.println(lista.numeros);  // Impimri la lsita desordenada. Se imprimi de igual manera como se creo
        Collections.sort(lista.numeros);  // Ordenamos la lista, orden ascendente
        System.out.println("Ordenamos la lista de manera NATURAL: " + lista.numeros);
        Collections.sort(lista.numeros, Collections.reverseOrder());  // Ordenamos la lista en orden descendente
        System.out.println("Ordenamos la lita de manera DESCENDENTE: " + lista.numeros);
    }
}
