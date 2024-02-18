package corn.POO.Generics;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Creamoas las instancias de los generic
        Generics genericsUno = new Generics("Luis", "Leo");
        Generics genericsDos = new Generics("Ana", "Juan");
        Generics genericsTres = new Generics("Luis", "Leo");
        Generics genericsCuatro = new Generics<>(2, "Real");

        // Creamos la lista de datos genericos
        List<Generics> listaGenerics = new ArrayList<>();
        listaGenerics.add(genericsUno);
        listaGenerics.add(genericsDos);
        listaGenerics.add(genericsTres);
        listaGenerics.add(genericsCuatro);

        for (Generics generics: listaGenerics){
            generics.MostrarContenido();
        }
    }


}
