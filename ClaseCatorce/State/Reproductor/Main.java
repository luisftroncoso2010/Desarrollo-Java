package corn.POO.ClaseCatorce.State.Reproductor;
public class Main {
    public static void main(String[] args) {
        ReproductorMusica reproductor = new ReproductorMusica();
        reproductor.reproducir();
        reproductor.pausar();
        reproductor.setEstadoActual(new EnPausa());
        reproductor.pausar();
    }
}
