/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia.books;

public class LibroImpreso extends Libro {
    private int numeroPaginas;
    private String encuadernacion;

    public LibroImpreso(String titulo, String isbn, int anio, int numeroPaginas, String encuadernacion) {
        super(titulo, isbn, anio);
        this.numeroPaginas = numeroPaginas;
        this.encuadernacion = encuadernacion;
    }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    public String getEncuadernacion() { return encuadernacion; }
    public void setEncuadernacion(String encuadernacion) { this.encuadernacion = encuadernacion; }

    @Override
    public String toString() {
        return "LibroImpreso[titulo=" + getTitulo() + ", paginas=" + numeroPaginas + "]";
    }
}