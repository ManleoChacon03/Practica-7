package com.mycompany.pryarchivos;
/**
 *
 * @author alexa
 */
public class Producto {    
    private String codigo;
    private String nombre;
    private String descripcion;
    private float precio;
    private int existencias;

    public Producto(String codigo, String nombre, String descripcion, float precio, int existencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    } 
    public String toString(){
        return codigo + " " + nombre + " " + precio + " " + descripcion;
    }
    
}
