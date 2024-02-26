package corn.POO.ClaseCatorce.Composite.Departamentos;
import java.util.ArrayList;
import java.util.List;

public class DepartComposite implements Departamento{
    private int id;
    private String name;
    private List<Departamento> childDepartaments;
    public DepartComposite(int id, String name){
        this.id = id;
        this.name = name;
        this.childDepartaments = new ArrayList<>();
    }

    // Se muestras lso departamento que ha ido agregados a la lista.
    @Override
    public void getName() {
        childDepartaments.forEach(Departamento::getName);
    }

    public void addDepart(Departamento departament){
        childDepartaments.add(departament);
    }

    public void removeDepart(Departamento departament){
        childDepartaments.remove(departament);
    }
}
