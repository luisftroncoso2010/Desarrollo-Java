package corn.POO.ClaseCatorce.Composite.Departamentos;
public class DepartFinanciero implements Departamento{
    private int id;
    private String name;
    public void getName(){
        System.out.println(getClass().getSimpleName());
    }
}
