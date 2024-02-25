package corn.POO.ClaseCatorce.State.Banco;

public class Abierta implements EstadoVentanilla{
    @Override
    public void atiende(Persona persona) {
        System.out.println("Atiendo a: " + persona.getNombre());
    }
}
