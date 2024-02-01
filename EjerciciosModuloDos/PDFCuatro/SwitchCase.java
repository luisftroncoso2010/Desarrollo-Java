package corn.POO.EjerciciosModuloDos.PDFCuatro;

public class SwitchCase {
    public static void main(String[] args) {
        int i = 4;
        switch(i) {
            case 0:
                System.out.println("No \n" +
                        "hay establecido un valor definido para el tipo");
                break;
            case 1:
                System.out.println("Agua");
                break;
            case 2:
                System.out.println("Gasolina");
                break;
            case 3:
                System.out.println("Hormigón");
                break;
            default:
                System.out.println("No existe un valor válido");
        }
    }
}
