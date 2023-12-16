package corn.POO.ClaseDos;
public class Mascota {
    //La clase es lo que se va modelar en el objeto
    String nombre;
    //Para la edad puede ser int o integer
    int edad; //int es un tipo de variable primitivo
    Integer edadDeLaMascota;//Integer es un tipo de dato envolvente
    Double comida;//Double es un tip de dato envolvente, es decir se pueden trabajar con metodos
    String sonido;
    String tipo;

    public Mascota(String nombre, int edad, Double comida, String sonido, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.comida = comida;
        this.sonido = sonido;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return  "Datos de la mascota: " + "\n" +
                "Nombre = " + nombre + "\n" +
                "Edad = " + edad + "\n" +
                "Comida = " + comida + "\n" +
                "Sonido = " + sonido + "\n" ;
    }
}
