package corn.POO.ClaseNueve;
//Creamoas la clase pimiento
public class Pimiento implements Comparable {
    private String tipo;
    private  String color;
    private double tamano;
    private  double peso;

    public Pimiento(){

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Object obj) {
        Pimiento p2 = (Pimiento) obj;
        //Si el objeto es iigual devolverá 0
        int respuesta = 0;
        if(this.getPeso() > p2.getPeso()) respuesta = 1;
        if (this.getPeso() < p2.getPeso()) respuesta = -1;
        return respuesta;

    }
    public static void main(String[] args) {
        Pimiento p1 = new Pimiento();
        p1.setPeso(200);
        p1.setColor("amarillo");
        Pimiento p2 = new Pimiento();
        p2.setColor("rojo");
        p2.setPeso(250);

        if(p1.compareTo(p2) > 0) System.out.println("Pimineo Amarillo es mayor al Rojo");
        else if (p1.compareTo(p2) < 0) System.out.println("Pimento rojo es mayor al amarillo");
        else System.out.println("El Pimiento amarillo es igual al Rojo");
    }
}
