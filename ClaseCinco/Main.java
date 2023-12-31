package corn.POO.ClaseCinco;
public class Main {
    public static void main(String[] args) {
        Chofer choferUno, choferDos;

        //Auto
        Auto autoUno = new Auto("DFG456", "Renault", "Sandero");

        //Chofer uno
        choferUno = new Chofer("Luis", "Troncoso", new Auto("ABC123", "Toyota", "Prado"));

        //Chofer dos
        choferDos = new Chofer("Leo", "Montes", autoUno);
        System.out.println("La patrente del auto es:" + choferUno.verPatente());

        //Instanciamos tipo perro
        Perro perroUno = new Perro("Igor");
        Persona persona = new Persona("Patricia", perroUno);

        //Mostramos el mensaje
        System.out.println("La persona tiene un perro, con el nombre: " + perroUno.getApodo());
    }
}
