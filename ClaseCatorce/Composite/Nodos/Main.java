package corn.POO.ClaseCatorce.Composite.Nodos;

public class Main {
    // Uso del patron
    public static void main(String[] args) {
        Hoja hojaUno = new Hoja();
        Hoja hojaDos = new Hoja();

        // Instanciamos los nodos y le agregamos las hojas
        Nodo nodo = new Nodo();
        nodo.agregar(hojaUno);
        nodo.agregar(hojaDos);

        // No do compuesto
        Nodo nodoCompuesto = new Nodo();
        // Agregamos lso compuestos
        nodoCompuesto.agregar(nodo);
        // Agregamos una nueva instancia de la hoja
        nodoCompuesto.agregar(new Hoja());

        // Ejecutamos la operacion
        ejecutarOperacion(hojaUno);
        ejecutarOperacion(nodo);
        ejecutarOperacion(nodoCompuesto);

    }
    private static void ejecutarOperacion(Componente componente){
        // Se llama la inter face
        componente.operacion();
    }
}
