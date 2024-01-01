package corn.POO.ClaseDoce;
import java.util.*;

// Creamos la clase para usar
public class Sets {
    // Cremoa un sets de un tipo de dato especificado
    Set datos = new HashSet();

    // Creamoa una lista HashSet
    Set<String> listaHashSet = new HashSet<>();  // Almacena objetos de propisito general. Se siseño para optimizar el rendimiento mas no para algo de proposito de ordenamiento
    Set<Integer> listaLinkedHashSet = new LinkedHashSet<>();  // Almacena los objetos por orden de inserción, NO permite duplicados

    Set<Integer> listaTreeSet = new TreeSet<>(Collections.reverseOrder());  //Matiene lso elementos en su orden natural
    public static void main(String[] args) {
        // Instanciamos la clase. Asi accedemos a la listas HashSet
        Sets Set = new Sets();

        // Agregamos elementos a la lista
        Set.listaHashSet.add("Apple");
        Set.listaHashSet.add("Mango");
        Set.listaHashSet.add("Grapes");
        Set.listaHashSet.add("Orange");
        Set.listaHashSet.add("Fig");
        Set.listaHashSet.add("Pera");


        // Agregamos elementos duplicados adrede (Esta no recibe de elementos repetidos, automaticamente lo quitará)
        Set.listaHashSet.add("Apple");
        Set.listaHashSet.add("Mango");

        // Agrabamos elementos vacios
        Set.listaHashSet.add(null);
        Set.listaHashSet.add(null);

        // Eliminar un elemento, metodo remove
        Set.listaHashSet.remove("Apple");

        // Verificar si existe un elemento. Metodo contains(), devuelve valores boleanos
        System.out.println("-- Existe elemento en la lista HashSet: " + Set.listaHashSet.contains("Fib"));

        // Tamoa de la lista HashSet, metodo size()
        System.out.println("-- Tamaño de la lista HashSet es: " + Set.listaHashSet.size());

        System.out.println("-- Iterar sobre la lista HashSet con for each: ");
        // Iterar sobre las lista HashSet()
        for (String i: Set.listaHashSet) System.out.print("\t" + i);

        // Mostramos la lista
        System.out.println("\n" + Set.listaHashSet);


        // Empezamos a trabajar con LinkedHashSet
        System.out.println("-- LinkedHashSet: ");
        Set.listaLinkedHashSet.add(123);
        Set.listaLinkedHashSet.add(52);
        Set.listaLinkedHashSet.add(1);
        Set.listaLinkedHashSet.add(8);
        Set.listaLinkedHashSet.add(78);

        System.out.println("-- Lista LinkedHashSet: ");
        // Mostramos la lista. LinkedHasSet
        for (Integer i: Set.listaLinkedHashSet) System.out.print(" - " + i);

        System.out.println("\n-- Ordenar lista LinkedHashSet: ");
        // Ordenaremos el set LinkedHashSet. Paara esto se convierte a un ArraysList y se usa desde Collections con el metodo sort()
        List<Integer> listaSetOrdenada = new ArrayList<>(Set.listaLinkedHashSet);

        Collections.sort(listaSetOrdenada);
        for(Object elemento: listaSetOrdenada) System.out.println(elemento);

        // Empezamos a trabajar con TreeSet
        System.out.println("-- TreeSet: ");

        // Agregar  elementos a TreeSets
        Set.listaTreeSet.add(14);
        Set.listaTreeSet.add(74);
        Set.listaTreeSet.add(12);
        Set.listaTreeSet.add(13);

        System.out.println("-- Set TreeSets: " + Set.listaTreeSet);

        System.out.println("-- Prueba sets. Sets de datos");
        Set.datos.add("Luis");
        Set.datos.add(123);
        for (Object iter: Set.datos) System.out.println(iter);



    }
}
