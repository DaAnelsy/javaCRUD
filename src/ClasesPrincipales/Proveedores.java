/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

/**
 *
 * @author minib
 */
public class Proveedores {
     private int id_proveedores;
     private String Nombre_proveedor;
     private int Telefono;
     private String CorreoElectronico;
     private String direccion;
     
      public Proveedores() {
        
    }

    public Proveedores(int id_proveedores, String Nombre_proveedor, int Telefono, String CorreoElectronico, String direccion) {
        this.id_proveedores = id_proveedores;
        this.Nombre_proveedor = Nombre_proveedor;
        this.Telefono = Telefono;
        this.CorreoElectronico = CorreoElectronico;
        this.direccion = direccion;
    }

    /**
     * @return the id_proveedores
     */
    public int getId_proveedores() {
        return id_proveedores;
    }

    /**
     * @param id_proveedores the id_proveedores to set
     */
    public void setId_proveedores(int id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    /**
     * @return the Nombre_proveedor
     */
    public String getNombre_proveedor() {
        return Nombre_proveedor;
    }

    /**
     * @param Nombre_proveedor the Nombre_proveedor to set
     */
    public void setNombre_proveedor(String Nombre_proveedor) {
        this.Nombre_proveedor = Nombre_proveedor;
    }

    /**
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the CorreoElectronico
     */
    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    /**
     * @param CorreoElectronico the CorreoElectronico to set
     */
    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
