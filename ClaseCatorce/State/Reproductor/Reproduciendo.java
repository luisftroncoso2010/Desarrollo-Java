package corn.POO.ClaseCatorce.State.Reproductor;
// Estado reproducciendo
public class Reproduciendo implements EstadoReproductor{
    @Override
    public void reproducir() {
        System.out.println("Ya estoy Reproduciendo");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando la Reproduccion");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo la Reproduccion");
    }
}
