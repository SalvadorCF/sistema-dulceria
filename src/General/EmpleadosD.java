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
public class EmpleadosD extends javax.swing.JFrame {

    DefaultTableModel modeloC,modeloM,modeloA,modeloE;
    conexionBDS con = new conexionBDS();
    Connection cn = con.conexion();
    
    conexionBDE conE = new conexionBDE();
    Connection cnE = conE.conexion();
    
    conexionBDM conM = new conexionBDM();
    Connection cnM = conM.conexion();
    
    conexionBDA conA = new conexionBDA();
    Connection cnA = conA.conexion();
    
      String atributo="";

    public void limpiarTabla() {
        int filas = tablaEmpleados.getRowCount();
        for (int i = 0; filas > i; i++) {
            modeloC.removeRow(0);
        }
        int filasE = tablaEmpleadosE.getRowCount();
        for (int i = 0; filasE > i; i++) {
            modeloE.removeRow(0);
        }
         int filasM = tablaEmpleadosM.getRowCount();
        for (int i = 0; filasM > i; i++) {
            modeloM.removeRow(0);
        }
         int filasA = tablaEmpleadosA.getRowCount();
        for (int i = 0; filasA > i; i++) {
            modeloA.removeRow(0);
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
        String datosA[] = new String[9];
        String datosE[] = new String[9];
        String datosM[] = new String[9];
        
        Statement st,stM,stA,stE;
        

        try {
            limpiarTabla();
            
            //TABLA SALVADOR
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
             //TABLA MARIANA
            stM = cnM.createStatement();
            ResultSet rsM = stM.executeQuery(sql);
            while (rsM.next()) {
                datosM[0] = rsM.getString(1);
                datosM[1] = rsM.getString(2);
                datosM[2] = rsM.getString(3);
                datosM[3] = rsM.getString(4);
                datosM[4] = rsM.getString(5);
                datosM[5] = rsM.getString(6);
                datosM[6] = rsM.getString(7);
                datosM[7] = rsM.getString(8);
                datosM[8] = rsM.getString(9);
                modeloM.addRow(datosM);    
            }
            //TABLA ABIGAIL
            stA = cnA.createStatement();
            ResultSet rsA = stA.executeQuery(sql);
            while (rsA.next()) {
                datosA[0] = rsA.getString(1);
                datosA[1] = rsA.getString(2);
                datosA[2] = rsA.getString(3);
                datosA[3] = rsA.getString(4);
                datosA[4] = rsA.getString(5);
                datosA[5] = rsA.getString(6);
                datosA[6] = rsA.getString(7);
                datosA[7] = rsA.getString(8);
                datosA[8] = rsA.getString(9);
                modeloA.addRow(datosA);    
            }
             //TABLA EDGAR
            stE = cnE.createStatement();
            ResultSet rsE = stE.executeQuery(sql);
            while (rsE.next()) {
                datosE[0] = rsE.getString(1);
                datosE[1] = rsE.getString(2);
                datosE[2] = rsE.getString(3);
                datosE[3] = rsE.getString(4);
                datosE[4] = rsE.getString(5);
                datosE[5] = rsE.getString(6);
                datosE[6] = rsE.getString(7);
                datosE[7] = rsE.getString(8);
                datosE[8] = rsE.getString(9);
                modeloE.addRow(datosE);    
            }
         
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosD.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    /**
     * Creates new form Empleados
     */
    public EmpleadosD() {
        initComponents();
        modeloC = (DefaultTableModel) tablaEmpleados.getModel();
        modeloM = (DefaultTableModel) tablaEmpleadosM.getModel();
        modeloA = (DefaultTableModel) tablaEmpleadosA.getModel();
        modeloE = (DefaultTableModel) tablaEmpleadosE.getModel();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleadosA = new javax.swing.JTable();
        rApellidoM = new javax.swing.JRadioButton();
        rNSS = new javax.swing.JRadioButton();
        rNombre = new javax.swing.JRadioButton();
        rApellidoP = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEmpleadosM = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaEmpleadosE = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerp.png"))); // NOI18N

        jScrollPane5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(907, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMostrar.setText("Mostrar todo");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        tablaEmpleadosA.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEmpleadosA);

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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Busqueda:");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel12.setText("Empleados");

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
        jScrollPane2.setViewportView(tablaEmpleados);

        tablaEmpleadosM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaEmpleadosM);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Sucursal Abigail");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Sucursal Matriz");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Sucursal Mariana");

        tablaEmpleadosE.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaEmpleadosE);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Sucursal Edgar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rApellidoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rApellidoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rNSS))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(16, 16, 16))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrar)
                            .addGap(25, 25, 25)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rNombre)
                    .addComponent(rApellidoP)
                    .addComponent(rApellidoM)
                    .addComponent(rNSS))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        limpiarTabla();
        String sql = "SELECT * FROM Empleados";
        Statement st,stE,stM,stA;
        String[] datos = new String[9];
        String[] datosA = new String[9];
        String[] datosE = new String[9];
        String[] datosM = new String[9];
        try {
            //TABLA SALVADOR
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
            
            //TABLA MARIANA
            stM = cnM.createStatement();
            ResultSet rsM = stM.executeQuery(sql);
            while (rsM.next()) {
                datosM[0] = rsM.getString(1);
                datosM[1] = rsM.getString(2);
                datosM[2] = rsM.getString(3);
                datosM[3] = rsM.getString(4);
                datosM[4] = rsM.getString(5);
                datosM[5] = rsM.getString(6);
                datosM[6] = rsM.getString(7);
                datosM[7] = rsM.getString(8);
                datosM[8] = rsM.getString(9);
                modeloM.addRow(datosM);    
            }
            //TABLA ABIGAIL
            stA = cnA.createStatement();
            ResultSet rsA = stA.executeQuery(sql);
            while (rsA.next()) {
                datosA[0] = rsA.getString(1);
                datosA[1] = rsA.getString(2);
                datosA[2] = rsA.getString(3);
                datosA[3] = rsA.getString(4);
                datosA[4] = rsA.getString(5);
                datosA[5] = rsA.getString(6);
                datosA[6] = rsA.getString(7);
                datosA[7] = rsA.getString(8);
                datosA[8] = rsA.getString(9);
                modeloA.addRow(datosA);    
            }
             //TABLA EDGAR
            stE = cnE.createStatement();
            ResultSet rsE = stE.executeQuery(sql);
            while (rsE.next()) {
                datosE[0] = rsE.getString(1);
                datosE[1] = rsE.getString(2);
                datosE[2] = rsE.getString(3);
                datosE[3] = rsE.getString(4);
                datosE[4] = rsE.getString(5);
                datosE[5] = rsE.getString(6);
                datosE[6] = rsE.getString(7);
                datosE[7] = rsE.getString(8);
                datosE[8] = rsE.getString(9);
                modeloE.addRow(datosE);    
            }
            
            

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void rApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rApellidoPActionPerformed

    private void rApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rApellidoMActionPerformed

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
            java.util.logging.Logger.getLogger(EmpleadosD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadosD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadosD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadosD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadosD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rApellidoM;
    private javax.swing.JRadioButton rApellidoP;
    private javax.swing.JRadioButton rNSS;
    private javax.swing.JRadioButton rNombre;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaEmpleadosA;
    private javax.swing.JTable tablaEmpleadosE;
    private javax.swing.JTable tablaEmpleadosM;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
