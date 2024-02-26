package corn.POO.ClaseCatorce.Composite.Nodos;

import corn.POO.ClaseCatorce.Composite.Nodos.Componente;

import java.util.ArrayList;
import java.util.List;

public class Nodo implements Componente {
    // Se le crea una lista de componentes
    private List<Componente> componentes = new ArrayList<>();

    // Agreamos componente
    public void agregar(Componente componente){
        componentes.add(componente);
    }

    // Recorremos la lsita de componentes
    @Override
    public void operacion() {
        for(Componente componente: componentes){
            componente.operacion();
        }
    }
}
