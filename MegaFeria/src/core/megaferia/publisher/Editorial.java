/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia.publisher;

import core.megaferia.books.Libro;
import core.person.Gerente;
import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private String nombre;
    private String nit;
    private Gerente gerente;
    private List<Libro> libros;

    public Editorial(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.libros = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public Gerente getGerente() { return gerente; }
    public void setGerente(Gerente gerente) { this.gerente = gerente; }

    public List<Libro> getLibros() { return libros; }
    public void agregarLibro(Libro libro) { libros.add(libro); }

    @Override
    public String toString() {
        return "Editorial[nombre=" + nombre + ", nit=" + nit + "]";
    }
}