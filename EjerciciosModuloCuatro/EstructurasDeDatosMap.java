package corn.POO.EjerciciosModuloCuatro;
import java.util.HashMap;
import java.util.Map;
public class EstructurasDeDatosMap {
    public static void main(String[] args) {
        System.out.println("-- Trabajando con Hasmap: ");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Elon", 21);
        map.put("Jeff", 22);
        map.put("Bill", 48);
        map.put("Warren", null);
        for (String key: map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }

        System.out.println("-- Obtener el numero de entradas (Pares clave - valor): ");
        for (Map.Entry<String, Integer> pair: map.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }
}
