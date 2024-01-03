package corn.POO.ClaseDoce;
import java.util.Date;
/*Implemantamos la interface Comparable para ordenar la lista*/
public class EmpleadoPG implements Comparable<EmpleadoPG> {
    private String nombre;
    private Date fechaIncorporacion;
    private int edad;
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int calcularAntiguedad(){
        Date fechaActual = new Date();
        return fechaActual.getYear() - fechaIncorporacion.getYear();
    }
    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /*Utilizaremos la edad para ordenar*/
    @Override
    public int compareTo(EmpleadoPG e2) {
        /*el método debe devolver
         * mayor a 1 si este objeto es mayor al que viene por parametro
         * menor a 1 si el objeto que viene por parametro es mayor
         * cero si ambos son iguales*/

        return this.getEdad() - e2.getEdad();
    }
}
