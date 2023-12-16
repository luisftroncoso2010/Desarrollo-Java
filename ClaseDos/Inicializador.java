package corn.POO.ClaseDos;
public class Inicializador {
    public static void main(String[] args) {
        //Instanciamos la clase y creamos el objeto
        Mascota mmanchitas = new Mascota("Manchistas", 25,1.5, "Guau Guau", "Perro");
        System.out.println(mmanchitas.toString());//Lalamamos le metodo toString

        Mascota nemo = new Mascota("Nemo", 45, 4.5, "Glu gl", "Pez"); // Creamos un nuevo objeto
        System.out.println("Nombre: " + nemo.nombre);
        System.out.println("Edad: " + nemo.edad);
        System.out.println("Comida: " + nemo.comida);
        System.out.println("Sonido: " + nemo.sonido);
        System.out.println("Tipo: " + nemo.tipo);






    }
}
