package corn.POO.Generics;

//Creamos la clase generica
public class Generics <Tipo, TipoDos> {
    private Tipo contenido;
    private TipoDos contenidoDos;

    public Generics(Tipo contenido, TipoDos contenidoDos) {
        this.contenido = contenido;
        this.contenidoDos = contenidoDos;
    }

    public <Tipo>  void MostrarContenido(){
        System.out.println("Contenido: " + this.contenido);
        System.out.println("Contenido Dos: " + this.contenidoDos);
    }

}
