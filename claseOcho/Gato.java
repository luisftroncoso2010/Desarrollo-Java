package corn.POO.claseOcho;
public class Gato extends Animal{
    public Gato(String nombre, Integer edad) {
        super(nombre, edad);
    }
    @Override
    public void haceRuido() {
        System.out.println("Miauuu!!");
    }
}
