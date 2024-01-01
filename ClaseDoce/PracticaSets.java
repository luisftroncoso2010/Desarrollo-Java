package corn.POO.ClaseDoce;
import java.util.*;
public class PracticaSets {
    private  static void insertionOrder(){
        LinkedHashSet<String> geekLinkSet = new LinkedHashSet<>();
        TreeSet<String> geekTreeSet = new TreeSet<>();
        HashSet<String> geekHashSet = new HashSet<String>();

        for (String str: Arrays.asList("Geek2", "Geek1", "Geek3", "Geek1")){
            geekLinkSet.add(str);
            geekTreeSet.add(str);
            geekHashSet.add(str);
        }
        System.out.println("Insertion order" + " of objectsin LinkedHashSet: " + geekLinkSet);
        System.out.println("Insertion order" + " of objectsin TreeSet: " + geekTreeSet);
        System.out.println("Insertion order" + " of objectsin HashSet: " + geekHashSet);

    }
    private static void insertionTime(){
        // Creamos un set LinkedHahSet
        Set<Integer> numbersLLS = new LinkedHashSet<>();

       long startTime = System.nanoTime();  // Creamoa una variable para guardar el tiempo de inicio de ejecucion
       for (int i = 0; i < 1000; i++) numbersLLS.add(i);  // Agregamos elementos desde 0 hasta 1000
       long endTime = System.nanoTime();
        System.out.println("Total time to insert 1000 elements in LinkedHashSet in sec: " + (endTime - startTime));


        // Creamoa un nuevo set TreeSet
        Set<Integer> numbersTS = new TreeSet<>();

        // Inicializamos la variable para medir el timepo de inicio
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)numbersTS.add(i);
        endTime = System.nanoTime();
        System.out.println("Total time to insert 1000 elements in TreeSet in sec: " + (endTime - startTime));


        // Creamoa un nuevo set HashSet
        Set<Integer> numbersHS = new HashSet<>();

        // Inicializamos la variable para medir el timepo de inicio
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) numbersHS.add(i);
        endTime = System.nanoTime();
        System.out.println("Total time to insert 1000 elements in HashSet in sec: " + (endTime - startTime));
    }


    private static void deletion(){
        // Creamos un set LinkedHahSet
        Set<Integer> deletionLLS = new LinkedHashSet<>();

        long startTime = System.nanoTime();  // Creamoa una variable para guardar el tiempo de inicio de ejecucion
        for (int i = 0; i < 1000; i++) deletionLLS.remove(i);  // Agregamos elementos desde 0 hasta 1000
        long endTime = System.nanoTime();
        System.out.println("Total time to Deletion 1000 elements in LinkedHashSet in sec: " + (endTime - startTime));


        // Creamoa un nuevo set TreeSet
        Set<Integer> removeTS = new TreeSet<>();

        // Inicializamos la variable para medir el timepo de inicio
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++)removeTS.remove(i);
        endTime = System.nanoTime();
        System.out.println("Total time to Deletion 1000 elements in TreeSet in sec: " + (endTime - startTime));


        // Creamoa un nuevo set HashSet
        Set<Integer> removeHS = new HashSet<>();

        // Inicializamos la variable para medir el timepo de inicio
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) removeHS.add(i);
        endTime = System.nanoTime();
        System.out.println("Total time to Deletion 1000 elements in HashSet in sec: " + (endTime - startTime));

    }

    public static void main(String[] args) {
        System.out.println("-- Insertar datos en Sets");
        insertionOrder();
        System.out.println("-- Insertar numeros  en Sets");
        insertionTime();
        System.out.println("-- Remover numeros  en Sets");
        deletion();
    }
}
