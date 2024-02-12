package corn.POO.EjerciciosModuloCuatro;
public class Recursividad {
    public int factorial(int numero){
        if (numero <= 1)return 1;
        else return numero * factorial(numero - 1);
    }
    public int Fibonacci(int numero){
        if (numero == 0) return 0;
        else if (numero == 1) return 1;
        return Fibonacci(numero - 1) + Fibonacci(numero - 2);
    }

    public int sum(int n){
        // Caso base
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("-- Factorial de una numero (Recursividad): ");
        Recursividad recursividad = new Recursividad();
        System.out.println(recursividad.factorial(5));

        System.out.println("-- Fibonacci: ");
        Recursividad fibonacci = new Recursividad();
        System.out.println(fibonacci.Fibonacci(5));
        System.out.println("-- Llamando a la funcion fibonacci con un ciclo: ");
        for (int i = 0; i <= 5; i++){
            System.out.println(fibonacci.Fibonacci(i) + " ");
        }

        System.out.println("-- Suma de numeros: ");
        Recursividad sumaNumeros = new Recursividad();
        System.out.println(sumaNumeros.sum(5));
    }
}
