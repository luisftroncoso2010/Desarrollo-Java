package corn.POO.ClaseCuatro;
public class ArticuloP {
    private String descripcion;
    private  double precioVenta;
    private int stock;
    public  ArticuloP(String descripcion, double precio, int stock){
        this.descripcion = descripcion;
        precioVenta = precio;
        this.stock = stock;
    }
    //Set de descripcion
    public  void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    //Get de descripcion
    public String getDescripcion(){
        return descripcion;
    }
    public boolean hayStock(){
        return  stock>0;
    }
    public double consultarPrecio(){
        return  precioVenta;
    }
    public static void main(String[] args) {
        ArticuloP articulop;
        articulop = new ArticuloP("Articulo uno", 1000, 123);
        System.out.println("Precio del articulo: " + articulop.consultarPrecio());
    }
}
