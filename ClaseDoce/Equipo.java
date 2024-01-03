package corn.POO.ClaseDoce;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadorList;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadorList = new ArrayList();  // Lista
    }

    public void addJugador(Jugador jugador){
        jugadorList.add(jugador);
    }

    public int getCantidadJugadoreLesionados(){
        Integer cantidadLesionados = 0;
        for (Jugador jugador : jugadorList) {
            if (jugador.getLesionado() && jugador.getEsTitular()){
                cantidadLesionados ++;
            }
        }
        return cantidadLesionados;
    }

    public void mostrarJuadoresTitulares(){
        jugadorList.sort(Comparator.reverseOrder()); // Se puede hacer de dos maneras
        //Collections.sort(jugadorList);
        for (Jugador jugador : jugadorList) {
            if (jugador.getEsTitular()) System.out.println(jugador);
        }
    }
}
