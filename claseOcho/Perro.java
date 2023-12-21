package corn.POO.claseOcho;

public class Perro extends Animal {


    public Perro(String nombre, Integer edad) {
        super(nombre, edad);
    }
    @Override
    public void haceRuido() {
        System.out.println("Wouff!!");
    }
}
