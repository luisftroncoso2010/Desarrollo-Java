package corn.POO.EjerciciosModuloTres.PDFDos.EjercicioDos;
public class Contacto {
    private String nombre;
    private Integer numero;
    public Contacto(String nombre, Integer numero){
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    // Se debe colocar. Ya que en Agenda cuando lo itere no lo va a hayar
    @Override
    public String toString() {
        return "-- Contacto\t" +
                "\nNombre: " + this.nombre  +
                "\nNumero: " + this.numero;
    }
}
