package corn.POO.ClaseCatorce.State.Reproductor;

// ConcreteState: Estado Detenido
public class Detenido implements EstadoReproductor {
    @Override
    public void reproducir() {
        System.out.println("Iniciando La Reproduccion");
    }

    @Override
    public void pausar() {
        System.out.println("No se puede pausar, el reproductor esta detenido");
    }

    @Override
    public void detener() {
        System.out.println("Ya estoy listo");
    }
}
