package corn.POO.ClaseCatorce.ClasCatorce;
public class Main {
    public static void main(String[] args) {
        // Si dejo el contructor de ProductoFactory privado, no melo dejara usar (Para usarlo debe estar publico)
        ProductoFactory fabricaUno = ProductoFactory.getInstance();
        Almacen almacen = new Almacen();
        almacen.agregarProducto(fabricaUno.construirProducto("CAJA10X10"));
        almacen.agregarProducto(fabricaUno.construirProducto("PELOTAFUTBOL"));
        almacen.agregarProducto(fabricaUno.construirProducto("PELOTATENIX"));
        System.out.println(fabricaUno);
        System.out.println(almacen.calcularEspacioNecesario());
    }
}
