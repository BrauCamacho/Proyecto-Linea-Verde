/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
/**
 *
 * @author brau
 */
public class Menu {
    private int id;
    private String Nombre;
    private String tipo;
    private double Precio;
    private String Descripcion;
    private String tamanio;

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamaño) {
        this.tamanio = tamaño;
    }

    public Menu(int id, String Nombre, String tipo, double Precio, String Descripcion, String tamanio) {
        this.id = id;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.tamanio = tamanio;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

   

    public Menu() {
    }

    @Override
    public String toString() {
        return "Menu{" + "id=" + id + ", Nombre=" + Nombre + ", tipo=" + tipo + ", Precio=" + Precio + ", Descripcion=" + Descripcion + ", tamanio=" + tamanio + '}';
    }
    
}
