package corn.POO.ClaseUno;
public class ClaseUno {
    public static void main(String[] args) {
        // console.log. Como  JavaScript
        System.out.println("Hola mundo");

        //Let const
        String nombre = "Carlos";
        String apellido = "trocoso0";
        int edad = 41;
        boolean feliz = false;
        Double statura = 1.96;

        System.out.println("Mi nombre es " + nombre + " y mi apellido es" + apellido);
        System.out.println("Mi edad es " + edad);
        System.out.println(nombre + feliz);

        if (feliz == true) System.out.println(nombre + " Es feliz");
        else System.out.println(nombre + " esta triste");
        nombre = nombre.toUpperCase(); //Est metodo convierte a mayusculas
        System.out.println(nombre.equals("Carlo"));// Este metodo comparte detodas la maneras
        System.out.println(nombre.compareTo(apellido));
        System.out.println("El nombre " + nombre + " Se ha convertido a mayusculas");
        String puesto = null;//La cadenas no se pueden dejar vacias. No puede udar metodos propios
        if (puesto == "" || puesto == null || puesto == "") {
            System.out.println("Esta cadena esta vacia");
        }
    }
    }



