package corn.POO.EjerciciosModuloTres.PDFUno.EjercicioUno;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("Medellin");
        ciudad.setPoblacion(52000000);
        ciudad.setPais("Colombia");
        ciudad.setPresidente("Gustavo petro");

        System.out.println("El pais es: " + ciudad.getPais() + "\nLa Ciudad es: " + ciudad.getNombre() + "\nLa Poblacion es: " + ciudad.getPoblacion() + "\nEl Presidente es: " + ciudad.getPresidente());
    }
}
