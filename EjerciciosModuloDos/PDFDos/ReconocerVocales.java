package corn.POO.EjerciciosModuloDos.PDFDos;
public class ReconocerVocales {
    static boolean esVocal(char letraVocal){
        char vocal = Character.toLowerCase(letraVocal);
        return vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u';
    }
    public static void main(String[] args) {
        String texto = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum".toLowerCase();
        int i = 0;
        int contadorVocales = 0;
        // Texto sin espacios.
        // texto = texto.replaceAll("\\s", "").toLowerCase();
        while (i < texto.length()){
            char caracter = texto.charAt(i);
            if (esVocal(caracter)) {
                contadorVocales +=1;
            }
            i++;
        }
        System.out.println("La cantidad de vocales es:\t" + contadorVocales);
    }
}
