/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia.books;

import core.person.Autor;
import java.util.ArrayList;
import java.util.List;

public abstract class Libro {
    private String titulo;
    private String isbn;
    private int anio;
    private List<Autor> autores;
    private core.megaferia.publisher.Editorial editorial;  // <-- sin import, nombre completo

    public Libro(String titulo, String isbn, int anio) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anio = anio;
        this.autores = new ArrayList<>();
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public List<Autor> getAutores() { return autores; }
    public void agregarAutor(Autor autor) { autores.add(autor); }

    public core.megaferia.publisher.Editorial getEditorial() { return editorial; }
    public void setEditorial(core.megaferia.publisher.Editorial editorial) { this.editorial = editorial; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[titulo=" + titulo + ", isbn=" + isbn + "]";
    }
}