package corn.POO.ClaseCatorce.PatronSiglenton;
public class SingletonSeguridadHilos {
        // Se crea la instancia del patron. (Solo acepta una instancia)
        private static SingletonSeguridadHilos instance;
        public String value;
        private SingletonSeguridadHilos(String value){
            try{
                Thread.sleep(5000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            this.value = value;
        }
        // Creamoa el validador de instancias con el metodo getIntance

         public static SingletonSeguridadHilos getInstance(String value){
            // Si la instancia esta creada o no
            if (instance == null){
                // Aca se valida si otro hilo  o no creo la instancia.
                // Por eso se llama a la clase con synchronized
                synchronized (SingletonSeguridadHilos.class){
                    if (instance == null){
                        instance = new SingletonSeguridadHilos(value);
                    }
                }
            }
            // Aca retona la instancia dado que no esté vacia
            return instance;
    }
}
