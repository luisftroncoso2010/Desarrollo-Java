package corn.POO.ClaseTrece;

public class FechaException extends  Exception{
    public  FechaException(){  //Constrcutor vacio
    }
    public  FechaException(String mensaje){
        super(mensaje);  // Constructor de la clase que hera de Exception, con el super se llama a la clase.
    }
    public String toString(){
        return "Se produjo la siguiente Exception: " + this.getClass().getName() + "\nMensaje: " + this.getMessage() + "\n";
    }
}
