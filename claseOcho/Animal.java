package corn.POO.claseOcho;

public abstract class Animal {
    private String nombre;
    private Integer edad;

    public Animal(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //No tiene un comportamiento establecido. No se abren llaves
    public abstract void haceRuido();
}
