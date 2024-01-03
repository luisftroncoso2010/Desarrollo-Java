package corn.POO.ClaseDoce;

import java.time.LocalDate;
import java.util.Date;

public class Empleado {
    private  String nombre;
    private LocalDate fechaIncorporacion;

    public Empleado(String nombre, LocalDate fechaIncorporacion){
        this.nombre = nombre;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public int calcularAntiguedad() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - fechaIncorporacion.getYear();
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        fechaIncorporacion = fechaIncorporacion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


}
