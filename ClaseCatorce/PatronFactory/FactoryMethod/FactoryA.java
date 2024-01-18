package corn.POO.ClaseCatorce.PatronFactory.FactoryMethod;
public class FactoryA implements Factory {
    @Override
    public Producto crearProductos() {
        return new ProductoA();
    }
}
