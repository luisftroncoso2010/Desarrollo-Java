package corn.POO.ClaseCatorce.PatronFactory.FactoryMethod;
// Creamoa la clase factoryA para el producto A
public class FactoryA implements Factory {
    // Creamoa el metodo apra que nos retorne la isntancia del producto creado.
    // La firma del metodo es de tipo producto
    @Override
    public Producto crearProductos() {
        return new ProductoA();  // Rotornamos la instancia
    }


}
