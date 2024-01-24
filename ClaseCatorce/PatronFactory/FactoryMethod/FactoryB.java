package corn.POO.ClaseCatorce.PatronFactory.FactoryMethod;
// Creamos la instancia factory para el producto
public class FactoryB implements Factory{
    @Override
    public Producto crearProductos() {
        return new ProductoB();
    }
}
