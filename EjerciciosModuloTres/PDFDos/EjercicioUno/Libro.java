package corn.POO.EjerciciosModuloTres.PDFDos.EjercicioUno;
public class Libro implements Comparable<Libro> {
    private String autor;
    private String titulo;
    private Integer paginas;

    public Libro(String autor, String titulo, Integer paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    public void mostrarLibro(){
        System.out.println("EL libro " + this.titulo + ", de " + this.autor + ", tiene " + this.paginas + " paginas");
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getPaginas() {
        return paginas;
    }
    // Método para comparar dos libros
    @Override
    public int compareTo(Libro libro) {
        return Integer.compare(this.paginas, libro.getPaginas());
    }
}
