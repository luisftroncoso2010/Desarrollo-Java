package corn.POO.ClaseDoce;

public class MainEquipo {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("La comi 1");

        equipo.addJugador( new Jugador(12, "Carlos", true, true));
        equipo.addJugador(new Jugador(9, "Pablo", false, true));
        equipo.addJugador(new Jugador(15, "Rodrigo", true, true));

        System.out.println("-- Cantidad de lesionados en el equipo es: " + equipo.getCantidadJugadoreLesionados());
        equipo.mostrarJuadoresTitulares();
    }
}
