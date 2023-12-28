package corn.POO.ClaseNueve;
public class PrincipalMain {
    public static void main(String[] args) {
        CajaAhorro ca = new CajaAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();
        // Mostramos la informacion del saldo
        System.out.println(ca.informarSaldo());


        CuentaCorriente cc = new CuentaCorriente();
        CuentaCorriente cc2 = new CuentaCorriente();
        cc.setSaldo(1000.0);
        cc2.setSaldo(1000.0);

        System.out.println(cc.gravar(0.2));
        System.out.println(cc.informarSaldo());

        System.out.println(cc.compareTo(cc2));
    }
}
