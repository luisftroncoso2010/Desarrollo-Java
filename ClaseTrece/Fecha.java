package corn.POO.ClaseTrece;
public class Fecha {
    private int day;
    private  int month;
    private int year;
    public  Fecha(int d, int m, int y)throws  FechaException{
        if(d < 1 || d > 31) throw new FechaException("Error en el dia");
        day = d;
        if(m < 1 || m > 12) throw  new FechaException("Error en el mes");
        month = m;
        if(y < 1950 || y > 2024) throw  new FechaException("Error en el año");
        year = y;

    }
    @Override
    public String toString() {
        return "Fecha:\n" +
                "Dia: " + day +
                "\tMes: " + month +
                "\tAños: " + year;
    }
}
