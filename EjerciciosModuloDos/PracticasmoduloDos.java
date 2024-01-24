package corn.POO.EjerciciosModuloDos;
public class PracticasmoduloDos {
    public static void main(String[] args) {
        // Contar los numeros multiplos de 7. Del uno al 10
        int contador = 0;
        for (int i = 1; i < 1000; i ++){
            if(i % 7 == 0) contador ++;
        }
        // Numeros multiplos de 7. Desde el 1 al 10
        System.out.println("Numeros multiplos de 7, del 1 al 10: " + contador);
        System.out.println("Tablade multiplicar del 1 a 10");
        for(int i = 1; i <=10; i++ ){
            System.out.println("tabla de multiplicar " + i);
            for (int j = 1; j<=10; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
        System.out.println("While: ");
        boolean x = true;
        while (x){
            System.out.println("Ciclo while: ");
            x = false;
        }
        System.out.println("Valores del 0 al 9: ");
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i ++;
        }

    }
}
