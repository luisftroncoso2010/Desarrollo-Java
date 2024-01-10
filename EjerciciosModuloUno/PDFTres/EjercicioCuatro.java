package corn.POO.EjerciciosModuloUno.PDFTres;

public class EjercicioCuatro {
    public static void main(String[] args) {
        int rangoSuperior = 50;
        int rangoInferiror = 1;
        final  int luis = 2;

        double numeroUno = (Math.random() * (rangoSuperior - rangoInferiror));
        double numeroDos = (Math.random() * (rangoSuperior - rangoInferiror));
        double numeroTres = (Math.random() * (rangoSuperior - rangoInferiror));
        System.out.println("Numero Uno: " + numeroUno);
        System.out.println("Numero Dos: " + numeroDos);
        System.out.println("Numero Tres: " + numeroTres);
        System.out.println("Redondeamos el numero Uno: " + Math.round(numeroUno));
        System.out.println("Redondeamos el numero Dos: " + Math.floor(numeroDos));
        System.out.println("Redondeamos el numero Tres: " + Math.ceil(numeroTres));

    }
}
