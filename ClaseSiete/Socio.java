package corn.POO.ClaseSiete;

public class Socio {
    //Variables de la clase
    private Integer numeroSocio;
    private String nombre;
    private  Double cuotaMensual;
    private String actividad;
    //Constructor

    public Socio(Integer numeroSocio, String nombre, Double cuotaMesual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMesual;
        this.actividad = actividad;
    }

    public Double calcularCostoMensual(){
        return cuotaMensual;
    }

    public Double getCuotaMensual() {
        return this.cuotaMensual;
    }
}
