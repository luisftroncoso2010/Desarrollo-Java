package corn.POO.ClaseSiete;
public class EmpleadoMarketing extends EmpleadoEP{
    private  String area;
    public EmpleadoMarketing(String area, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.area = area;
    }
    //Aca validamso la sobre escritura de metodos
    @Override
    public void trabajar(){
        System.out.println("Empleado de marketing " + getNombre() + " trabajando");
    }
    //Aca hacemos la sobre carga de metodos
    public void trabajar(int horasExtras){
        System.out.println("Empleado de marketing " + getNombre() + " trabajando. En el areaa de " + area + " con " + horasExtras + " horas extras");
    }

}

