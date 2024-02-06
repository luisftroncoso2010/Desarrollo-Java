package corn.POO.EjerciciosModuloTres.PDFDos.EjercicioUno;


public class Main {
    public static void main(String[] args) {
        Libro libroUno = new Libro("Ana", "El libro de ana", 50);
        Libro libroDos = new Libro("Luis", "El libro de Luis", 60);
        libroUno.mostrarLibro();
        libroDos.mostrarLibro();

        if (libroUno.compareTo(libroDos) == 1) System.out.println(libroUno.getTitulo());
        else if (libroUno.compareTo(libroDos) == -1 ) System.out.println(libroDos.getTitulo());
        else System.out.println("Son iguales, ambas paginas son iguales");
    }
}
