package corn.POO.ClaseSiete;
public class EmpleadoProduccion extends EmpleadoEP{
    private String tiempoExperiencia;

    public EmpleadoProduccion(String tiempoExperiencia,String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }
    //Sobre escribimos el metodo trabajar
    @Override
    public  void trabajar(){
        System.out.println("Empleado de produccion " + getNombre() + " trabajando");
    }
}
