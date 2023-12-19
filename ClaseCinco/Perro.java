package corn.POO.ClaseCinco;
//Creamos la clase perro
public class Perro {
    //Creamos el el atributo de clase perro
    private  String apodo;
    //Creamo el constructor
    public Perro(String apodo){
        this.apodo = apodo;
    }

    public  void ladrar(){
        System.out.println("Gua Guau!");
    }

    public String getApodo() {
        return apodo;
    }
}
