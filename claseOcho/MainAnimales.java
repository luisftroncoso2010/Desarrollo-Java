package corn.POO.claseOcho;

public class MainAnimales {
    public static void main(String[] args) {
        Animal animalUno = new Perro("Firulais", 5);

        Animal animalDos = new Gato("Garfield", 7);
        //Perro
        animalUno.haceRuido();
        //Gato
        animalDos.haceRuido();

    }
}
