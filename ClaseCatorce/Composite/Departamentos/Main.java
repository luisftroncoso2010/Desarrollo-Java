package corn.POO.ClaseCatorce.Composite.Departamentos;
public class Main {
    public static void main(String[] args) {
        // Instanciamos un departamentov Ventas
        DeapartVentas deapartVentas = new DeapartVentas();
        //deapartVentas.getName();

        // Creamos otro departamento Financiero
        DepartFinanciero departFinanciero = new DepartFinanciero();
        //departFinanciero.getName();

        // Creamoa el departamento Composite
        DepartComposite departComposite = new DepartComposite(1, "CompositeUno");

        departComposite.addDepart(departFinanciero);
        departComposite.addDepart(deapartVentas);
        departComposite.addDepart(new DepartFinanciero());
        departComposite.getName();
        System.out.println("-- Agregamos un nodo.");
        DepartComposite departCompositeCompuesto = new DepartComposite(2, "CompositeDos");
        departCompositeCompuesto.addDepart(deapartVentas);
        departCompositeCompuesto.addDepart(departFinanciero);
        departCompositeCompuesto.addDepart(departComposite);
        departCompositeCompuesto.getName();

    }
}
