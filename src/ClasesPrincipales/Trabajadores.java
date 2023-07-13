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
public class Trabajadores {
    private int id_empleado;
    private String Nombre_empleado;
    private int DPI;
    private int Telefono;
    private String FormacionAcademica;
    private String Cargo;
    
    public Trabajadores(){
    
}

    public Trabajadores(int id_empleado, String Nombre_empleado, int DPI, int Telefono, String FormacionAcademica, String Cargo) {
        this.id_empleado = id_empleado;
        this.Nombre_empleado = Nombre_empleado;
        this.DPI = DPI;
        this.Telefono = Telefono;
        this.FormacionAcademica = FormacionAcademica;
        this.Cargo = Cargo;
    }

    /**
     * @return the id_empleado
     */
    public int getId_empleado() {
        return id_empleado;
    }

    /**
     * @param id_empleado the id_empleado to set
     */
    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    /**
     * @return the Nombre_empleado
     */
    public String getNombre_empleado() {
        return Nombre_empleado;
    }

    /**
     * @param Nombre_empleado the Nombre_empleado to set
     */
    public void setNombre_empleado(String Nombre_empleado) {
        this.Nombre_empleado = Nombre_empleado;
    }

    /**
     * @return the DPI
     */
    public int getDPI() {
        return DPI;
    }

    /**
     * @param DPI the DPI to set
     */
    public void setDPI(int DPI) {
        this.DPI = DPI;
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
     * @return the FormacionAcademica
     */
    public String getFormacionAcademica() {
        return FormacionAcademica;
    }

    /**
     * @param FormacionAcademica the FormacionAcademica to set
     */
    public void setFormacionAcademica(String FormacionAcademica) {
        this.FormacionAcademica = FormacionAcademica;
    }

    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
}
