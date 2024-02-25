package corn.POO.ClaseCatorce.State.Banco;

public class Suspendida  implements EstadoVentanilla{
    @Override
    public void atiende(Persona persona) {
        // El cajero esta ocupado pero si ve que hay una persona mayor se le atiende
        if (persona.getEdad() > 65) System.out.println("Atendiendo a : " + persona.getNombre());
        else System.out.println("Espere 5 minutos por favor...");
    }
}
