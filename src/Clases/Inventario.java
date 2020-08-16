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
public class Inventario {
    private String Producto;
    private int Id_proveedor;
    private double Cantidad;
    private double precio;
    private String fecha;

    public Inventario() {
    }

    public int getId_proveedor() {
        return Id_proveedor;
    }

    public void setId_proveedor(int Id_proveedor) {
        this.Id_proveedor = Id_proveedor;
    }

    public Inventario(String Producto, int Id_proveedor, double Cantidad, double precio, String fecha) {
        this.Producto = Producto;
        this.Id_proveedor = Id_proveedor;
        this.Cantidad = Cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

    

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
