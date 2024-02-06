package corn.POO.EjerciciosModuloTres.PDFUno.EjercicioTres;

public class Casa {
    private  String ciudad;
    private  String barrio;
    private  String color;
    private  Integer pisos;
    private  Integer habitaciones;
    private  Integer baños;
    private  Integer cocinas;

    public Casa(String ciudad, String barrio, String color) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    }

    public Casa(String barrio, String color, Integer pisos) {
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }

    public Casa(Integer pisos, Integer habitaciones, Integer baños, Integer cocinas) {
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.cocinas = cocinas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getColor() {
        return color;
    }

    public Integer getPisos() {
        return pisos;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public Integer getBaños() {
        return baños;
    }

    public Integer getCocinas() {
        return cocinas;
    }

}
