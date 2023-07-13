/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistasForm;

import ClasesPrincipales.Ventas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author minib
 */
public class VentasDB {
    public ArrayList<Ventas>ListVentas() throws ClassNotFoundException{
    ArrayList<Ventas> venta= new ArrayList();
    try{
        Connection cnx=conexion.obtener();
        Statement st= cnx.createStatement();
        ResultSet rs = st.executeQuery("select * from venta;");
        while(rs.next()){
           Ventas v= new Ventas(); 
           v.setId_ventas(rs.getInt("id_labVenta"));
           v.setFecha_pedido(rs.getString("Fecha_pedido"));
           v.setCantidad_producto(rs.getInt("Cantidad_producto"));
           v.setPrecio_total(rs.getFloat("Precio_total"));
           v.setTipo_pago(rs.getString("Tipo_pago"));
           v.setId_cliente(rs.getInt("id_cliente"));
           v.setId_producto(rs.getInt("id_producto"));
           v.setId_trabajadores(rs.getInt("id_trabajadores"));
           venta.add(v);
        }
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
        System.out.println("Error en lisdado");
    }
    return venta;
    }
    
}
