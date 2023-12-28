package corn.POO.ClaseDiez;
public abstract class Examen {
    //Se coloca alumno, ya que examen tiene un alumno
    private Alumno alumno; //Resibe un alumno ya que examen pertenece a uAlumno
    private String titulo;
    private  String enunciado;
    private  Double nota;
    // Aca el constructor de crea de tal manera que resiva el alumno.
    public Examen(Alumno alumno, String titulo, String enunciado, Double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }
    //Creamos el metodo Booleano si aprobo o no el examen
    public  abstract Boolean  estaAprobado();

    public Double getNota() {//Obtenemos la nota
        return nota;
    }

}
