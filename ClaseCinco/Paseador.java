package corn.POO.ClaseCinco;
//Creamos la clase
public class Paseador {
    private  String nombre;
    //Creamos el constructor
    public Paseador(String nombre) {
        this.nombre = nombre;
    }
    //En "usa un" se debe pasear por parametro al metodo que va au sar el objeto Perro
    public void pasearUnPerro(Perro perro){
        System.out.println(nombre + " sacó a pasear a " + perro.getApodo());
        perro.ladrar();
        perro.ladrar();
    }
    public  void otroMetodo(Perro perro){
        System.out.println(perro);
    }

}
