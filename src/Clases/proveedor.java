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
public class proveedor {
    private int id_proveedor;
    private String Empresa;
    private String Concepto;
    private String Contacto;
    private String numero;

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public proveedor(int id_proveedor, String Empresa, String Concepto, String Contacto, String numero) {
        this.id_proveedor = id_proveedor;
        this.Empresa = Empresa;
        this.Concepto = Concepto;
        this.Contacto = Contacto;
        this.numero = numero;
    }

    public proveedor() {
    }
    
}
