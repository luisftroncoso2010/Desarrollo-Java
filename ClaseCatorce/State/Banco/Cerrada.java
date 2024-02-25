package corn.POO.ClaseCatorce.State.Banco;

public class Cerrada implements EstadoVentanilla{
    @Override
    public void atiende(Persona persona) {
        System.out.println("Ventanillada esta cerrada");
    }

}
