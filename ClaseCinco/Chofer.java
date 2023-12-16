package corn.POO.ClaseCinco;
public class Chofer {
    //Creamos los atributos de clase
    private String nombre;
    private  String apellido;
    private  Auto auto;
    //Creamos el contructor, con el objeto de tipo auto
    public  Chofer(String nombre, String apellido, Auto auto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }
    //Ver patente de Auto
    public String verPatente(){
        return auto.getPatente();
    }

}
