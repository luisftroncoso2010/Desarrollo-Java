package corn.POO.ClaseCuatro;
public class Articulo {
    private int numeroDeCuenta;
    private Double saldo;
    public static double valorArticulo = 8000.0;

    public Articulo(int numeroDeCuenta, Double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }
    //crear la funcion depositar y retirar aca
    public void depositar(Double cantidadDeDinero){
        saldo += cantidadDeDinero;
    }
    public  void retirar (Double cantidadDeDinero){
        if(saldo >= cantidadDeDinero) saldo -= cantidadDeDinero;
    }
    //no tocar estas funciones
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo() {
        return saldo;
    }
    //Se crea solo para el ejemplo, pero no deberia es un numero de cuenta y es privado.
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public  static  void cambiarPrecioArticulo(double precio){
        Articulo.valorArticulo = precio;
    }
    public static void main(String[] args) {
        double arti;
        // Creamos los objetos
        Articulo articuloUno = new Articulo(123, 20000.0);
        Articulo articuloDos = new Articulo(456, 50000.0);
        //Imprimimos los obejetos creados
        System.out.println("El numero de cuenta es: " + articuloUno.getNumeroDeCuenta() + " Su saldo es: " + articuloUno.getSaldo() );

        //Accedemos a la varibla de clase
        System.out.println("variable de clase: " + Articulo.valorArticulo);//

        // Mostrar precio
        Articulo.cambiarPrecioArticulo(10000.0);//Seteamos el valor del articulo
        //Mostramos le metodo de clase con el nuevo valor
        System.out.println("Nuevo valor de la variable de clase: " + articuloUno.valorArticulo);
    }
}
