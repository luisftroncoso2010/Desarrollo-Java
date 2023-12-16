package corn.POO.ClaseDos;
public class Arrays {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        nombres[0] = "Luis";
        nombres[1] = "Andres";
        nombres[2] = "Marcelo";
        nombres[3] = "Ana";
        nombres[4] = "Marcos";

        //Se debe unsar un ciclo for para mostrar el arrays
        for (int i=0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }
        //Usamos el cilo ehile para mostrar los elementos de objeto
        int i = 0;
        while (i < nombres.length){
            System.out.println(nombres[i]);
            i++;
        }
        //Usamos el for each para mostrar el elemento
        for(String nombre : nombres) System.out.println(nombre);
    }
}
