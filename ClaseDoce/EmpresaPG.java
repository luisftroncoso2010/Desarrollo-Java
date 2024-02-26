package corn.POO.ClaseDoce;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class EmpresaPG {
    private String razonSocial;
    /*utilizamos una colección ArrayList y solo almacena <Empleados>*/
    private List<EmpleadoPG> empleados = new ArrayList<>();

    /*el metodo incorporarEmpleado agrega un empleado a la colección*/
    public void incorporarEmpleado(EmpleadoPG empleado){
        empleados.add(empleado);
    }

    public int cantidadEmpleados()
    {
        return empleados.size();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void mostrarEmpleados(){
        /*recorremos la lista de empleados. Como usamos Generics directamente recorremos
         * empledos y no object*/
        for(EmpleadoPG empleado : empleados)
            System.out.println(empleado.getNombre());
    }

    public void mostrarEmpleadosOrdenadosPorEdad() {
        empleados.sort(Comparator.reverseOrder());  // Si lo dejo en null los ordena de menor a mayor y si lo dejo en Comparator lod ordena de mayor a menor
        mostrarEmpleados();
    }
}
