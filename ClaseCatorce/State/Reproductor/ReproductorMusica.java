package corn.POO.ClaseCatorce.State.Reproductor;
// Contexto: Reproductor de musica
public class ReproductorMusica {
    private EstadoReproductor estadoActual;

    public ReproductorMusica(){
        // Inicializamos con un estado predeterminado
        this.estadoActual = new Detenido();
    }

    public void setEstadoActual(EstadoReproductor estadoActual){
        this.estadoActual = estadoActual;
    }

    public void reproducir(){
        this.estadoActual.reproducir();
    }

    public void pausar(){
        this.estadoActual.pausar();
    }

    public void detener(){
        this.estadoActual.detener();
    }
}
