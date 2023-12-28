package corn.POO.ClaseNueve;
public class CuentaCorriente extends Cuenta implements ImpuestoGravable, Comparable<CuentaCorriente>{
    private double descubiertoPermitido;

    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }
    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }
    @Override
    public void extraer(double monto) {
        if (informarSaldo() + descubiertoPermitido <= monto)setSaldo(informarSaldo() - monto);
    }
    @Override
    public double gravar(Double porcentaje) {
        Double montoADescontar = (getSaldo() * porcentaje);
        setSaldo(getSaldo() - montoADescontar);
        return  montoADescontar;
    }
    @Override
    public int compareTo(CuentaCorriente otraCC) {

        if (getSaldo() > otraCC.getSaldo()) return 1;
        else if (getSaldo() < otraCC.getSaldo()) return -1;
        else return 0;
    }
}
