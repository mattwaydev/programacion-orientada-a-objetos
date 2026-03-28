package core.megaferia;

import java.util.ArrayList;
import java.util.List;

public class Megaferia {
    private String nombre;
    private String ciudad;
    private int anio;
    private List<Stand> stands;

    public Megaferia(String nombre, String ciudad, int anio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.anio = anio;
        this.stands = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public List<Stand> getStands() { return stands; }

    // La Megaferia es la encargada de crear los Stands, la parte 2 que pongo en el main
    public Stand crearStand(String codigo, String ubicacion) {
        Stand stand = new Stand(codigo, ubicacion);
        stands.add(stand);
        return stand;
    }

    @Override
    public String toString() {
        return "Megaferia[nombre=" + nombre + ", ciudad=" + ciudad + ", anio=" + anio + "]";
    }
}