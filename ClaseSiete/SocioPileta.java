package corn.POO.ClaseSiete;
public class SocioPileta extends Socio{
    private Double costoPileta;
    private  Boolean estaHabilidado;
    public SocioPileta( Integer numeroSocio, String nombre, Double cuotaMesual, String actividad, Double costoPileta, Boolean estaHabilidado) {
        super(numeroSocio, nombre, cuotaMesual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilidado = estaHabilidado;
    }
    //Sobre Escribimos el metodo calcularCostoMensual
    @Override
    public Double calcularCostoMensual(){
        //Este metodo me lo devuelve como lo hace la clase Socio, metodo propio de socio
        if (estaHabilidado) return costoPileta + super.calcularCostoMensual();
        else return super.calcularCostoMensual();
        //Prgramacion estatica me dice que lo usea si ya existe el metodo para ahorrca costo
    }
}
