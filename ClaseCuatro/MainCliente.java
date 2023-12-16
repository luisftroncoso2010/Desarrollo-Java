package corn.POO.ClaseCuatro;
public class MainCliente {
    public static void main(String[] args) {
        //New hace referencia al nuevo objeto y creamoa el primer objeto
        Cliente clienteUno = new Cliente(2, "David");
        //Lmamamos el metodo get para saber le nombre
        System.out.println("El nombre del objeto clienteUno: " + clienteUno.getNombre());
        clienteUno.setNombre("Ana");
        System.out.println("El Nuevo nombre del objeto clienteUno: " + clienteUno.getNombre());
        clienteUno.incrementarDeuda(500.0);
        clienteUno.pagarDeuda();
    }

}



