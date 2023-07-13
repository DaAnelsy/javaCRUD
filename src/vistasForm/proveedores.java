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
public class proveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form proveedores
     */
    public proveedores() {
        initComponents();
        this.setSize(400,300);
        this.setTitle("PROVEEDORES");
    }
    public void cargarProveedores(){
    try
    {
        Connection conect = conexion.obtener();
        PreparedStatement consulta;
        consulta = conect.prepareStatement("select * from proveedores");
        ResultSet resultado= consulta.executeQuery();
        jComboBox1.removeAllItems();
        while(resultado.next()){
        
        String Nombre_proveedor =resultado.getString("Nombre_proveedor") ;
        int id_proveedores = Integer.valueOf(resultado.getInt("id_proveedores")); 
       
        jComboBox1.addItem( String.valueOf(id_proveedores)+ " - "+resultado.getString("Nombre_proveedor"));
        }
    }
    catch(Exception ex){
    System.out.println("Error al ejecutar" + ex.toString());
    }
    }
    
   public void insertarProveedores( )
   {
   try
   {
   int id_proveedores= Integer.valueOf( txtidproveedor.getText());
   String Nombre_proveedor = txtnombreproveedor.getText();
   int Telefono= Integer.valueOf( txtTelefono.getText());
   String CorreoElectronico = txtCorreo.getText();
   String direccion = txtdireccion.getText();
   
   Connection conect = conexion.obtener();
   PreparedStatement consulta;
 
   consulta = conect.prepareStatement(" insert into proveedores values (?,?,?,?,?)");
   consulta.setInt(1, id_proveedores);
   consulta.setString(2, Nombre_proveedor); 
   consulta.setInt(3, Telefono);
   consulta.setString(4, CorreoElectronico); 
   consulta.setString(5, direccion);
   
   int resultado = consulta.executeUpdate();
   cargarProveedores();
 
   txtidproveedor.setText("");
   txtnombreproveedor.setText("");
   txtTelefono.setText(""); 
   txtCorreo.setText("");
   txtdireccion.setText("");
   }
   catch(Exception ex)
   {
   JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
   }
}

   public void EliminarProveedores( )
   {
       try
       {
       int id_proveedores= Integer.valueOf( txtidproveedor.getText());
 
       Connection conect = conexion.obtener();
       PreparedStatement consulta;
 
       consulta = conect.prepareStatement(" delete from proveedores where id_proveedores=?");
       consulta.setInt(1, id_proveedores);
       int resultado = consulta.executeUpdate();
       cargarProveedores();
       
       txtidproveedor.setText("");
       }
       catch(Exception ex)
      {
       JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
    }
  }
   
   public void ActualizarProveedores( )
     {
      try
      {
       int id_proveedores= Integer.valueOf( txtidproveedor.getText());
       String Nombre_proveedor = txtnombreproveedor.getText();
       int Telefono= Integer.valueOf( txtTelefono.getText());
       String CorreoElectronico = txtCorreo.getText();
       String direccion = txtdireccion.getText();
          
      Connection conect = conexion.obtener();
      PreparedStatement consulta;
  
      consulta = conect.prepareStatement(" update proveedores SET "
              + "id_proveedores = ?, Nombre_proveedor = ?,  Telefono = ?, CorreoElectronico = ?, direccion = ?   "
              + "where id_proveedores=?" ); 
      consulta.setInt(1, id_proveedores);
      consulta.setString(2, Nombre_proveedor);
      consulta.setInt(3, Telefono);
      consulta.setString(4, CorreoElectronico);
      consulta.setString(5, direccion);
      consulta.setInt(6, id_proveedores);
      int resultado = consulta.executeUpdate();
      cargarProveedores();
 
      txtidproveedor.setText("");
      txtnombreproveedor.setText("");
      txtTelefono.setText(""); 
      txtCorreo.setText("");
      txtdireccion.setText("");
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
        txtidproveedor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtnombreproveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id proveedores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        getContentPane().add(txtidproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 80, -1));

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 80, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 80, -1));
        getContentPane().add(txtnombreproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, -1));

        jLabel2.setText("Nombre Proveedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setText("Correo Electronico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, -1));
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 140, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        insertarProveedores( );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ActualizarProveedores( );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EliminarProveedores( );
    }//GEN-LAST:event_jButton4ActionPerformed


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
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidproveedor;
    private javax.swing.JTextField txtnombreproveedor;
    // End of variables declaration//GEN-END:variables
}
