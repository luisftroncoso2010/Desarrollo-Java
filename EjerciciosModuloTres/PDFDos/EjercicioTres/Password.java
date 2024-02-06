package corn.POO.EjerciciosModuloTres.PDFDos.EjercicioTres;
public class Password {
    private int longitud;
    private String password;

    public Password() {
        this.longitud = 10;
    }
    public Password(Integer longitud){
        this.longitud = longitud;
        this.password = generar();
    }
    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    public String generar(){
        String password = "";
        for (int i = 0; i < longitud; i++){
            int eleccion = ((int)Math.floor(Math.random() * 3 + 1));
            if (eleccion == 1){
                char minusculas = (char) ((int)Math.floor(Math.random()* (123-97)+ 97));
                password += minusculas;
            }else {
                if (eleccion == 2){
                    char mayusculas = (char) ((int)Math.floor(Math.random()* (123-97)+ 97));
                    password +=mayusculas;
                }else {
                    char numeros = (char) ((int)Math.floor(Math.random() * (58-48) + 48));
                    password +=numeros;
                }
            }
        }
        this.password = password;
        return password;
    }

    public void validar(){
        int cuentaNumeros = 0;
        int cuentaMinusculas = 0;
        int cuentaMayusculas = 0;
        for (int i = 0; i < this.password.length(); i++){
            if (this.password.charAt(i)>97 && this.password.charAt(i) <=122){
                cuentaMayusculas +=1;
            }else {
                if (this.password.charAt(i) >= 65 && this.password.charAt(i) <= 98){
                    cuentaMayusculas +=1;
                }else {
                    cuentaNumeros +=1;
                }
            }
        }
        if (cuentaNumeros >= 5 && cuentaMinusculas >=1 && cuentaMayusculas >=2) System.out.println("Es segura");
        else System.out.println("No es segura");
    }
}

