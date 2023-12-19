package corn.POO.ClaseSiete;

import java.util.Objects;

//Creamos la clase cuenta cuenta corriente
public class CuentaCorriente extends Cuenta {
    //Variables de la clase
    private double descubierto;
    //Creamos el constructor
    public CuentaCorriente(String numero, double saldo) {
        super(numero, saldo);
        descubierto = 1000;
    }
    public double getDescubierto() {
        return descubierto;
    }
    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }


}
