package corn.POO.ClaseCatorce.Composite.Nodos;

import corn.POO.ClaseCatorce.Composite.Nodos.Componente;

public class Hoja implements Componente {
    // Representa los objetos individuales
    @Override
    public void operacion() {
        System.out.println("Operacion en Hoja");
    }
}
