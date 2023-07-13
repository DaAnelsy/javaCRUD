/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistasForm;

 import java.sql.*; 
 import javax.swing.JOptionPane;


/**
 *
 * @author minib
 */
public class clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form clientes
     */
    public clientes() {
        initComponents();
        this.setSize(400,300);
        this.setTitle("CLIENTES");
    }
    public void cargarCliente(){
    try
    {
        Connection conect = conexion.obtener();
        PreparedStatement consulta;
        consulta = conect.prepareStatement("select * from clientes");
        ResultSet resultado= consulta.executeQuery();
        jComboBox1.removeAllItems();
        while(resultado.next()){
        
        String Nombre_cliente =resultado.getString("Nombre_cliente") ;
        int id_cliente = Integer.valueOf(resultado.getInt("id_cliente")); 
        //String Apellido_cliente =resultado.getString("Apellido_cliente") ;
        //int DPI =Integer.valueOf(resultado.getInt("DPI")) ;
        //String Empresa_cliente =resultado.getString("Empresa_cliente") ;
        //int Telefono = Integer.valueOf(resultado.getInt("Telefono")); 
        //String CorreoElectronico =resultado.getString("CorreoElectronico") ;
        //String Direccion =resultado.getString("Direccion") ;
        jComboBox1.addItem( String.valueOf(id_cliente)+ " - "+resultado.getString("Nombre_cliente"));
        }
    }
    catch(Exception ex){
    System.out.println("Error al ejecutar" + ex.toString());
    }
    }
    
   public void insertarCliente( )
   {
   try
   {
   int id_cliente= Integer.valueOf( txtid_cliente.getText());
   String Nombre_cliente = txtnombre.getText();
   String Apellido_cliente = txtApellido.getText();
   int DPI= Integer.valueOf( txtDPI.getText());
   String Empresa_cliente = txtEmpresa.getText();
   int Telefono= Integer.valueOf( txtTelefono.getText());
   String CorreoElectronico = txtCorreo.getText();
   String Direccion = txtDireccion.getText();
   Connection conect = conexion.obtener();
   PreparedStatement consulta;
 
   consulta = conect.prepareStatement(" insert into Clientes values (?,?,?,?,?,?,?,?)");
   consulta.setInt(1, id_cliente);
   consulta.setString(2, Nombre_cliente); 
   consulta.setString(3, Apellido_cliente);
   consulta.setInt(4, DPI);
   consulta.setString(5, Empresa_cliente); 
   consulta.setInt(6, Telefono);
   consulta.setString(7, CorreoElectronico);
   consulta.setString(8, Direccion);
   int resultado = consulta.executeUpdate();
   cargarCliente();
 
   txtid_cliente.setText("");
   txtnombre.setText("");
   txtApellido.setText(""); 
   txtDPI.setText("");
   txtEmpresa.setText("");
   txtTelefono.setText(""); 
   txtCorreo.setText("");
   txtDireccion.setText("");
   }
   catch(Exception ex)
   {
   JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
   }
}

   public void EliminarCliente( )
   {
       try
       {
       int id_cliente= Integer.valueOf( txtid_cliente.getText());
 
       Connection conect = conexion.obtener();
       PreparedStatement consulta;
 
       consulta = conect.prepareStatement(" delete from Clientes where id_cliente=?");
       consulta.setInt(1, id_cliente);
       int resultado = consulta.executeUpdate();
       cargarCliente();
       
       txtid_cliente.setText("");
       }
       catch(Exception ex)
      {
       JOptionPane.showMessageDialog(this," Error: "+ ex.toString());
    }
  }
   
   public void ActualizarCliente( )
     {
      try
      {
      int id_cliente= Integer.valueOf( txtid_cliente.getText());
      String Nombre_cliente = txtnombre.getText();
      String Apellido_cliente = txtApellido.getText();
      int DPI= Integer.valueOf( txtDPI.getText());
      String Empresa_cliente = txtEmpresa.getText();
      int Telefono= Integer.valueOf( txtTelefono.getText());
      String CorreoElectronico = txtCorreo.getText();
      String Direccion = txtDireccion.getText();
      Connection conect = conexion.obtener();
      PreparedStatement consulta;
  
      consulta = conect.prepareStatement(" update Clientes SET "
              + "id_cliente = ?, Nombre_cliente = ?, Apellido_cliente = ?, DPI = ?, Empresa_cliente = ?, Telefono = ?, CorreoElectronico = ?, Direccion = ?   "
              + "where id_cliente=?" ); 
      consulta.setInt(1, id_cliente);
      consulta.setString(2, Nombre_cliente); 
      consulta.setString(3, Apellido_cliente);
      consulta.setInt(4, DPI);
      consulta.setString(5, Empresa_cliente);
      consulta.setInt(6, Telefono);
      consulta.setString(7, CorreoElectronico);
      consulta.setString(8, Direccion);
      consulta.setInt(9, id_cliente);
      int resultado = consulta.executeUpdate();
      cargarCliente();
 
      txtid_cliente.setText("");
      txtnombre.setText("");
      txtApellido.setText(""); 
      txtDPI.setText("");
      txtEmpresa.setText("");
      txtTelefono.setText(""); 
      txtCorreo.setText("");
      txtDireccion.setText(""); 
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

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid_cliente = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDPI = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CLIENTES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 120, -1));

        jButton3.setText("Editar/Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 120, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 120, -1));

        jLabel1.setText("id_Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setText("DPI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setText("Empresa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel7.setText("Correo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel8.setText("Direccion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        getContentPane().add(txtid_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 200, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 200, 20));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, -1));

        txtDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPIActionPerformed(evt);
            }
        });
        getContentPane().add(txtDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 200, -1));

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 200, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 200, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 200, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 200, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 390, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPIActionPerformed
        
    }//GEN-LAST:event_txtDPIActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        insertarCliente();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EliminarCliente();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ActualizarCliente();
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtid_cliente;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
