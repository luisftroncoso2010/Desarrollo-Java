package corn.POO.EjerciciosModuloTres.PDFUno.EjercicioTres;
public class Main {
    public static void main(String[] args) {
        System.out.println("-- Datos casa Uno -- ");
        Casa casaUno = new Casa("Medellin", "Los colores", "Blanco");
        System.out.println("Laciudad Es: " + casaUno.getCiudad() + "\nEl Barrio es: " + casaUno.getBarrio() + "\nEl Color: " + casaUno.getColor());

        System.out.println("-- Datos casa Dos -- ");
        Casa casaDos = new Casa("Laureles", "Azul", 20);
        System.out.println("El Barrios es: " + casaDos.getBarrio() + "\nEl Color es: " + casaDos.getColor() + "\nLos Pisos son: " + casaDos.getPisos());

        System.out.println("-- Datos casa Tres -- ");

        Casa casaTres = new Casa(8, 4, 1, 1);

        System.out.println("Los Pisos son: " + casaTres.getPisos() + "\nEl Habitaciones: " + casaTres.getHabitaciones() + "\nLos Baños Son: " + casaTres.getBaños() + "\nLas Cocinas Son: " + casaTres.getCocinas());
    }
}
