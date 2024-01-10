package corn.POO.EjerciciosModuloUno.PDFDos;
public class EjercicioUno {
    public static void main(String[] args) {
        String nombreEstudiante = "Luis";
        double notaUno = 4.0;
        double notaDos = 3.4;
        double notaTres = 3.7;
        double notaCuatro = 3.9;
        double notaCinco = 4.0;

        double promedio = (notaUno + notaDos + notaTres + notaCuatro + notaCinco) / 5;
        System.out.println("El estudiante " + nombreEstudiante + "\tEl promedio es: " + promedio);

    }
}
