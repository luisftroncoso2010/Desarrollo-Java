package corn.POO.ClaseTrece;

public class ClienteException extends Exception{
    public ClienteException() {
        super();  // Llamamos la clase padre. Exception
    }

    public ClienteException(String message) {
        super(message);
    }
}
