package corn.POO.ClaseSiete;
//Main Socio/socioPileta
public class Main {
    public static void main(String[] args) {
        //Se puede colocar Socio como el objeto por que SocioPileta Hereda de Socio
        Socio socioPiletaUno = new SocioPileta(123, "Gabriel", 2000.0, "Programador", 500.0, true);

        Socio socioPiletaDos = new Socio(456, "Leo", 2000.0, "Casa");

        SocioPileta socioPiletaTres = new SocioPileta(789, "Gabriel", 3000.0, "Programador", 500.0, true);
        System.out.println(socioPiletaUno.calcularCostoMensual());
        System.out.println(socioPiletaDos.calcularCostoMensual());
        System.out.println(socioPiletaTres.calcularCostoMensual());
    }


}
