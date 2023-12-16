package corn.POO.ClaseCuatro;

public class Cliente {
    //Variables de clase. Se declaran al pricnipio de la clase, se declaran privadas por seguridad
    private Integer numeroCliente;
    private String nombre;
    //Se desde la variable de le da un valor a la deuda desde las variable de clase, yodos los objetos arrancaran con ese valor
    private Double deuda;
    public  Cliente(Integer numeroCliente, String nombre){
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        //Si aca se inicia la variable se puede inicializa y manejar
        deuda = 0.0;
    }
    //Este solo retorna el dado
    public String getNombre(){
        return nombre;
    }
    public  void  setNombre(String nombre){
        this.nombre = nombre;
    }
    public void incrementarDeuda(Double valor){
        System.out.println("Tu deuda anterior era : " + deuda);
        deuda +=valor;
        System.out.println("Tu deuda nueva es: " + deuda);
    }
    public void pagarDeuda(){
        System.out.println("Tu deuda anterior anterior era: " + deuda);
        deuda = 0.0;
        System.out.println("Tu deuda ahora es: " + deuda);
    }
}
