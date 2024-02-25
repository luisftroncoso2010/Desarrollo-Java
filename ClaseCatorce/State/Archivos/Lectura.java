package corn.POO.ClaseCatorce.State.Archivos;

// ConcreteState: Modo de solo lectura
public class Lectura implements ModoEditor{
    @Override
    public void escribir(String texto) {
        System.out.println("No se puede Escribir. Está en modo lectura");
    }

    @Override
    public void guardar() {
        System.out.println("Se ha guardado");
    }
}
