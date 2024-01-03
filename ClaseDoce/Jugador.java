package corn.POO.ClaseDoce;

public class Jugador implements Comparable<Jugador> {
    private Integer nroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean esTitular;

    public Jugador(Integer nroCamiseta, String nombre, Boolean lesionado, Boolean esTitular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.esTitular = esTitular;
    }
    public Boolean getLesionado() {
        return lesionado;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }
    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tNumero de Camiseta: " + nroCamiseta;
    }  // NOTA: Si el metodo to string no se sobre escribe, no se podrán mostrar los jugadores, mostraría solo el numero de donde esta almacenado en memoria

    @Override
    public int compareTo(Jugador otrojugador) {
        return this.getNroCamiseta().compareTo(otrojugador.getNroCamiseta());
    }
}
