/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author brau
 */
public class ventas {
    private String fecha;
    private LinkedList<Menu> Compras;
    private LinkedList<Extra> Extras;
    private double Total;

    public String getFecha() {
        return fecha;
    }

    public LinkedList<Extra> getExtras() {
        return Extras;
    }

    public void setExtras(LinkedList<Extra> Extras) {
        this.Extras = Extras;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LinkedList<Menu> getCompras() {
        return Compras;
    }

    public void setCompras(LinkedList<Menu> Compras) {
        this.Compras = Compras;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public ventas(String fecha, LinkedList<Menu> Compras, LinkedList<Extra> Extras, double Total) {
        this.fecha = fecha;
        this.Compras = Compras;
        this.Extras = Extras;
        this.Total = Total;
    }

    
    public ventas() {
    }
    
}
