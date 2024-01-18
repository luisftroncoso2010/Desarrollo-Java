package corn.POO.ClaseCatorce.PatronSiglenton;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" + "If you see different values, then 2 singletons were created (boo!!)" + "\n\n" + "RESULT: " + "\n");

        /* Se se crean las instancias de los hilos y se les pasa por parametro
        la instanca de los metodos  */
        Thread threadFOO = new Thread(new ThreadFoo());
        Thread threadBAR = new Thread(new ThreadBar());
        threadFOO.start();
        threadBAR.start();
    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            SingletonMultiHilo singletonMultiHilo = SingletonMultiHilo.getInstance("FOO");
            System.out.println(singletonMultiHilo.value);
        }
    }
    static class ThreadBar implements Runnable{
        @Override
        public void run(){
            SingletonMultiHilo singletonMultiHilo = SingletonMultiHilo.getInstance("BAR");
            System.out.println(singletonMultiHilo.value);
        }
    }
}
