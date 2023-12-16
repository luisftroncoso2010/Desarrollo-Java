package corn.POO.ClaseCuatro;
public class UsuarioJuego {
    private String nombre;
    private String clave;
    Double puntaje = 0.0;
    Integer nivel = 0;
    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;

    }
    public boolean avance(boolean resultado){
        if(resultado = true)  return true;
        else return false;

    }
    public void aumentarPuntaje(){
        if(avance(true)) puntaje +=1.0;
        else puntaje -=1.0;
    }
    public void subirNivel(){
        if(avance(true)) nivel +=1;
    }
    public void bonus(int valor){
        if(valor > 1) puntaje *= 2.0;
    }
    @Override
    public String toString() {
        return "Usuario: " +
                "\nnombre: " + nombre +
                ", clave: " + clave +
                ", puntaje: " + puntaje +
                ", nivel: " + nivel;
    }

    public static void main(String[] args) {
        UsuarioJuego usuarioUno = new UsuarioJuego("Luis", "12345");
        usuarioUno.avance(true);
        usuarioUno.aumentarPuntaje();
        usuarioUno.subirNivel();
        usuarioUno.bonus(10);
        usuarioUno.bonus(10);
        usuarioUno.bonus(11);
        System.out.println(usuarioUno.toString());

    }

}
