package corn.POO.ClaseTrece;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exepcion {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 12;
        array[1] = 43;
        array[2] = 65;
        array[3] = 25;
        array[4] = 23;
        array[5] = 21;
        array[6] = 75;
        array[7] = 89;
        array[8] = 94;
        array[9] = 35;


        // Nos arroja una excepcion ArrayIndexOutOfBoundsException, es un indce no encontrado
        // System.out.println(array[10]);

        // Nos arrojau na exceocion FileNotFoundException, no encuentra el archivo
        //
        FileReader fichero = null;

        try{
            fichero = new FileReader("Este firchero no existe");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();  // Trasa de la pila
        }finally{
            try{
                if(fichero !=null) fichero.close();
            }catch (IOException e){
                e.printStackTrace();
            }

            }

    }

}
