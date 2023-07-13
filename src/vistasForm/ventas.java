/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistasForm;

import ClasesPrincipales.Ventas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minib
 */
public class ventas extends javax.swing.JInternalFrame {
    ArrayList<Ventas>venta;
    VentasDB db= new VentasDB();
    
    /**
     * Creates new form ventas
     */
    public ventas() {
        initComponents();
        this.setSize(400,300);
        this.setTitle("VENTAS");
    }
    public void ListarDatos() throws ClassNotFoundException{
        venta=db.ListVentas();
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
    for(Ventas v: venta){
        tb.addRow(new Object[]{v.getId_ventas(),v.getFecha_pedido(),v.getCantidad_producto(),v.getPrecio_total(),v.getTipo_pago(),v.getId_cliente(),v.getId_producto(),v.getId_trabajadores()});
    }
    }
    public void LimpiarFormulario(){
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
        for(int i=tb.getRowCount()-1;i>0;i--)
        {
            tb.removeRow(i);
        }
    }
    
    
   public void insertarVenta( )
   {
   try
   {
   int id_labVenta= Integer.valueOf( txtIdventa.getText());
   String Fecha_pedido = txtFechaP.getText();
   int Cantidad_producto = Integer.valueOf( txtCantidad.getText());
   float Precio_total = Integer.valueOf( txtPrecioT.getText());
   String Tipo_pago = txtTipoPago.getText();
   int id_cliente = Integer.valueOf(txtIdCliente.getText());
   int id_producto= Integer.valueOf( txtIdProducto.getText());
   int id_trabajador= Integer.valueOf( txtIdTrabajador.getText());
   
   Connection conect = conexion.obtener();
   PreparedStatement consulta;
 
   consulta = conect.prepareStatement(" insert into venta values (?,?,?,?,?,?,?,?)");
   consulta.setInt(1, id_labVenta);
   consulta.setString(2, Fecha_pedido); 
   consulta.setInt(3, Cantidad_producto);
   consulta.setFloat(4, Precio_total); 
   consulta.setString(5, Tipo_pago);
   consulta.setInt(6, id_cliente);
   consulta.setInt(7, id_producto);
   consulta.setInt(8, id_trabajador);
   
   int resultado = consulta.executeUpdate();
   LimpiarFormulario();
   ListarDatos();
 
   txtIdventa.setText("");
   txtFechaP.setText("");
   txtCantidad.setText(""); 
   txtPrecioT.setText("");
   txtTipoPago.setText("");
   txtIdCliente.setText(""); 
   txtIdProducto.setText("");
   txtIdTrabajador.setText("");
   }
   catch(Exception ex)
   {
   JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
   }
}

   public void EliminarVenta( )
   {
       try
       {
       int id_venta= Integer.valueOf( txtIdventa.getText());
 
       Connection conect = conexion.obtener();
       PreparedStatement consulta;
 
       consulta = conect.prepareStatement(" delete from venta where id_labVenta=?");
       consulta.setInt(1, id_venta);
       int resultado = consulta.executeUpdate();
       LimpiarFormulario();
       ListarDatos();
       
       txtIdventa.setText("");
       }
       catch(Exception ex)
      {
       JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
    }
  }
   
   public void ActualizarVenta( )
     {
      try
      {
      int id_labVenta= Integer.valueOf( txtIdventa.getText());
      String Fecha_pedido = txtFechaP.getText();
      int Cantidad_producto = Integer.valueOf( txtCantidad.getText());
      float Precio_total = Integer.valueOf( txtPrecioT.getText());
      String Tipo_pago = txtTipoPago.getText();
      int id_cliente = Integer.valueOf(txtIdCliente.getText());
      int id_producto= Integer.valueOf( txtIdProducto.getText());
      int id_trabajador= Integer.valueOf( txtIdTrabajador.getText());
          
      Connection conect = conexion.obtener();
      PreparedStatement consulta;
  
      consulta = conect.prepareStatement(" update venta SET "
              + "id_labVenta = ?, Fecha_pedido = ?,  Cantidad_producto = ?, Precio_total = ?, Tipo_pago = ?, id_cliente = ?, id_producto = ?, id_trabajador = ?   "
              + "where id_labVenta=?" ); 
      consulta.setInt(1, id_labVenta);
      consulta.setString(2, Fecha_pedido); 
      consulta.setInt(3, Cantidad_producto);
      consulta.setFloat(4, Precio_total); 
      consulta.setString(5, Tipo_pago);
      consulta.setInt(6, id_cliente);
      consulta.setInt(7, id_producto);
      consulta.setInt(8, id_trabajador);
      consulta.setInt(9, id_labVenta);
      int resultado = consulta.executeUpdate();
      LimpiarFormulario();
      ListarDatos();
 
      txtIdventa.setText("");
      txtFechaP.setText("");
      txtCantidad.setText(""); 
      txtPrecioT.setText("");
      txtTipoPago.setText("");
      txtIdCliente.setText(""); 
      txtIdProducto.setText("");
      txtIdTrabajador.setText("");
      }
      catch(Exception ex)
      {
      JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
      }
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdventa = new javax.swing.JTextField();
        txtFechaP = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioT = new javax.swing.JTextField();
        txtTipoPago = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtIdTrabajador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jScrollPane1.setViewportView(jTextPane1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Fecha Pedido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setText("Cantidad Pedido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setText("Precio Total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setText("Tipo Pago");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setText("id Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel7.setText("id Producto ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel8.setText("id Trabajador");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        getContentPane().add(txtIdventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, -1));
        getContentPane().add(txtFechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));
        getContentPane().add(txtPrecioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, -1));
        getContentPane().add(txtTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, -1));
        getContentPane().add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, -1));
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, -1));
        getContentPane().add(txtIdTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, -1));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 80, -1));

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 80, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 80, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Venta", "Fecha_Pedido", "Cantidad_Producto", "Precio_Total", "Tipo_Pago", "id_Cliente", "id_Producto", "id_Trabajador"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 580, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            LimpiarFormulario();
            ListarDatos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LimpiarFormulario();
        insertarVenta( );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LimpiarFormulario();
        EliminarVenta( );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LimpiarFormulario();
        ActualizarVenta( );
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFechaP;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdTrabajador;
    private javax.swing.JTextField txtIdventa;
    private javax.swing.JTextField txtPrecioT;
    private javax.swing.JTextField txtTipoPago;
    // End of variables declaration//GEN-END:variables
}
