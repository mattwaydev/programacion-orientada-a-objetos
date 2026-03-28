package core.megaferia.books;

public class LibroDigital extends Libro {
    private String formato;
    private double tamanoMB;

    public LibroDigital(String titulo, String isbn, int anio, String formato, double tamanoMB) {
        super(titulo, isbn, anio);
        this.formato = formato;
        this.tamanoMB = tamanoMB;
    }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    public double getTamanoMB() { return tamanoMB; }
    public void setTamanoMB(double tamanoMB) { this.tamanoMB = tamanoMB; }

    @Override
    public String toString() {
        return "LibroDigital[titulo=" + getTitulo() + ", formato=" + formato + "]";
    }
}