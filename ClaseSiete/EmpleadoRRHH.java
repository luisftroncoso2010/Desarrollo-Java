package corn.POO.ClaseSiete;
public class EmpleadoRRHH extends EmpleadoEP {
    private int altasLogradas;
    public EmpleadoRRHH(int altasLogradas, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }
    @Override
    public void trabajar() {
        System.out.println("Empleado de RRHH" + getNombre() + " trabajando");
    }
}
