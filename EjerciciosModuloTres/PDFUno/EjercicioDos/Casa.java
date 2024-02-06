package corn.POO.EjerciciosModuloTres.PDFUno.EjercicioDos;
public class Casa {
    private final String ciudad = "Medellin";
    private final String barrio = "Los colores";
    private final String color = "Blanco";
    private final Integer pisos = 6;

    private final Integer habitaciones = 4;
    private final Integer baños = 4;
    private final Integer cocinas = 2;

    public String getCiudad() {
        return ciudad;
    }
    public Integer getPisos() {
        return pisos;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getColor() {
        return color;
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
