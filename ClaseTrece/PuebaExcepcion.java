package corn.POO.ClaseTrece;

import javax.swing.*;
import java.io.*;

public class PuebaExcepcion {

    // Excepciones verificadas en un metodo
    public  void  leerArchivo() throws FileNotFoundException, IOException {
        File archivo = new File("D://Passwods.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while ((linea = bf.readLine()) != null) System.out.println(linea);
    }

    public void leerArchivoDos()  {
        try {
            leerArchivo();
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor verifique la ruta");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        }finally {
            System.out.println("Programa terminado...");
        }


    }

    public static void main(String[] args) throws IOException {
        PuebaExcepcion file = new PuebaExcepcion();
        file.leerArchivoDos();
    }
}
