package corn.POO.ClaseCatorce.PatronFactory.FactoryMethod;
public class Cliente {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Producto productoA = factoryA.crearProductos();
        productoA.operacion();

        Factory factoryB = new FactoryB();
        Producto productoB = factoryB.crearProductos();
        productoB.operacion();
    }
}
