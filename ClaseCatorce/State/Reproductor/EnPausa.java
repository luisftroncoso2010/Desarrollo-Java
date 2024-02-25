package corn.POO.ClaseCatorce.State.Reproductor;
// ConcreteState: Estado en pausa
public class EnPausa implements EstadoReproductor{
    @Override
    public void reproducir() {
        System.out.println("Renaudando la Reproduccion");
    }

    @Override
    public void pausar() {
        System.out.println("Ya estoy en pausa");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo la Reproduccion");
    }
}
