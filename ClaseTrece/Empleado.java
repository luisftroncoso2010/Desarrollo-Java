package corn.POO.ClaseTrece;
/* Tenemos una clase Empleado cuyos atributos son nombre, apellido y sueldo.
Un empleado no puede tener sueldo menor a 0, el nombre y apellido de un empleado no pueden ser null.
Agregar una RuntimeException, para que no se puedan crear objetos que no cumplan con los requisitos.
Los mensajes que deben tener las excepciones, según corresponda son:
"Nombre no puede estar vacío"
"Apellido no puede estar vacío"
"Sueldo no puede ser menor o igual a cero"
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int sueldo;

    public Empleado(String nombre, String apellido, int sueldo) throws Exception {
        if (nombre == null) throw new RuntimeException("Nombre no puede estar vacío");
        if (apellido == null) throw  new RuntimeException("Apellido no puede estar vacío");
        if (sueldo <= 0) throw new  RuntimeException("Sueldo no puede ser menor o igual a cero");
        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldo=sueldo;
    }

    //No modificar
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getSueldo() {
        return sueldo;
    }
}
