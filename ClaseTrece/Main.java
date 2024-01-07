package corn.POO.ClaseTrece;

public class Main {
    public static void main(String[] args)  {
        try{
            Fecha fecha = new Fecha(2, 14, 2000);
        }catch (FechaException exception){
            System.err.println(exception.toString());
        }

        System.out.println("-- Trabajando con la clase cliente");
        // Instacioamos la clase cliente
        Cliente clienteUno = new Cliente("David", "Gutierres", "123456", 2000.0);

        // Colocamos el bloque try catch
      /*  try {
            clienteUno.comprar(500.00);
            clienteUno.saldarDeuda(500.0);
        }catch (ArithmeticException exc){
            System.out.println("Aqui algo falló");
        }catch (Exception exc){
            System.err.println("Aca algo falló");
        }
        */
        //System.out.println(clienteUno);
        try {
            clienteUno.comprar(1000.0);  // Acaspera el limite. Y envia la excepcion personalizada
            clienteUno.comprar(200.0);
            clienteUno.saldarDeuda(100.0);
            clienteUno.saldarDeuda(10.0);
            clienteUno.saldarDeuda(1000.0);
            clienteUno.saldarDeuda(90.0);

        }catch (ClienteException exception){
            System.out.println(exception.getMessage());  // Meuestra el mensaje que tiene el metodo que aplica la excepcion personalizada
        }

        // Mostramos los datos del cliente.
        System.out.println(clienteUno);  // Mostraos los datos del cliente
        System.out.println("Fin del programa... ");

    }
}
