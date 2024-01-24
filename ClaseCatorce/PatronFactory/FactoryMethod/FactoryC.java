package corn.POO.ClaseCatorce.PatronFactory.FactoryMethod;

public class FactoryC implements Factory{
    @Override
    public Producto crearProductos() {
        return new ProductoC();
    }
}
