package corn.POO.ClaseTrece;
public class Cliente {
    private  String nombre;
    private String apellido;
    private String DNI;
    private Double deuda;
    private double limite;
    public Cliente(String nombre, String apellido, String DNI, Double limite){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite = limite;
        deuda = 0.0;
    }

    public  void  comprar(Double importe) throws ClienteException{
        if(deuda + importe > limite) throw new ClienteException("Limite superado para la operacion");
        deuda += importe;
    }
    public void saldarDeuda(Double importe) throws ClienteException {
        if(deuda <= 0) throw new ClienteException("Ey, no tienes deudas...");
        if(deuda < importe) throw  new ClienteException("Tu deuda es: " + deuda);
        if (deuda.equals(importe)) throw new ClienteException("Deuda saldada!");
        deuda -= importe;
    }
    @Override
    public String toString() {
        return "Cliente:" +
                "\tNombre: " + nombre +
                "\tApellido: " + apellido +
                "\tDNI: " + DNI +
                "\tDeuda: " + deuda +
                "\tlimite: " + limite;
    }
}
