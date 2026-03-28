/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia;

import java.util.ArrayList;
import java.util.List;

public class Stand {
    private String codigo;
    private String ubicacion;
    private List<core.megaferia.publisher.Editorial> editoriales;

    public Stand(String codigo, String ubicacion) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.editoriales = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public List<core.megaferia.publisher.Editorial> getEditoriales() { return editoriales; }
    public void agregarEditorial(core.megaferia.publisher.Editorial editorial) { editoriales.add(editorial); }

    @Override
    public String toString() {
        return "Stand[codigo=" + codigo + ", ubicacion=" + ubicacion + "]";
    }
}