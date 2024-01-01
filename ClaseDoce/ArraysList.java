package corn.POO.ClaseDoce;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;  // Colocamos el paquete donde se encuentra la interface list


public class ArraysList {
    // Aca se declara la lista y se inicia
    List<Integer> lista = new ArrayList<Integer>();
    public static void main(String[] args) {


        // Instanciamos la clase para poder acceder a la lista
        ArraysList lista = new ArraysList();

        // Aregamos elementos a la lista
        lista.lista.add(2);
        lista.lista.add(12);
        lista.lista.add(154);
        lista.lista.add(19);
        lista.lista.add(1);
        System.out.println("lista desordenada: " + lista.lista);  // Mostramos la lista desordenada
        Collections.sort(lista.lista);
        System.out.println("lista Ordenada: " + lista.lista);

        // Accedemos a los elementos con el metodo get() por indice
        System.out.println(lista.lista.get(1));

        // Modificar elementos
        System.out.println(lista.lista.set(1, 80));  // Aca mostrará el elemento que se cambiará, mas no el nuevo valor
        System.out.println("En la lista pocision 1 " + lista.lista);  // Motramos la lsita actualizada


        // Iteramos la lista atraves de un ciclo for normal
        for (int i = 0; i < lista.lista.size(); i++) System.out.println("Indice: " + i + "\tValores: " +  lista.lista.get(i));

        System.out.println("Mostrando elementos con for each:");
        // Itreamos la lista  atraves de un for each
        for (Integer listai : lista.lista) System.out.println(listai);

        // Eliminar elementos con el metodo remove
        lista.lista.remove(3);

        // Tamañao del ArrayList
        Integer tamaño = lista.lista.size();
        System.out.println("Tamañao de la lista: " + tamaño);


        // Buscamos elementos en la lista
        System.out.println(lista.lista.contains(80));  // Devuelve true si el objeto se encuentra en la lista


    }
}
