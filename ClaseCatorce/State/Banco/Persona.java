package corn.POO.ClaseCatorce.State.Banco;

public class Persona {
    private String nombre;
    private String apellindo;
    private  int edad;

    public Persona(String nombre, String apellindo, int edad) {
        this.nombre = nombre;
        this.apellindo = apellindo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellindo() {
        return apellindo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellindo(String apellindo) {
        this.apellindo = apellindo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
