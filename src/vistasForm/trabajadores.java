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
public class trabajadores extends javax.swing.JInternalFrame {

    /**
     * Creates new form trabajadores
     */
    public trabajadores() {
        initComponents();
        this.setSize(400,300);
        this.setTitle("TRABAJADORES");
    }
    public void cargarTrabajadores(){
    try
    {
        Connection conect = conexion.obtener();
        PreparedStatement consulta;
        consulta = conect.prepareStatement("select * from trabajadores");
        ResultSet resultado= consulta.executeQuery();
        jComboBox1.removeAllItems();
        while(resultado.next()){
        
        String Nombre_empleado =resultado.getString("Nombre_empleado") ;
        int id_empleado = Integer.valueOf(resultado.getInt("id_empleado")); 
       
        jComboBox1.addItem( String.valueOf(id_empleado)+ " - "+resultado.getString("Nombre_empleado"));
        }
    }
    catch(Exception ex){
    System.out.println("Error al ejecutar" + ex.toString());
    }
    }
    
   public void insertarTrabajadores( )
   {
   try
   {
   int id_empleado= Integer.valueOf( txtEmp.getText());
   String Nombre_empleado = txtnombre.getText();
   int DPI= Integer.valueOf( txtDPI.getText());
   int Telefono= Integer.valueOf( txttelefono.getText());
   String FormacionAcademica = txtformacionAcademica.getText();
   String Cargo = txtcargo.getText();
   
   Connection conect = conexion.obtener();
   PreparedStatement consulta;
 
   consulta = conect.prepareStatement(" insert into trabajadores values (?,?,?,?,?,?)");
   consulta.setInt(1, id_empleado);
   consulta.setString(2, Nombre_empleado); 
   consulta.setInt(3, DPI);
   consulta.setInt(4, Telefono);
   consulta.setString(5, FormacionAcademica);
   consulta.setString(6, Cargo);
   
   int resultado = consulta.executeUpdate();
   cargarTrabajadores();
 
   
    txtEmp.setText("");
    txtnombre.setText("");
    txtDPI.setText(""); 
    txttelefono.setText("");
    txtformacionAcademica.setText("");
    txtcargo.setText(""); 
   }
   catch(Exception ex)
   {
   JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
   }
}

   public void EliminarTrabajadores( )
   {
       try
       {
       int id_empleado= Integer.valueOf( txtEmp.getText());
 
       Connection conect = conexion.obtener();
       PreparedStatement consulta;
 
       consulta = conect.prepareStatement(" delete from trabajadores where id_empleado=?");
       consulta.setInt(1, id_empleado);
       int resultado = consulta.executeUpdate();
       cargarTrabajadores();
       
       txtEmp.setText("");
       }
       catch(Exception ex)
      {
       JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
    }
  }
   
   public void ActualizarTrabajadores( )
     {
      try
      {
      int id_empleado= Integer.valueOf( txtEmp.getText());
      String Nombre_empleado = txtnombre.getText();
      int DPI= Integer.valueOf( txtDPI.getText());
      int Telefono= Integer.valueOf( txttelefono.getText());
      String FormacionAcademica = txtformacionAcademica.getText();
      String Cargo = txtcargo.getText();
          
      Connection conect = conexion.obtener();
      PreparedStatement consulta;
  
      consulta = conect.prepareStatement(" update trabajadores SET "
              + "id_empleado = ?, Nombre_empleado = ?,  DPI = ?, Telefono = ?, FormacionAcademica = ?, Cargo = ?   "
              + "where id_empleado=?" ); 
      consulta.setInt(1, id_empleado);
      consulta.setString(2, Nombre_empleado);
      consulta.setInt(3, DPI);
      consulta.setInt(4, Telefono);
      consulta.setString(5, FormacionAcademica);
      consulta.setString(6, Cargo);
      consulta.setInt(7, id_empleado);
      int resultado = consulta.executeUpdate();
      cargarTrabajadores();
 
      txtEmp.setText("");
      txtnombre.setText("");
      txtDPI.setText(""); 
      txttelefono.setText("");
      txtformacionAcademica.setText("");
      txtcargo.setText(""); 
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
        txtEmp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtformacionAcademica = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id Trabajadores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(txtEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel2.setText("Nombre ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, -1));

        jLabel3.setText("DPI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(txtDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, -1));

        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setText("Formacion Academica");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, -1));
        getContentPane().add(txtformacionAcademica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, -1));

        jLabel6.setText("Cargo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ActualizarTrabajadores( );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EliminarTrabajadores( );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        insertarTrabajadores( );
    }//GEN-LAST:event_jButton2ActionPerformed


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
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtEmp;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtformacionAcademica;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
