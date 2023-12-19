package corn.POO.ClaseSiete;
public class EmpleadoEP {
    private  String nombre;
    private String apellido;
    private String dni;
    public EmpleadoEP(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public void trabajar(){
        System.out.println("Empelado " + this.nombre + " trabajando");
    }
    public void descansar(){
        System.out.println("Empleado: " + this.nombre + " descansando");
    }
    public String getNombre() {
        return this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido = apellido;
    }
    @Override
    public String toString(){
        return "Empleado: " +
                "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "DNI: " + this.dni;
    }
}
