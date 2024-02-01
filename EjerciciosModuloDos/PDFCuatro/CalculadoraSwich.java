package corn.POO.EjerciciosModuloDos.PDFCuatro;

public class CalculadoraSwich {
    public static void main(String[] args) {
        int numeroUno = 4;
        int numeroDos = 2;
        int resultado = 0;
        char operador = 'a';
        switch(operador) {
            case '+':
                resultado = numeroUno + numeroDos;
                System.out.println("La suma es\t" + resultado);
                break;
            case '-':
                resultado = numeroUno - numeroDos;
                System.out.println("La resta es\t" + resultado);
                break;
            case '*':
                resultado = numeroUno * numeroDos;
                System.out.println("La multiplicacion es\t" + resultado);
                break;
            case '/':
                resultado = numeroUno / numeroDos;
                System.out.println("La division es\t" + resultado);
                break;
            default:
                System.out.println("No existe esa operacion");
        }
    }
}
