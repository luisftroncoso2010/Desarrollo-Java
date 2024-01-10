package corn.POO.EjerciciosModuloUno.PDFDos;
public class EjercicioTres {
    public static void main(String[] args) {
        int numeroUno = 8;
        int numeroDos = 2;
        System.out.println("El valor de numero uno es: " + numeroUno);
        System.out.println("El valor de numero dos es: " + numeroDos);

        int variableAuxiliar;
        variableAuxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = variableAuxiliar;

        System.out.println("El nuevo valor de numero uno es: " + numeroUno);
        System.out.println("El nuevo valor de numerd dos es: " + numeroDos);
    }
}
