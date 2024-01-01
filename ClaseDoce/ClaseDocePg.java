package corn.POO.ClaseDoce;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ClaseDocePg {
    List<String> listaString = new ArrayList<>();


    public static void main(String[] args) {

        // Instanciamos la clase para acceder a la lista ArrayList
        ClaseDocePg listaString = new ClaseDocePg();
        // Agregamos datos a la lista
        listaString.listaString.add("Juan");
        listaString.listaString.add("Mario");
        listaString.listaString.add("Carlos");
        listaString.listaString.add("Diego");
        listaString.listaString.add("Marcelo");

        // Declaramso el metodo Iterator y le asignamos el iterador a la lista
        Iterator<String> iterator =  listaString.listaString.iterator();


        // Recorremos la lista con for
        System.out.println("Recorrer lista for");
        for (int i = 0; i < listaString.listaString.size() ; i++) {
            System.out.print(" - " + listaString.listaString.get(i));
        }

        // Recorremos la lista con el While
        System.out.println("\nRecorrer lista con while:");
        int i = 0;
        while (i < listaString.listaString.size()) {
            System.out.println(listaString.listaString.get(i));
            i++;
        }

        System.out.println("- Buscar un elemento especifico");
        // Buscamos un elemento en la lista especifico
        boolean encontrado = false;
        int j = 0;
        while (j < listaString.listaString.size() && !encontrado){
            if (listaString.listaString.get(j) == "Mario"){
                encontrado = true;
                System.out.println("Nombre: " + listaString.listaString.get(j) + "\t¿Se encontro?: " + encontrado);
            }else {
                System.out.println("¿Se encontró?: " + encontrado);
                break;
            }
            j++;
        }

        System.out.println("- For each:");
        // For each
        for (String lista_strings: listaString.listaString) {
            System.out.print(lista_strings + ", ");
        }

        System.out.println("\n-- hasNext() con while: ");
        //Iteramos ocn el iterator en bun buble while
        while (iterator.hasNext()) System.out.print(iterator.next() + ", ");

        /*
        System.out.println("\n-- next(): ");
        // HasNext
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

         */


    }
}
