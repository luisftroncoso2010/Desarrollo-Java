package corn.POO.EjerciciosModuloUno.PDFTres;
public class EjercicioTres {
    public static void main(String[] args) {
        double rangoSuperior = 10;
        double rangoInferiror = 0;
        double notaUno = (Math.random() * (rangoSuperior - rangoInferiror +  1.0));
        double notaDos = (Math.random() * (rangoSuperior - rangoInferiror +  1.0));
        double notaTres = (Math.random() * (rangoSuperior - rangoInferiror +  1.0));
        double notaCuatro = (Math.random() * (rangoSuperior - rangoInferiror +  1.0));
        double notaCinco = (Math.random() * (rangoSuperior - rangoInferiror +  1.0));
        double notaFinal = (notaUno + notaDos + notaTres + notaCuatro + notaCinco) / 5;
        System.out.println("Nota numero Uno: " + notaUno + "\nNota numero Dos: " + notaDos + "\nNota numero Tres: " + notaTres + "\nNota numero Cuatro: " + notaCuatro + "\nNota numero Cinco: " + notaCinco);
        System.out.println("La nota final es: " + notaFinal);

    }
}
