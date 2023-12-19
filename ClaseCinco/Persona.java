package corn.POO.ClaseCinco;
//Se crea la clase perr
public class Persona {
    private  String nombre;
    //Se llama la clase de tipo perro. Relacion "Tiene un"
    private Perro perro;
    //Se crea el constructor de clase perro con el atributo de clase Perro
    public  Persona(String nombre, Perro perro){
        this.nombre = nombre;
        this.perro = perro;
    }
    //Aca lalamamos atrabaes del objeto perro y su metodo get para traer traer getApodo
    public void  pasearPerro(){
        System.out.println(nombre + " está ladrando" + perro.getApodo());
    }
}
