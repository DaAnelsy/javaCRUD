/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistasForm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author minib
 */
public class productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form productos
     */
    public productos() {
        initComponents();
        this.setSize(400,300);
        this.setTitle("PRODUCTOS");
    }
    public void cargarProducto(){
    try
    {
        Connection conect = conexion.obtener();
        PreparedStatement consulta;
        consulta = conect.prepareStatement("select * from producto");
        ResultSet resultado= consulta.executeQuery();
        jComboBox1.removeAllItems();
        while(resultado.next()){
        
        String Nombre_producto =resultado.getString("Nombre_producto") ;
        int id_producto = Integer.valueOf(resultado.getInt("id_producto")); 
       
        jComboBox1.addItem( String.valueOf(id_producto)+ " - "+resultado.getString("Nombre_producto"));
        }
    }
    catch(Exception ex){
    System.out.println("Error al ejecutar" + ex.toString());
    }
    }
    
   public void insertarProducto( )
   {
   try
   {
   int id_producto= Integer.valueOf( txtidProducto.getText());
   String Nombre_producto = txtnombreProd.getText();
   int precio_unitario= Integer.valueOf( txtprecio.getText());
   String presentacion = txtpresentacion.getText();
   int cantidadExistencia= Integer.valueOf( txtcantidad.getText());
   String descripcion = txtdescripcion.getText();
   int id_proveedor= Integer.valueOf( txtidproveedor.getText());
   
   Connection conect = conexion.obtener();
   PreparedStatement consulta;
 
   consulta = conect.prepareStatement(" insert into producto values (?,?,?,?,?,?,?)");
   consulta.setInt(1, id_producto);
   consulta.setString(2, Nombre_producto); 
   consulta.setInt(3, precio_unitario);
   consulta.setString(4, presentacion); 
   consulta.setInt(5, cantidadExistencia);
   consulta.setString(6, descripcion);
   consulta.setInt(7, id_proveedor);
   
   int resultado = consulta.executeUpdate();
   cargarProducto();
 
   txtidProducto.setText("");
   txtnombreProd.setText("");
   txtprecio.setText(""); 
   txtpresentacion.setText("");
   txtcantidad.setText("");
   txtdescripcion.setText(""); 
   txtidproveedor.setText("");
   }
   catch(Exception ex)
   {
   JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
   }
}

   public void EliminarProducto( )
   {
       try
       {
       int id_producto= Integer.valueOf( txtidProducto.getText());
 
       Connection conect = conexion.obtener();
       PreparedStatement consulta;
 
       consulta = conect.prepareStatement(" delete from producto where id_producto=?");
       consulta.setInt(1, id_producto);
       int resultado = consulta.executeUpdate();
       cargarProducto();
       
       txtidProducto.setText("");
       }
       catch(Exception ex)
      {
       JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
    }
  }
   
   public void ActualizarProducto( )
     {
      try
      {
      int id_producto= Integer.valueOf( txtidProducto.getText());
      String Nombre_producto = txtnombreProd.getText();
      int precio_unitario= Integer.valueOf( txtprecio.getText());
      String presentacion = txtpresentacion.getText();
      int cantidadExistencia= Integer.valueOf( txtcantidad.getText());
      String descripcion = txtdescripcion.getText();
      int id_proveedor= Integer.valueOf( txtidproveedor.getText());
          
      Connection conect = conexion.obtener();
      PreparedStatement consulta;
  
      consulta = conect.prepareStatement(" update producto SET "
              + "id_producto = ?, Nombre_producto = ?,  Precio_unitario = ?, Presentacion = ?, CantidadExistencia = ?, Descripcion = ?, id_proveedor = ?   "
              + "where id_Producto=?" ); 
      consulta.setInt(1, id_producto);
      consulta.setString(2, Nombre_producto);
      consulta.setInt(3, precio_unitario);
      consulta.setString(4, presentacion);
      consulta.setInt(5, cantidadExistencia);
      consulta.setString(6, descripcion);
      consulta.setInt(7, id_proveedor);
      consulta.setInt(8, id_producto);
      int resultado = consulta.executeUpdate();
      cargarProducto();
 
      txtidProducto.setText("");
      txtnombreProd.setText("");
      txtprecio.setText(""); 
      txtpresentacion.setText("");
      txtcantidad.setText("");
      txtdescripcion.setText(""); 
      txtidproveedor.setText(""); 
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidProducto = new javax.swing.JTextField();
        txtnombreProd = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtpresentacion = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtidproveedor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id_producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Nombre del producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setText("Precio Unitario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("Presentacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setText("Cantidad de Existencia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel6.setText("Descripcion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel7.setText("id proveedor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        getContentPane().add(txtidProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, -1));
        getContentPane().add(txtnombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, -1));
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 150, -1));
        getContentPane().add(txtpresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, -1));
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 150, 20));
        getContentPane().add(txtidproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        insertarProducto( );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EliminarProducto( );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ActualizarProducto( );
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtidProducto;
    private javax.swing.JTextField txtidproveedor;
    private javax.swing.JTextField txtnombreProd;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtpresentacion;
    // End of variables declaration//GEN-END:variables
}
