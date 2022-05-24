/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author marya
 */
public class Empleados extends javax.swing.JFrame {

    DefaultTableModel modeloC;
    conexionBDS con = new conexionBDS();
    Connection cn = con.conexion();
    
      String atributo="";

    public void limpiarTabla() {
        int filas = tablaEmpleados.getRowCount();
        for (int i = 0; filas > i; i++) {
            modeloC.removeRow(0);
        }

    }

    public void mostrarTabla(){
    limpiarTabla();
        String sql = "SELECT * FROM Empleados";
        Statement st;
        String[] datos = new String[9];
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                modeloC.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      void filtrarTabla(String valor){
        
        String sql = "";
        
        if(valor.equals("")){
           sql ="SELECT * FROM Empleados"; 
        }else{
            sql ="SELECT * FROM Empleados WHERE "+atributo+"='"+valor+"'"; 
        }
        
        
        
        String datos[] = new String[9];
        Statement st;
        try {
            limpiarTabla();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                modeloC.addRow(datos);
            }
         
            
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();
        modeloC = (DefaultTableModel) tablaEmpleados.getModel();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        txtNSS = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        rNombre = new javax.swing.JRadioButton();
        rApellidoP = new javax.swing.JRadioButton();
        rApellidoM = new javax.swing.JRadioButton();
        rNSS = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Datos de los Empleados");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido Paterno", "Apellido Materno", "Direccion", "CP", "NSS", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel12.setText("Empleados");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        btnMostrar.setText("Mostrar todo");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Apellido Paterno:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Id:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Apellido Materno:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Direccion:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Codigo Postal:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("NSS:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Busqueda:");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rNombre);
        rNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rNombre.setText("Nombre");

        buttonGroup1.add(rApellidoP);
        rApellidoP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rApellidoP.setText("Apellido Paterno");
        rApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rApellidoPActionPerformed(evt);
            }
        });

        buttonGroup1.add(rApellidoM);
        rApellidoM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rApellidoM.setText("Apellido Materno");
        rApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rApellidoMActionPerformed(evt);
            }
        });

        buttonGroup1.add(rNSS);
        rNSS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rNSS.setText("NSS");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Correo:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerp.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rApellidoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rApellidoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rNSS)
                                .addGap(187, 187, 187))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(289, 289, 289))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMostrar)
                            .addGap(18, 18, 18)
                            .addComponent(btnModificar)
                            .addGap(503, 503, 503)
                            .addComponent(btnLimpiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtApellidoP))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtApellidoM))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(49, 49, 49)
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(46, 46, 46)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtDireccion)
                                                        .addComponent(txtCP)
                                                        .addComponent(txtNSS, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnRegistrar)
                                                    .addGap(22, 22, 22)
                                                    .addComponent(btnActualizar))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(251, 251, 251)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(jLabel4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11))))
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCorreo)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rNombre)
                    .addComponent(rApellidoP)
                    .addComponent(rApellidoM)
                    .addComponent(rNSS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnModificar)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel4)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnRegistrar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO Empleados(IdEmpleado,Nombre,ApellidoP,ApellidoM,Direccion,CodigoPostal,NSS,Telefono,Correo) VALUES(?,?,?,?,?,?,?,?,?)");
            pps.setString(1, txtId.getText());
            pps.setString(2, txtNombre.getText());
            pps.setString(3, txtApellidoP.getText());
            pps.setString(4, txtApellidoM.getText());
            pps.setString(5, txtDireccion.getText());
            pps.setString(6, txtCP.getText());
            pps.setString(7, txtNSS.getText());
            pps.setString(8, txtTelefono.getText());
            pps.setString(9, txtCorreo.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            limpiarTabla();
            txtId.setText(null);
            txtNombre.setText(null);
            txtApellidoP.setText(null);
            txtApellidoM.setText(null);
            txtDireccion.setText(null);
            txtCP.setText(null);
            txtNSS.setText(null);
            txtTelefono.setText(null);
            txtCorreo.setText(null);
            mostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int fila = tablaEmpleados.getSelectedRow();

        if (fila >= 0) {
            txtId.setEditable(false);
            txtId.setText(tablaEmpleados.getValueAt(fila, 0).toString());
            txtNombre.setText(tablaEmpleados.getValueAt(fila, 1).toString());
            txtApellidoP.setText(tablaEmpleados.getValueAt(fila, 2).toString());
            txtApellidoM.setText(tablaEmpleados.getValueAt(fila, 3).toString());
            txtDireccion.setText(tablaEmpleados.getValueAt(fila, 4).toString());
            txtCP.setText(tablaEmpleados.getValueAt(fila, 5).toString());
            txtNSS.setText(tablaEmpleados.getValueAt(fila, 6).toString());
            txtTelefono.setText(tablaEmpleados.getValueAt(fila, 7).toString());
            txtCorreo.setText(tablaEmpleados.getValueAt(fila, 8).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pps = cn.prepareStatement("UPDATE Empleados SET "
                + "Nombre='" + txtNombre.getText() + "',"
                + "ApellidoP='" + txtApellidoP.getText() + "',"
                + "ApellidoM='" + txtApellidoM.getText() + "',"
                + "Direccion='" + txtDireccion.getText() + "',"
                + "CodigoPostal='" + txtCP.getText() + "',"
                + "NSS='" + txtNSS.getText() + "',"
                + "Telefono='" + txtTelefono.getText() + "',"
                + "Correo='" + txtCorreo.getText() + "' "
                + "WHERE IdEmpleado='" + txtId.getText() + "'");

            pps.executeUpdate();

            txtId.setEditable(true);

            txtId.setText(null);
            txtNombre.setText(null);
            txtApellidoP.setText(null);
            txtApellidoM.setText(null);
            txtDireccion.setText(null);
            txtCP.setText(null);
            txtNSS.setText(null);
            txtTelefono.setText(null);
            txtCorreo.setText(null);
            mostrarTabla();

            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila=tablaEmpleados.getSelectedRow();
        String valor=tablaEmpleados.getValueAt(fila, 0).toString();
        if(fila>=0){
            try {
                PreparedStatement pps= cn.prepareStatement("DELETE FROM Empleados WHERE IdEmpleado='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                mostrarTabla();
            } catch (SQLException ex) {
                Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        txtId.setText(null);
        txtId.setEditable(true);
        txtNombre.setText(null);
        txtApellidoP.setText(null);
        txtApellidoM.setText(null);
        txtDireccion.setText(null);
        txtCP.setText(null);
        txtNSS.setText(null);
        txtTelefono.setText(null);
        txtCorreo.setText(null);
        txtBuscar.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        limpiarTabla();
        String sql = "SELECT * FROM Empleados";
        Statement st;
        String[] datos = new String[9];
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                modeloC.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        if(rNombre.isSelected()){
            atributo="Nombre";
            filtrarTabla(txtBuscar.getText());
        }
        else if(rApellidoP.isSelected()){
            atributo="ApellidoP";
            filtrarTabla(txtBuscar.getText());
        }
        else if(rApellidoM.isSelected()){
            atributo="ApellidoM";
            filtrarTabla(txtBuscar.getText());
        }
        else if(rNSS.isSelected()){
            atributo="NSS";
            filtrarTabla(txtBuscar.getText());
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void rApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rApellidoPActionPerformed

    private void rApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rApellidoMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rApellidoM;
    private javax.swing.JRadioButton rApellidoP;
    private javax.swing.JRadioButton rNSS;
    private javax.swing.JRadioButton rNombre;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNSS;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
