package corn.POO.EjerciciosModuloTres.PDFDos.EjercicioDos;

public class Agenda {
    private Contacto[] contactos;
    private int cantidadDeContactos;
    public Agenda(){
        this.contactos = new Contacto[10];
        this.cantidadDeContactos = 0;
    }

    // Método paa agregar un nuevo contacto
    public void registrarContacto(Contacto nuevoContacto){
        // Si la cantidad de ontactos es menor que la cantidad registrada, arranca en cero
        if(cantidadDeContactos < contactos.length){
            contactos[cantidadDeContactos] = nuevoContacto;
            cantidadDeContactos += 1 ;
            System.out.println("Contacto agregado correctamente");
        }else System.out.println("La listas esta llena. No se puede agregar");
    }

    // Método para buscar un contacto por nombre
    public void listarContactos(){
        System.out.println("-- Lista de contactos");
        for(int i = 0; i < this.cantidadDeContactos; i++ ){
            System.out.println(this.contactos[i].toString());
        }
    }

    public void buscarContacto(String nombreBuscado){
        boolean encontrado = false;
        for (int i = 0; i < this.cantidadDeContactos; i++){
            if (contactos[i].getNombre().equalsIgnoreCase(nombreBuscado)){
                System.out.println("Teléfono de " + nombreBuscado + ": " + contactos[i].getNumero());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("No se encontró un contacto con el nombre: " + nombreBuscado);
    }

    public void disponibles(){
        int disponibles = contactos.length - this.cantidadDeContactos;
        System.out.println("-- La cantidad dispoible de contactos es: " + disponibles);
    }
}
