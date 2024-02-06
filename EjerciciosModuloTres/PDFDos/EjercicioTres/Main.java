package corn.POO.EjerciciosModuloTres.PDFDos.EjercicioTres;

public class Main {
    public static void main(String[] args) {
        Password pw = new Password(18);
        Password pw1 = new Password();
        System.out.println("Contraseña: " + pw.generar());
        System.out.println("Contraseña: " + pw1.generar());
        pw.validar();
        pw1.validar();
    }
}
