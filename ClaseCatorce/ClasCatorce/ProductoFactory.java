package corn.POO.ClaseCatorce.ClasCatorce;

public class ProductoFactory {
    // Creamoa la instancia de la clase (Siglenton)
    private static ProductoFactory instance = new ProductoFactory();
    private ProductoFactory(){
        // Constructor vacio
    }
    public  static ProductoFactory getInstance(){
        return instance;
    }

    // Implementacion del patron de diseño factory Method
    public Producto construirProducto(String codigo){
        switch (codigo){
            case "CAJA10X10":
                return new Caja(2.0, 10.0, 10.0, 10.0);
            case "PELOTAFUTBOL":
                return new Pelota(0.5, 11.0);
            case "PELOTATENIX":
                return new Pelota(0.2, 0.32);
        }
        return null;
    }
}
