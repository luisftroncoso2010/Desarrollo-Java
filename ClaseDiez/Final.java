package corn.POO.ClaseDiez;
//Creamos la clase Final que es hija de la clase Examen e implementa la interface Comparable propia del objeto y resibe un examen Final
public class Final extends Examen implements Comparable<Final>{
    //Creamoa los atributos propios de la clase Final
    private Double notaOral;
    private String descripcionTema;
    //Creamoa el contructos de la clase Final con sus respectivos atributos propios y heredados de la clase Examen
    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcionTema) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }
    @Override// Sobre escribimoe el metodo de Examen, para validad si el examen Fianl esta aorpbado o no
    public Boolean estaAprobado() {
        return getNota() >= 4 && notaOral >=4;
    }

    public Double promedio(){//Traemos la nota del examen del alumno, mas la nota Oral de Final
        return (getNota() + notaOral) / 2;
    }

    @Override
    public int compareTo(Final otroFinal) {//NO se hace casteo ya que se le pasa como objeto el promedio
        if(promedio() > otroFinal.promedio()) return 1;
        else if (promedio() < otroFinal.promedio()) return -1;
        else return 0;
    }
}
