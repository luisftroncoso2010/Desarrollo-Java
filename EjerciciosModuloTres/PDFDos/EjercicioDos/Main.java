package corn.POO.EjerciciosModuloTres.PDFDos.EjercicioDos;
public class Main {
    public static void main(String[] args) {
        // Creamos objetos de tipo contactos
        Contacto contactoUno = new Contacto("Luis", 123456);
        Contacto contactoDos = new Contacto("Leo", 789456123);

        // Creamos objetos de tipo Agenda
        Agenda agenda = new Agenda();
        agenda.registrarContacto(contactoUno);
        agenda.registrarContacto(contactoDos);


        //Listamos los contactos
        agenda.listarContactos();

        // Filtramos un contacto
        agenda.buscarContacto("aa");

        // Colocamos cuantos espacios disponibles hay
        agenda.disponibles();
    }
}
