package corn.POO.EjerciciosModuloCuatro;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        // Creamos la lista
        System.out.println("-- List: ");
        List<String> listasIterator = new ArrayList<>();
        listasIterator.add(0, "Colombia");
        listasIterator.add(1, "Ecuador");
        listasIterator.add(2, "Venezuela");
        listasIterator.add(3, "Argentina");

        // Creamos la variable iIterator
        Iterator<String> listaIterable = listasIterator.iterator();

        while (listaIterable.hasNext()){
            System.out.println("Valor:\t" + listaIterable.next());
        }

        System.out.println("-- LikedList: ");
        LinkedList<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add(0, "Stiven");
        listaLinkedList.add(1, "Fernando");
        listaLinkedList.add(2, "Jose");
        listaLinkedList.add(3, "Andres");

        ListIterator<String> listIteratorLinkedList = listaLinkedList.listIterator();

        while (listIteratorLinkedList.hasNext()) System.out.println("Valor:\t" + listIteratorLinkedList.next());

        System.out.println("-- Pilas: ");
        Stack<Integer> pila = new Stack<>();
        System.out.println("La pila esta vacia: " + pila);
        System.out.println("Esta vacia?: " + pila.isEmpty());

        // Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrido
        for (Integer pilita : pila) {
            System.out.println(pilita);
        }

        //Mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia?: " + pila.isEmpty());

        pila.pop(); // Eliminar el ultimo registro que entró
        System.out.println("Esta el 3?: " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());

        //Recorrer pila
        do {
            System.out.println("Valor: " + pila.peek());
        }while (pila.pop() !=null && !pila.empty());

        System.out.println("-- Colas: ");
        Queue<Integer> cola = new LinkedList<>();
    }
}
