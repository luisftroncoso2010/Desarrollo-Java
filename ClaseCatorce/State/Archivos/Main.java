package corn.POO.ClaseCatorce.State.Archivos;
public class Main {
    public static void main(String[] args) {
        Modo modo = new Modo();
        modo.escribir("Hola luis");
        modo.guardar();

        // Atraves del setModo cambiamos el modo. Es decir cambiamos la instancia
        modo.setModo(new Edicion());
        modo.escribir("Luis");
        modo.guardar();

    }
}
