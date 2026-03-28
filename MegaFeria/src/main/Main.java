/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.megaferia.Megaferia;
import core.megaferia.Stand;
import core.megaferia.books.AudioLibro;
import core.megaferia.books.LibroDigital;
import core.megaferia.books.LibroImpreso;
import core.megaferia.publisher.Editorial;
import core.person.Autor;
import core.person.Gerente;
import core.person.Narrador;

public class Main {
    public static void main(String[] args) {

        //creo la feria
        Megaferia megaferia = new Megaferia("Feria Internacional del Libro", "Bogota", 2025);
        System.out.println("Paso 1 - " + megaferia);

        //creo stands
        Stand stand1 = megaferia.crearStand("S01", "Pabellon A");
        Stand stand2 = megaferia.crearStand("S02", "Pabellon B");
        System.out.println("Paso 2 - " + stand1);
        System.out.println("Paso 2 - " + stand2);

        //creo los gerentes 
        Gerente gerente1 = new Gerente("Carlos Perez", "G-001");
        Gerente gerente2 = new Gerente("Laura Gomez", "G-002");
        System.out.println("Paso 3 - " + gerente1);

        //creo las editoriales y su relacion con los gerentes
        Editorial editorial1 = new Editorial("Norma", "900111222-1");
        editorial1.setGerente(gerente1);
        Editorial editorial2 = new Editorial("Planeta", "900333444-2");
        editorial2.setGerente(gerente2);
        System.out.println("Paso 4 - " + editorial1 + " gerente: " + editorial1.getGerente());

        //creo autores
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "A-001");
        Autor autor2 = new Autor("Isabel Allende", "A-002");
        System.out.println("Paso 5 - " + autor1);

        //creo narradores
        Narrador narrador1 = new Narrador("Juan Valdes", "N-001");
        System.out.println("Paso 6 - " + narrador1);

        //creo los libros que son las clases hijas, y su relacion con los autores y las editoriales
        LibroImpreso libroImpreso = new LibroImpreso("Cien Anos de Soledad", "ISBN-001", 1967, 432, "Tapa blanda");
        libroImpreso.agregarAutor(autor1);
        libroImpreso.setEditorial(editorial1);

        LibroDigital libroDigital = new LibroDigital("La Casa de los Espiritus", "ISBN-002", 1982, "EPUB", 2.5);
        libroDigital.agregarAutor(autor2);
        libroDigital.setEditorial(editorial2);

        //creo la relacion de audio libro con narrador
        AudioLibro audioLibro = new AudioLibro("El Amor en los Tiempos del Colera", "ISBN-003", 1985, 18.5);
        audioLibro.agregarAutor(autor1);
        audioLibro.setEditorial(editorial1);
        audioLibro.setNarrador(narrador1);

        System.out.println("Paso 7 - " + libroImpreso + " | editorial: " + libroImpreso.getEditorial());
        System.out.println("Paso 7 - " + libroDigital + " | editorial: " + libroDigital.getEditorial());
        System.out.println("Paso 7 - " + audioLibro + " | narrador: " + audioLibro.getNarrador());

        //las editoriales adquieren a stands por ende se crear la relacion
        stand1.agregarEditorial(editorial1);
        stand2.agregarEditorial(editorial2);
        System.out.println("Paso 8 - " + stand1 + " editoriales: " + stand1.getEditoriales());
        System.out.println("Paso 8 - " + stand2 + " editoriales: " + stand2.getEditoriales());
    }
}
