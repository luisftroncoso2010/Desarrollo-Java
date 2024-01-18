package corn.POO.ClaseCatorce.PatronSiglenton;
public class Singleton {
    private  static  Singleton instance;
    public String value;
    private Singleton(String value){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }
    // Este metodo siempre mostrará la primera instacia creada
    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" + "If you see differents values, then 2 singletons were created (boooo!!)" + "\n\n" + "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(anotherSingleton.value);
    }
}
