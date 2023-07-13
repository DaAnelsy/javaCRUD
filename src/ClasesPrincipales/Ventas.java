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
public class Ventas {
    private int id_ventas;
    private String Fecha_pedido;
    private int Cantidad_producto;
    private float Precio_total;
    private String Tipo_pago;
    private int id_cliente;
    private int id_producto;
    private int id_trabajadores;
    
    public Ventas(){
    
}

    public Ventas(int id_ventas, String Fecha_pedido, int Cantidad_producto, float Precio_total, String Tipo_pago, int id_cliente, int id_producto, int id_trabajadores) {
        this.id_ventas = id_ventas;
        this.Fecha_pedido = Fecha_pedido;
        this.Cantidad_producto = Cantidad_producto;
        this.Precio_total = Precio_total;
        this.Tipo_pago = Tipo_pago;
        this.id_cliente = id_cliente;
        this.id_producto = id_producto;
        this.id_trabajadores = id_trabajadores;
    }

    /**
     * @return the id_ventas
     */
    public int getId_ventas() {
        return id_ventas;
    }

    /**
     * @param id_ventas the id_ventas to set
     */
    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    /**
     * @return the Fecha_pedido
     */
    public String getFecha_pedido() {
        return Fecha_pedido;
    }

    /**
     * @param Fecha_pedido the Fecha_pedido to set
     */
    public void setFecha_pedido(String Fecha_pedido) {
        this.Fecha_pedido = Fecha_pedido;
    }

    /**
     * @return the Cantidad_producto
     */
    public int getCantidad_producto() {
        return Cantidad_producto;
    }

    /**
     * @param Cantidad_producto the Cantidad_producto to set
     */
    public void setCantidad_producto(int Cantidad_producto) {
        this.Cantidad_producto = Cantidad_producto;
    }

    /**
     * @return the Precio_total
     */
    public float getPrecio_total() {
        return Precio_total;
    }

    /**
     * @param Precio_total the Precio_total to set
     */
    public void setPrecio_total(float Precio_total) {
        this.Precio_total = Precio_total;
    }

    /**
     * @return the Tipo_pago
     */
    public String getTipo_pago() {
        return Tipo_pago;
    }

    /**
     * @param Tipo_pago the Tipo_pago to set
     */
    public void setTipo_pago(String Tipo_pago) {
        this.Tipo_pago = Tipo_pago;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
     * @return the id_trabajadores
     */
    public int getId_trabajadores() {
        return id_trabajadores;
    }

    /**
     * @param id_trabajadores the id_trabajadores to set
     */
    public void setId_trabajadores(int id_trabajadores) {
        this.id_trabajadores = id_trabajadores;
    }
    
    
}
