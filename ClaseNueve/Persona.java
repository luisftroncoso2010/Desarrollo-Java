package corn.POO.ClaseNueve;
public class Persona implements Amigable {
    private String nombre;
    private Integer felicidad;
    private Integer cantidadAmigos;

    // constructor no borrar
    public Persona(String nombre) {
        this.nombre = nombre;
        felicidad = 100;
        cantidadAmigos = 0;
    }
    //implementa el metodo aca
    @Override
    public void hacerAmigo() {
        cantidadAmigos++;
        felicidad += 10;
    }




    //getters no borrar
    public Integer getFelicidad() {
        return felicidad;
    }
    public Integer getCantidadAmigos() {
        return cantidadAmigos;
    }
}


