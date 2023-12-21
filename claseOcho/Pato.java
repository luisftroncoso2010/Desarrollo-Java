package corn.POO.claseOcho;
public class Pato extends  AnimalC {
    public Pato(String nombre, Double energia) {
        super(nombre, energia);
    }
    @Override
    public void hacerRuido() {
        System.out.println("Cua cua!");
    }

    public void nadar(){
        System.out.println("Estoy nadando!");
    }
}
