package corn.POO.ClaseCatorce.State.Archivos;

public class Modo {
    // Creamos una variable de tipo ModoEditor
    private ModoEditor modo;
    public Modo(){
        // Le damos un modo pretedeterminado. Us estado inicial
        this.modo = new Lectura();
    }
    // Esdte metodo debe escistir para cambiar el tipo de modo de ejecucion
    public void setModo(ModoEditor modo){
        this.modo = modo;
    }
    public void escribir(String texto) {
        this.modo.escribir(texto);
    }

    public void guardar() {
        this.modo.guardar();
    }
}
