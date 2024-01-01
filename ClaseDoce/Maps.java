package corn.POO.ClaseDoce;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    // Creamoa el arrays de tipo maps
    // Por codigo complaciente es mejor colocar un tipo
    Map<Integer, String> mapaHM = new HashMap<>();  // El orden lso muestra desordenados
    Map<Integer, String>  mapaLHM = new LinkedHashMap<>();  // Respeta el orden de inserccion
    Map<Integer, String> mapaTM = new TreeMap<>();  // Los ordena de menor a mayo por su indice

    public static void main(String[] args) {
        // insercion de datos a HashMap
        Maps maps = new Maps();
        maps.mapaHM.put(10, "Ana");
        maps.mapaHM.put(4, "Luis");
        maps.mapaHM.put(12, "Leo");

        // insercion de datos a LinkedHashMap
        maps.mapaLHM.put(10, "Ana");
        maps.mapaLHM.put(4, "Luis");
        maps.mapaLHM.put(12, "Leo");

        // insercion de datos a TreeMap
        maps.mapaTM.put(10, "Ana");
        maps.mapaTM.put(4, "Luis");
        maps.mapaTM.put(12, "Leo");


        System.out.println("-- HasMaps: " + maps.mapaHM);
        System.out.println("-- LinkedHashMap: " + maps.mapaLHM);
        System.out.println("-- TreeMap: " + maps.mapaTM);



    }
}
