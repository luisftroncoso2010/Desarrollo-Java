package corn.POO.ClaseCatorce.PatronFactory.FactoryMethod;
public class FactoryB implements Factory{
    @Override
    public Producto crearProductos() {
        return new ProductoB();
    }
}
