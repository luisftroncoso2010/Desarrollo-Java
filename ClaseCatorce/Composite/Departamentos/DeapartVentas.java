package corn.POO.ClaseCatorce.Composite.Departamentos;
public class DeapartVentas implements Departamento{
    private int id;
    private String name;
    @Override
    public void getName() {
        System.out.println(getClass().getSimpleName());
    }
}
