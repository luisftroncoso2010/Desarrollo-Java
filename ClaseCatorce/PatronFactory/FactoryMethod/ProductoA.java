package corn.POO.ClaseCatorce.PatronFactory.FactoryMethod;
public class ProductoA implements Producto {
    // Se sobre escribe el metodo producto y se hace la operacion de ese producto
    @Override
    public void operacion() {
        System.out.println("Operacion ProductoA");
    }
}
