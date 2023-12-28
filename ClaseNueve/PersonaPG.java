package corn.POO.ClaseNueve;
public class PersonaPG implements Comparable{
    private int edad;

    public int getEdad() {
        return this.edad;
    }
    public void decirEdad(){
        System.out.println(this.edad);
    }
    /*
    //Mayor a cero, menor a cero y igual a cero
    @Override
    public int compareTo(Object obj) {
        PersonaPG p = (PersonaPG) obj;
        if (this.edad > p.getEdad()) return 1;
        if(this.edad < p.getEdad()) return -1;

        return 0;
    }
     */
    @Override
    public int compareTo(Object obj){
        //Aca lo hacemos de una manera mas elegante
        return this.edad - ((PersonaPG) obj).getEdad();//Solo devuelve el valor de la resta del objeto
    }
}
