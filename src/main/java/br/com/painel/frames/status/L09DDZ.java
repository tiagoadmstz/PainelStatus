/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.frames.status;

import br.com.painel.util.Auxiliar;
import br.com.painel.renderers.EstiloTablaRenderer;
import br.com.painel.renderers.HeaderRenderer;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rsouza10
 */
public class L09DDZ extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Horario", "Perfil", "Scrap", "Fator Scrap", "Tipo Problema", "Causa", "Observação"}) {
        @Override
        public boolean isCellEditable(int row, int col) {
            return false;
        }
    };

    Float scarptotal = 0f;
    Float fatorscarp = 0f;
    Float totalproduzido = 0f;

    public L09DDZ() {
        initComponents();

        this.jComboBox1.removeAllItems();
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            Statement Sent = con.createStatement();
            ResultSet rs = Sent.executeQuery("Select DISTINCT Perfil from L09_Doc order by Perfil asc ");
            while (rs.next()) {
                this.jComboBox1.addItem(rs.getString("Perfil"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        /////////////////////////////////////////////////L09
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT TOP 1 (HInicial) as inicioprod FROM L09_Doc ORDER BY E3TimeStamp DESC";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            String inicioprod = "";

            while (rs.next()) {

                inicioprod = rs.getString("inicioprod");

            }
            jTextField2.setText(inicioprod);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

        jComboBox2.setSelectedIndex(-1);
        PreencherTabela();
        JButton1ActionPerformed();
//                jTable1.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        jTable1.getTableHeader().setDefaultRenderer(new HeaderRenderer(jTable1));
        jTable1.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        JButton1ActionPerformed();
        this.pegafator();
        this.geratotal();
    }

    private void JButton1ActionPerformed() {
        Double soma = 0.0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            soma = soma + Double.parseDouble(jTable1.getModel().getValueAt(i, 2).toString());
        }
        jTextField3.setText(String.valueOf(soma));
    }

    private void pegafator() {
        String valorfinal = "";
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            valorfinal = jTable1.getModel().getValueAt(i, 3).toString();
        }
//        String.format("%.2f", 1.23456)
        jTextField4.setText(valorfinal);
//        jTextField4.setText(String.format("%1$,.1S", valorfinal));
    }

    public void geratotal() {
        scarptotal = Float.parseFloat(jTextField3.getText());
        fatorscarp = Float.parseFloat(jTextField4.getText());
        totalproduzido = (scarptotal / fatorscarp) * 100;
        jTextField5.setText(String.valueOf(totalproduzido));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Total Produzido:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Scrap Total :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fator Scarp:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("DDZ Atual:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setText("Filtrar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Perfil:");
        jLabel5.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Data/Hora:");
        jLabel6.setEnabled(false);

        jTextField5.setText("jLabel7");

        jTextField3.setText("jLabel7");

        jTextField4.setText("jLabel7");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 674, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(26, 26, 26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBox1)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "Select Distinct Perfil ,HInicial from L09_Doc where Perfil= ? order by HInicial asc";
            PreparedStatement st = con.prepareStatement(query1);
            st.setString(1, jComboBox1.getSelectedItem().toString());
            ResultSet rs = st.executeQuery();
            jComboBox2.removeAllItems();
            while (rs.next()) {

                jComboBox2.addItem(rs.getString("HInicial"));

            }
            JButton1ActionPerformed();
            pegafator();
            geratotal();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jComboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    PreencherTabela2();
                    JButton1ActionPerformed();
                    pegafator();
                    geratotal();

                }
            }
        });
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jLabel5.setEnabled(true);
            jLabel6.setEnabled(true);
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);
        } else {
            jComboBox1.setEnabled(false);
            jComboBox2.setEnabled(false);
            jLabel5.setEnabled(false);
            jLabel6.setEnabled(false);
            jComboBox2.setSelectedIndex(-1);
            jComboBox1.setSelectedIndex(-1);
        }

        if (jCheckBox1.isSelected()) {

        } else {
            PreencherTabela();
            JButton1ActionPerformed();
            pegafator();
            geratotal();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void PreencherTabela() {
        try {
            jTextField2.getText();
            modelo.setNumRows(0);
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "Select Horario,Perfil,Scrap,FatorScrap,TipoProblema,Causa,Obs,HInicial from L09_Doc WHERE HInicial = ? ORDER BY Horario asc";
            PreparedStatement ps = con.prepareStatement(query1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
            ps.setTimestamp(1, new Timestamp(sdf.parse(jTextField2.getText()).getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getTime("Horario"), rs.getString("Perfil"), rs.getInt("Scrap"), rs.getFloat("FatorScrap"), rs.getString("TipoProblema"), rs.getString("Causa"), rs.getString("Obs")});
            }
            modelo.isCellEditable(modelo.getColumnCount(), modelo.getRowCount());
            jTable1.setModel(modelo);

        } catch (Exception e) {
        }
    }

    private void PreencherTabela2() {
        try {
            jTextField2.getText();
            modelo.setNumRows(0);
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "Select Horario,Perfil,Scrap,FatorScrap,TipoProblema,Causa,Obs,HInicial from L09_Doc WHERE HInicial = ? ORDER BY Horario asc";
            PreparedStatement ps = con.prepareStatement(query1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
            ps.setTimestamp(1, new Timestamp(sdf.parse(jComboBox2.getSelectedItem().toString()).getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                modelo.addRow(new Object[]{rs.getTime("Horario"), rs.getString("Perfil"), rs.getInt("Scrap"), rs.getFloat("FatorScrap"), rs.getString("TipoProblema"), rs.getString("Causa"), rs.getString("Obs")});
            }
            modelo.isCellEditable(modelo.getColumnCount(), modelo.getRowCount());
            jTable1.setModel(modelo);
        } catch (Exception e) {
        }
    }

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
            java.util.logging.Logger.getLogger(L09DDZ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L09DDZ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L09DDZ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L09DDZ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L09DDZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jTextField2;
    private javax.swing.JLabel jTextField3;
    private javax.swing.JLabel jTextField4;
    private javax.swing.JLabel jTextField5;
    // End of variables declaration//GEN-END:variables
}
