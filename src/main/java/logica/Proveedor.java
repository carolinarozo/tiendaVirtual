/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author CAROLINA
 */
public class Proveedor {
    private int id_proveedor;
    private String razonSocial;
    private String nit;

    public Proveedor(int id_proveedor, String razonSocial, String nit) {
        this.id_proveedor = id_proveedor;
        this.razonSocial = razonSocial;
        this.nit = nit;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    
}
