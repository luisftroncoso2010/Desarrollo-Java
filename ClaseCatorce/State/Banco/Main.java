package corn.POO.ClaseCatorce.State.Banco;
public class Main {
    public static void main(String[] args) {
        // Creamos el objeto de tipo persona
        Persona personaUno = new Persona("Luis", "Troncoso", 26);
        Persona personaDos = new Persona("Ana", "Troncoso", 26);
        Persona personaTres = new Persona("Sol", "Troncoso", 66);

        // Banco
        Banco banco = new Banco();
        banco.atiende(personaUno);
        banco.suspendeVentnilla();
        banco.atiende(personaDos);
        banco.atiende(personaTres);
        // Ventanilla de banco, cambia su estado


    }
}
