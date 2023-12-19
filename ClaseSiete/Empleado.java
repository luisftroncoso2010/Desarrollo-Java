package corn.POO.ClaseSiete;

public class Empleado extends Persona {
    private  double sueldo;
    private double descuento;
    private String legajo;


    public Empleado(String legajo,String nombre, String dni) {
        super(nombre, dni);
        this.legajo = legajo;
        sueldo = 30000;
    }

}
