package corn.POO.ClaseDiez;
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Luis", "Troncoso", 1010);
        Final finaALgebra = new Final(alumno, "Algebra", "EnunciadoUNo", 7.0, 6.0, "Link");
        Final finaProgramacion = new Final(alumno, "Programacion", "EnunciadoDos", 10.0, 9.0, "Link");

        System.out.println(finaALgebra.promedio());
        System.out.println(finaProgramacion.promedio());
        System.out.println(finaALgebra.compareTo(finaProgramacion));
    }
}
