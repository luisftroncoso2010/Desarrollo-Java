package corn.POO.ClaseDiez;
//Se crea la clase hija de Examen
public class Parcial extends Examen {
    //Se crean los atributos propios de esta clase
    private  Integer unidades;
    private Integer numerosReintentos;
    //Se crea el contructor que resive de Examen con sus respectivos atributos propios y heredados
    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer unidades) {
        super(alumno, titulo, enunciado, nota);
        this.unidades = unidades;
        numerosReintentos = 0;
    }
    //Se sobre escribe le metodo esta aprobado de la clase Examen
    @Override
    public Boolean estaAprobado() {
        return getNota() >= 4;
    }
    //Validamos cuando un examen es recuperable o no
    public  Boolean esRecuperable(){
        //Usa la funcion estaAprovador devuevle true y si no es recuperable la nueva funcion devuelve false, no lo recupera
        if(estaAprobado()) return false;
        else if (unidades <= 3) return  numerosReintentos < 3;
        else if (unidades > 3) return numerosReintentos < 2;
        else return false;
    }
}

