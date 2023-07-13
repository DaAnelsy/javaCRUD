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
public class Productos {
     private int id_producto;
     private String Nombre_producto; 
     private Float Precio_unitario;
     private String Presentacion;
     private int CantidadExistencia;
     private String Descripcion;
     
     public Productos(){
    
}

    public Productos(int id_producto, String Nombre_producto, Float Precio_unitario, String Presentacion, int CantidadExistencia, String Descripcion) {
        this.id_producto = id_producto;
        this.Nombre_producto = Nombre_producto;
        this.Precio_unitario = Precio_unitario;
        this.Presentacion = Presentacion;
        this.CantidadExistencia = CantidadExistencia;
        this.Descripcion = Descripcion;
    }

    /**
     * @return the id_producto
     */
    public int getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * @return the Nombre_producto
     */
    public String getNombre_producto() {
        return Nombre_producto;
    }

    /**
     * @param Nombre_producto the Nombre_producto to set
     */
    public void setNombre_producto(String Nombre_producto) {
        this.Nombre_producto = Nombre_producto;
    }

    /**
     * @return the Precio_unitario
     */
    public Float getPrecio_unitario() {
        return Precio_unitario;
    }

    /**
     * @param Precio_unitario the Precio_unitario to set
     */
    public void setPrecio_unitario(Float Precio_unitario) {
        this.Precio_unitario = Precio_unitario;
    }

    /**
     * @return the Presentacion
     */
    public String getPresentacion() {
        return Presentacion;
    }

    /**
     * @param Presentacion the Presentacion to set
     */
    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }

    /**
     * @return the CantidadExistencia
     */
    public int getCantidadExistencia() {
        return CantidadExistencia;
    }

    /**
     * @param CantidadExistencia the CantidadExistencia to set
     */
    public void setCantidadExistencia(int CantidadExistencia) {
        this.CantidadExistencia = CantidadExistencia;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
     
    
}
