package corn.POO.ClaseCatorce.State.Archivos;

// CaoncreteState: Modo Edición
public class Edicion implements ModoEditor{
    @Override
    public void escribir(String texto) {
        System.out.println("Escribiendo: " + texto);
    }
    @Override
    public void guardar() {
        System.out.println("Guardando Cambios....");
    }
}
