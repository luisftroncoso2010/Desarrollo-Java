package corn.POO.ClaseNueve;
public class CajaAhorro extends Cuenta {
    //final determina que la caja de ahorros sea
    public static final  double INTERES_CAJA_AHORRO = 1.2;
    @Override
    public void extraer(double monto) {
        if (informarSaldo() <= monto) setSaldo(informarSaldo() - monto);
    }
    public  void  cobrarIntereses(){
        setSaldo(informarSaldo() + CajaAhorro.INTERES_CAJA_AHORRO);
    }
}
