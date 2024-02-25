package corn.POO.ClaseCatorce.State.Banco;

public class Banco {
    private String nombre = "BBVBA";
    private String direccion = "Calle 65 #55-30";

    // Creamos una variable para almacenar el estaoo de la ventanilla. Nos permite acceder a los atributtos y metodos de la clase Ventanilla
    private Ventanilla ventanilla;

    public Banco(){
        // El banco usa una ventanilla para entrar
        ventanilla = new Ventanilla();
    }
    public void atiende(Persona persona){
        System.out.println(persona.getNombre() + " Ingresa a la fila.");
        ventanilla.atiendePersona(persona);
    }

    public void suspendeVentnilla(){
        ventanilla.suspendida();
    }

    public void cerraVentanilla(){
        ventanilla.cerrada();
    }

    public  void abrirVentanilla(){
        ventanilla.abierta();
    }

    public  String getNombre() {
        return nombre;
    }
}
