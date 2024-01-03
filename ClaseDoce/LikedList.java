package corn.POO.ClaseDoce;
import java.util.List;
import java.util.LinkedList;

public class LikedList {
    // Creamos la lista
    List<Integer> lista = new LinkedList<>();
    public static void main(String[] args) {
        LikedList lista = new LikedList();

        //añadimos los elementos
        lista.lista.add(85);
        lista.lista.add(40);
        lista.lista.add(60);
        lista.lista.add(100);
        lista.lista.add(110);

        // Acceso a los elementos
        System.out.println(lista.lista.get(2));

        // Modificar los elementos
        lista.lista.set(1, 28);
        System.out.println("La nueva lista es: " + lista.lista);

        // Remover datos de LikedList
        lista.lista.remove(4);
        System.out.println("Lista con el elemento eliminado: " + lista.lista);

        // Recorrer una LinkedList, for each
        System.out.println("For each: ");
        for (Integer i : lista.lista) {
            System.out.print(i + " - "); // For each no da los indices
        }

        // Recorrer una lista con ciclo for
        System.out.println("\nFor:");
        for (int i = 0; i < lista.lista.size() ; i++) {
            System.out.println("Indice: " + i + "\tValor: " + lista.lista.get(i));
        }

        // Buscando valores. Solo de devuelve datos booleanos
        System.out.println(lista.lista.contains(10));

        // Buscar elementos
        System.out.println("El elemento es: " + lista.lista.get(2));
    }
}
