package corn.POO.claseOcho;
public class Main {
    public static void main(String[] args) {
        AnimalC animal = new Pato("Lucas", 1500.0);
        AnimalC animalUno = new Vaca("Lola", 100.0, 1500.0);
        animal.hacerRuido();
        animal.comer(200.0);

        animalUno.comer(500.0);
        animalUno.hacerRuido();

        //Imprimimos el pato
        System.out.println(animal);
        //Imprimimos la vaca
        System.out.println(animalUno);
        //Hacemos castin. Le damos a entender al objeto que hace parte de el através de la variable de instancia
        ((Pato)animal).nadar();
        ((Vaca) animalUno).hacerRuido();
    }
}
