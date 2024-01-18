package corn.POO.ClaseCatorce.PatronSiglenton;
public final class SingletonMultiHilo {
    // Se crea la instancia del patron. (Solo acepta una instancia)
    private static SingletonMultiHilo instance;
    public String value;
    private SingletonMultiHilo(String value){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }
    public static SingletonMultiHilo getInstance(String value){
        // Si la instancia esta creada o no
        if (instance == null){
            instance = new SingletonMultiHilo(value);
            }
        return instance;
    }
}

