/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia.books;

import core.person.Narrador;

public class AudioLibro extends Libro {
    private double duracionHoras;
    private Narrador narrador;

    public AudioLibro(String titulo, String isbn, int anio, double duracionHoras) {
        super(titulo, isbn, anio);
        this.duracionHoras = duracionHoras;
    }

    public double getDuracionHoras() { return duracionHoras; }
    public void setDuracionHoras(double duracionHoras) { this.duracionHoras = duracionHoras; }

    public Narrador getNarrador() { return narrador; }
    public void setNarrador(Narrador narrador) { this.narrador = narrador; }

    @Override
    public String toString() {
        return "AudioLibro[titulo=" + getTitulo() + ", duracion=" + duracionHoras + "h]";
    }
}
