package corn.POO.ClaseCatorce.State.Banco;
public class Ventanilla {
    private String cajero;
    private EstadoVentanilla estado;


    public Ventanilla(){
        estado = new Abierta();
    }

    // Se almacena en cada metodo la instancia de la clase correspondiente
    public void suspendida(){
        estado = new Suspendida();
    }

    public void cerrada(){
        estado = new Cerrada();
    }

    public void abierta(){
        estado = new Abierta();
    }


    // Creamoa un metodo para que tenga a las personas
    public void atiendePersona(Persona persona){
        estado.atiende(persona);
    }

    public String getCajero(){
        return cajero;
    }
}
