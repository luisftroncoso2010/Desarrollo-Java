package corn.POO.ClaseDoce;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private  String razonSocial;  // Declaramos una varaible de instancia
    private List<Empleado> empleados = new ArrayList<>();  // Creamos una lista para almacenas objetos de tipo empleado

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public  int cantidadEmpleados(){  //Cuanto llamaes este metodo te mostrara la lista de obejtos Empleados
        return empleados.size();
    }

    public String getRazonSocil() {
        return razonSocial;
    }

    public void setRazonSocil(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        //  Creamoa lso objetos mepelados
        Empleado empleadoUno = new Empleado("Luis Fernando", LocalDate.of(2023, 7, 8));
        Empleado empleadoDos = new Empleado("Miguel Cortez", LocalDate.of(2022, 10, 15));
        Empleado empleadoTres = new Empleado("Elias Bechara", LocalDate.of(2020, 12, 16));


        // Insertamos los objetos en la clase empelado
        empresa.agregarEmpleado(empleadoUno);
        empresa.agregarEmpleado(empleadoDos);
        empresa.agregarEmpleado(empleadoTres);


        // Mostramos la cantidad de emleados de una empresa
        System.out.println("La cantidad de empleados uqeh ay en la empresa es: " + empresa.cantidadEmpleados());

        //Mostrar los objetos
        System.out.println(empresa.empleados);


    }
}
