package corn.POO.claseOcho;
//Cremoa la clase AnimaC de la clase 8
public abstract class AnimalC {
    private  String nombre;
    private Double energia;

    public AnimalC(String nombre, Double energia) {
        this.nombre = nombre;
        this.energia = energia;
    }
    public void comer(Double comidaPeso){
        energia +=comidaPeso;
    }
    public abstract void hacerRuido();

    @Override
    public String toString() {
        return "Nombre del animal: " + nombre +
                "   Energia: " + energia;
    }
}
