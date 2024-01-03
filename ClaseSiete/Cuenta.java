package corn.POO.ClaseSiete;
//Creamos la clase
public class Cuenta {
    private String numero;
    protected double saldo;
    public  Cuenta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getNumero() {
        return this.numero;
    }
    public void extraer(double importe) {
        if (importe <= this.saldo)
            this.saldo -= importe;
    }
    public void depositar(double importe) {
        this.saldo += importe;
    }
    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash * getNumero().hashCode();
        hash = hash * Double.hashCode(getSaldo());
        return hash;
    }
    @Override
    public boolean equals(Object o) {
        //Veriaficamos si es de la misma instancia
        if (this == o) return  true;
        //Verificamos si el objeto es pasado no es nulo y es de la misma clase
        if (o == null || getClass() != o.getClass()) return  false; //Usando getClass()
        if (o == null || (o instanceof Cuenta)) return false;// instanceof
        //Comaparamos si el numero de cuenta del objeto es igual al otro
        Cuenta cuenta = (Cuenta) o;
        return this.getNumero().equals(cuenta.getNumero());
    }

}
