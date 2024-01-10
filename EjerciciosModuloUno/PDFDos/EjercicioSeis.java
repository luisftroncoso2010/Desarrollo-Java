package corn.POO.EjerciciosModuloUno.PDFDos;

public class EjercicioSeis {
    public static void main(String[] args) {
        int ladoCuadrado = 8;
        double medidaLados = 1.5;

        double perimetroCuadrado = (ladoCuadrado * medidaLados);
        double areaCuadrado = (ladoCuadrado * ladoCuadrado);
        System.out.println("El area de un cuadrado es: " + areaCuadrado);
        System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);

        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        double longitudLados = 15.8;
        double  areaTriangulo= (baseTriangulo * alturaTriangulo)/2;
        double perimetroTriangulo = (longitudLados * 3);
        System.out.println("El area del triangulo es: " + areaTriangulo);
        System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);


    }
}
