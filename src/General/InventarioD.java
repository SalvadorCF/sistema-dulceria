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
 * @author salva
 */
public class InventarioD extends javax.swing.JFrame {

    DefaultTableModel modeloI,modeloM,modeloA,modeloE;
   conexionBDS con = new conexionBDS();
    Connection cn = con.conexion();
    
    conexionBDE conE = new conexionBDE();
    Connection cnE = conE.conexion();
    
    conexionBDM conM = new conexionBDM();
    Connection cnM = conM.conexion();
    
    conexionBDA conA = new conexionBDA();
    Connection cnA = conA.conexion();

    public void limpiarTabla() {
        int filas = tablaInventario.getRowCount();
        for (int i = 0; filas > i; i++) {
            modeloI.removeRow(0);
        }
        int filasE = tablaInventarioE.getRowCount();
        for (int i = 0; filasE > i; i++) {
            modeloE.removeRow(0);
        }
         int filasM = tablaInventarioM.getRowCount();
        for (int i = 0; filasM > i; i++) {
            modeloM.removeRow(0);
        }
         int filasA = tablaInventarioA.getRowCount();
        for (int i = 0; filasA > i; i++) {
            modeloA.removeRow(0);
        }

    }

    public void mostrarTabla() {
        if (rFechaCompra.isSelected()) {
            limpiarTabla();
            String sql = "SELECT * FROM Inventario WHERE  FechaCompra  BETWEEN '" + txtFechaInicio.getText().toString() + "' AND '" + txtFechaFin.getText().toString() + "'";
             String[] datos = new String[6];
         String datosA[] = new String[6];
        String datosE[] = new String[6];
        String datosM[] = new String[6];
        
        Statement st,stM,stA,stE;
            try {
                //Tabla Salvador
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    modeloI.addRow(datos);
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
                modeloE.addRow(datosE);    
            }

            } catch (SQLException ex) {
                Logger.getLogger(InventarioD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rFechaCaducidad.isSelected()) {
            limpiarTabla();
            String sql = "SELECT * FROM Inventario WHERE  FechaCaducidad  BETWEEN '" + txtFechaInicio.getText().toString() + "' AND '" + txtFechaFin.getText().toString() + "'";
               String[] datos = new String[6];
         String datosA[] = new String[6];
        String datosE[] = new String[6];
        String datosM[] = new String[6];
        
        Statement st,stM,stA,stE;
            try {
                //Tabla Salvador
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    modeloI.addRow(datos);
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
                modeloE.addRow(datosE);    
            }

            } catch (SQLException ex) {
                Logger.getLogger(InventarioD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public InventarioD() {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        modeloI = (DefaultTableModel) tablaInventario.getModel();
        modeloA = (DefaultTableModel) tablaInventarioA.getModel();
        modeloE = (DefaultTableModel) tablaInventarioE.getModel();
        modeloM = (DefaultTableModel) tablaInventarioM.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgFiltro = new javax.swing.ButtonGroup();
        rgFechas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtFechaFin = new javax.swing.JTextField();
        btnAplicarFecha = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        rProducto = new javax.swing.JRadioButton();
        rLote = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        rFechaCompra = new javax.swing.JRadioButton();
        rFechaCaducidad = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaInventarioM = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaInventarioA = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaInventarioE = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bannerp.png"))); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAplicarFecha.setText("Aplicar");
        btnAplicarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarFechaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel12.setText("Inventario");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        rgFiltro.add(rProducto);
        rProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rProducto.setText("ID Producto");
        rProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rProductoActionPerformed(evt);
            }
        });

        rgFiltro.add(rLote);
        rLote.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rLote.setText("ID Lote");
        rLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLoteActionPerformed(evt);
            }
        });

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Lote", "ID Producto", "Cantidad", "Fecha Compra", "Fecha Caducidad", "Restante"
            }
        ));
        jScrollPane1.setViewportView(tablaInventario);

        rgFechas.add(rFechaCompra);
        rFechaCompra.setText("Fecha de Compra");

        rgFechas.add(rFechaCaducidad);
        rFechaCaducidad.setText("Fecha de Caducidad");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Busqueda:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Fecha Inicio:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Final:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Sucursal Matriz");

        tablaInventarioM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Lote", "ID Producto", "Cantidad", "Fecha Compra", "Fecha Caducidad", "Restante"
            }
        ));
        jScrollPane3.setViewportView(tablaInventarioM);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Sucursal Mariana");

        tablaInventarioA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Lote", "ID Producto", "Cantidad", "Fecha Compra", "Fecha Caducidad", "Restante"
            }
        ));
        jScrollPane4.setViewportView(tablaInventarioA);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Sucursal Abigail");

        tablaInventarioE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Lote", "ID Producto", "Cantidad", "Fecha Compra", "Fecha Caducidad", "Restante"
            }
        ));
        jScrollPane5.setViewportView(tablaInventarioE);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Sucursal Edgar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAplicarFecha))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnFiltrar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(166, 166, 166)
                                    .addComponent(rLote)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rProducto)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(149, 149, 149))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rFechaCompra)
                                .addGap(18, 18, 18)
                                .addComponent(rFechaCaducidad)
                                .addGap(111, 111, 111))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAplicarFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rFechaCompra)
                    .addComponent(rFechaCaducidad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rLote)
                    .addComponent(rProducto))
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rProductoActionPerformed

    private void rLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rLoteActionPerformed

    private void btnAplicarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarFechaActionPerformed
        mostrarTabla();
    }//GEN-LAST:event_btnAplicarFechaActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        if (rLote.isSelected()) {
            limpiarTabla();
            String sql = "SELECT * FROM Inventario WHERE IdLote='" + txtBuscar.getText() + "'";
              String[] datos = new String[6];
         String datosA[] = new String[6];
        String datosE[] = new String[6];
        String datosM[] = new String[6];
        
        Statement st,stM,stA,stE;
            try {
                //Tabla Salvador
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    modeloI.addRow(datos);
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
                modeloE.addRow(datosE);    
            }

            } catch (SQLException ex) {
                Logger.getLogger(InventarioD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rProducto.isSelected()) {
            limpiarTabla();
            String sql = "SELECT * FROM Inventario WHERE IdProducto='" + txtBuscar.getText() + "'";
               String[] datos = new String[6];
         String datosA[] = new String[6];
        String datosE[] = new String[6];
        String datosM[] = new String[6];
        
        Statement st,stM,stA,stE;
            try {
                //Tabla Salvador
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    modeloI.addRow(datos);
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
                modeloE.addRow(datosE);    
            }

            } catch (SQLException ex) {
                Logger.getLogger(InventarioD.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarFecha;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rFechaCaducidad;
    private javax.swing.JRadioButton rFechaCompra;
    private javax.swing.JRadioButton rLote;
    private javax.swing.JRadioButton rProducto;
    private javax.swing.ButtonGroup rgFechas;
    private javax.swing.ButtonGroup rgFiltro;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTable tablaInventarioA;
    private javax.swing.JTable tablaInventarioE;
    private javax.swing.JTable tablaInventarioM;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
