package corn.POO.claseOcho;
public class Vaca extends AnimalC {
    private Double peso;
    public Vaca(String nombre, Double energia, Double peso) {
        super(nombre, energia);
        this.peso = peso;
    }
    @Override
    public void hacerRuido() {
        System.out.println("Muuu!!");
    }

    @Override
    public void comer(Double comidaPeso) {
        super.comer(comidaPeso);
        peso += comidaPeso / 2;//50% de la comuda lo suma en peso
    }

    @Override
    public String toString() {//Se tre el nombre y le energia del padre. Si se queire traer
        return super.toString() + " El peso es: " + peso;
    }
}
