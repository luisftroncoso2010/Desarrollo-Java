package corn.POO.ClaseCinco;
public class Auto {
    //Atributos de la clase
    private String patente;
    private  String marca;
    private String modelo;
    private  Motor motor; //Definimos el atributo motor
    //Creamos el constructor
    public Auto(String patente, String marca, String modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        motor = new Motor();//Intanciamos los atributos de tipo motor

    }
    //Accedemos a la patente. Aca se le debe dejar su responsabilidad, ya que la patentete es propia de Auto
    public String getPatente() {
        return patente;
    }
}
