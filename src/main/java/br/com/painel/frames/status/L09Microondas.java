/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.frames.status;

import br.com.painel.util.Auxiliar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author rsouza10
 */
public class L09Microondas extends javax.swing.JFrame {

    /**
     * Creates new form L11Microondas
     */
    public L09Microondas() {
        initComponents();
        jLabel2.setVisible(false);
        jLabel68.setVisible(false);
        jLabel72.setVisible(false);
        jLabel76.setVisible(false);
        lbperfil.setVisible(false);
        int delay = 1;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();

        /////////////////////////////////////////////////
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (Microondas_UHF1_Ind) as uhf1ind,(Microondas_UHF1_Set) as uhf1set,"
                            + "(Microondas_UHF2_Ind) as uhf2ind, (Microondas_UHF2_Set) as uhf2set,"
                            + "(Microondas_UHF3_Ind) as uhf3ind, (Microondas_UHF3_Set) as uhf3set,"
                            + "(Microondas_UHF4_Ind) as uhf4ind, (Microondas_UHF4_Set) as uhf4set,"
                            + "(Microondas_EsqPCT_Ind) as esqpctind, (Microondas_EsqPCT_Set) as esqpctset,"
                            + "(Microondas_Esq1_Ind) as esq1ind, (Microondas_Esq1_Set) as esq1set,"
                            + "(Microondas_Exaustao_Ind) as exaustind, (Microondas_Exaustao_Set) as exaustset,"
                            + "(Microondas_TapeteEntrada_Set) as tapeteentradaset,(Microondas_TapeteEntrada_Ind) as tapeteentradaind,"
                            + "(Microondas_Rolos_Ind) as rolosind, (Microondas_Tapete_Ind) as tapeteind,"
                            + "(Perfil)as perfil"
                            + " FROM L09 ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    float uhf1ind = 0f;
                    float uhf1set = 0f;
                    float uhf2ind = 0f;
                    float uhf2set = 0f;
                    float uhf3ind = 0f;
                    float uhf3set = 0f;
                    float uhf4ind = 0f;
                    float uhf4set = 0f;
                    float esqpctind = 0f;
                    float esqpctset = 0f;
                    float esq1ind = 0f;
                    float esq1set = 0f;
                    float exaustind = 0f;
                    float exaustset = 0f;
                    float tapeteentradaset = 0f;
                    float tapeteentradaind = 0f;
                    float rolosind = 0f;
                    float tapeteind = 0f;
                    String perfil = "";

                    while (rs.next()) {
                        uhf1ind = rs.getFloat("uhf1ind");
                        uhf1set = rs.getFloat("uhf1set");
                        uhf2ind = rs.getFloat("uhf2ind");
                        uhf2set = rs.getFloat("uhf2set");
                        uhf3ind = rs.getFloat("uhf3ind");
                        uhf3set = rs.getFloat("uhf3set");
                        uhf4ind = rs.getFloat("uhf4ind");
                        uhf4set = rs.getFloat("uhf4set");
                        esqpctind = rs.getFloat("esqpctind");
                        esqpctset = rs.getFloat("esqpctset");
                        esq1ind = rs.getFloat("esq1ind");
                        esq1set = rs.getFloat("esq1set");
                        exaustind = rs.getFloat("exaustind");
                        exaustset = rs.getFloat("exaustset");
                        tapeteentradaset = rs.getFloat("tapeteentradaset");
                        tapeteentradaind = rs.getFloat("tapeteentradaind");
                        rolosind = rs.getFloat("rolosind");
                        tapeteind = rs.getFloat("tapeteind");
                        perfil = rs.getString("perfil");

                    }
                    jLabel32.setText(String.valueOf(uhf1set));
                    lbUHF1Real.setText(String.valueOf(uhf1ind));
                    jLabel33.setText(String.valueOf(uhf2set));
                    jLabel35.setText(String.valueOf(uhf2ind));
                    jLabel38.setText(String.valueOf(uhf3set));
                    jLabel36.setText(String.valueOf(uhf3ind));
                    jLabel41.setText(String.valueOf(uhf4set));
                    jLabel39.setText(String.valueOf(uhf4ind));
                    jLabel47.setText(String.valueOf(esqpctset));
                    jLabel49.setText(String.valueOf(esqpctind));
                    jLabel51.setText(String.valueOf(esq1set));
                    jLabel52.setText(String.valueOf(esq1ind));
                    jLabel53.setText(String.valueOf(exaustset * 10));
                    jLabel55.setText(String.valueOf(exaustind * 10));
                    jLabel42.setText(String.valueOf(tapeteentradaset));
                    jLabel44.setText(String.valueOf(tapeteentradaind));
                    jLabel45.setText(String.valueOf(rolosind));
                    jLabel46.setText(String.valueOf(tapeteind));
                    lbperfil.setText(perfil);
                    jLabel56.setVisible(false);
                    if (!lbUHF1Real.getText().equals("0.0")) {
                        jLabel14.setVisible(false);
                        jLabel56.setVisible(true);
                    } else {
                        jLabel14.setVisible(true);
                        jLabel56.setVisible(false);
                    }
                    ///////////////////////////////////////
                    jLabel58.setVisible(false);
                    if (!jLabel35.getText().equals("0.0")) {
                        jLabel57.setVisible(false);
                        jLabel58.setVisible(true);
                    } else {
                        jLabel57.setVisible(true);
                        jLabel58.setVisible(false);
                    }
                    ///////////////////////////////////////
                    jLabel60.setVisible(false);
                    if (!jLabel36.getText().equals("0.0")) {
                        jLabel59.setVisible(false);
                        jLabel60.setVisible(true);
                    } else {
                        jLabel59.setVisible(true);
                        jLabel60.setVisible(false);
                    }

                    ///////////////////////////////////////
                    jLabel61.setVisible(false);
                    if (!jLabel39.getText().equals("0.0")) {
                        jLabel62.setVisible(false);
                        jLabel61.setVisible(true);
                    } else {
                        jLabel62.setVisible(true);
                        jLabel61.setVisible(false);
                    }
                } catch (Exception e) {
//                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }, delay, interval);
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita09_ValueData WHERE ValueID = (SELECT ValueID FROM Receita09_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '76'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            jLabel31.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita09_ValueData WHERE ValueID = (SELECT ValueID FROM Receita09_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '77'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            jLabel34.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita09_ValueData WHERE ValueID = (SELECT ValueID FROM Receita09_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '78'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            jLabel37.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita09_ValueData WHERE ValueID = (SELECT ValueID FROM Receita09_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '79'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            jLabel40.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita09_ValueData WHERE ValueID = (SELECT ValueID FROM Receita09_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '82'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            jLabel48.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita09_ValueData WHERE ValueID = (SELECT ValueID FROM Receita09_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '81'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            jLabel50.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita09_ValueData WHERE ValueID = (SELECT ValueID FROM Receita09_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '80'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            jLabel43.setText(String.valueOf(valor2 / 10));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita09_ValueData WHERE ValueID = (SELECT ValueID FROM Receita09_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '83'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            jLabel54.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lbUHF1Real = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        lbperfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("SetPoint:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 39, 90, 30));

        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Real:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 101, 90, 30));

        jLabel5.setForeground(new java.awt.Color(102, 255, 102));
        jLabel5.setText("Receita:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 70, 90, 30));

        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Real:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 101, 90, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("SetPoint:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 39, 90, 30));

        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Real:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 101, 90, 30));

        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("Real:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 101, 90, 30));

        jLabel10.setForeground(new java.awt.Color(102, 255, 102));
        jLabel10.setText("Receita:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 70, 90, 30));

        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("Esteira Entrada:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 521, 90, 30));

        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("Esteira Saída:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 583, 90, 30));

        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("Rolos:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 552, 90, 30));

        jLabel15.setForeground(new java.awt.Color(0, 255, 255));
        jLabel15.setText("Real:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 521, 90, 30));

        jLabel16.setForeground(new java.awt.Color(102, 255, 102));
        jLabel16.setText("Receita:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 490, 90, 30));

        jLabel17.setForeground(new java.awt.Color(0, 255, 255));
        jLabel17.setText("Real:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 521, 90, 30));

        jLabel18.setForeground(new java.awt.Color(102, 255, 102));
        jLabel18.setText("Receita:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 490, 90, 30));

        jLabel19.setForeground(new java.awt.Color(0, 255, 255));
        jLabel19.setText("Real:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 521, 90, 30));

        jLabel21.setForeground(new java.awt.Color(255, 255, 51));
        jLabel21.setText("SetPoint:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 459, 90, 30));

        jLabel22.setForeground(new java.awt.Color(102, 255, 102));
        jLabel22.setText("Receita:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 70, 90, 30));

        jLabel23.setForeground(new java.awt.Color(102, 255, 102));
        jLabel23.setText("Receita:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 490, 90, 30));

        jLabel24.setForeground(new java.awt.Color(255, 255, 51));
        jLabel24.setText("SetPoint:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 459, 90, 30));

        jLabel25.setForeground(new java.awt.Color(255, 255, 51));
        jLabel25.setText("SetPoint:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 459, 90, 30));

        jLabel26.setForeground(new java.awt.Color(102, 255, 102));
        jLabel26.setText("Receita:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 90, 30));

        jLabel27.setForeground(new java.awt.Color(255, 255, 51));
        jLabel27.setText("SetPoint:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 39, 90, 30));

        jLabel28.setForeground(new java.awt.Color(102, 255, 102));
        jLabel28.setText("Receita:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 70, 90, 30));

        jLabel29.setForeground(new java.awt.Color(255, 255, 51));
        jLabel29.setText("SetPoint:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 39, 90, 30));

        lbUHF1Real.setForeground(new java.awt.Color(0, 255, 255));
        lbUHF1Real.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbUHF1Real, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 101, 90, 30));

        jLabel31.setForeground(new java.awt.Color(102, 255, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 70, 90, 30));

        jLabel32.setForeground(new java.awt.Color(255, 255, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 39, 90, 30));

        jLabel33.setForeground(new java.awt.Color(255, 255, 51));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 39, 90, 30));

        jLabel34.setForeground(new java.awt.Color(102, 255, 102));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 70, 90, 30));

        jLabel35.setForeground(new java.awt.Color(0, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 101, 90, 30));

        jLabel36.setForeground(new java.awt.Color(0, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 101, 90, 30));

        jLabel37.setForeground(new java.awt.Color(102, 255, 102));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 70, 90, 30));

        jLabel38.setForeground(new java.awt.Color(255, 255, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 39, 90, 30));

        jLabel39.setForeground(new java.awt.Color(0, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 101, 90, 30));

        jLabel40.setForeground(new java.awt.Color(102, 255, 102));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 70, 90, 30));

        jLabel41.setForeground(new java.awt.Color(255, 255, 51));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 39, 90, 30));

        jLabel42.setForeground(new java.awt.Color(255, 255, 51));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 459, 90, 30));

        jLabel43.setForeground(new java.awt.Color(102, 255, 102));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 490, 90, 30));

        jLabel44.setForeground(new java.awt.Color(0, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 521, 90, 30));

        jLabel45.setForeground(new java.awt.Color(0, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 552, 90, 30));

        jLabel46.setForeground(new java.awt.Color(0, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 583, 90, 30));

        jLabel47.setForeground(new java.awt.Color(255, 255, 51));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 459, 90, 30));

        jLabel48.setForeground(new java.awt.Color(102, 255, 102));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 490, 90, 30));

        jLabel49.setForeground(new java.awt.Color(0, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 521, 90, 30));

        jLabel50.setForeground(new java.awt.Color(102, 255, 102));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 490, 90, 30));

        jLabel51.setForeground(new java.awt.Color(255, 255, 51));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 459, 90, 30));

        jLabel52.setForeground(new java.awt.Color(0, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 521, 90, 30));

        jLabel53.setForeground(new java.awt.Color(255, 255, 51));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 459, 90, 30));

        jLabel54.setForeground(new java.awt.Color(102, 255, 102));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 490, 90, 30));

        jLabel55.setForeground(new java.awt.Color(0, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 521, 90, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_Circle_Red_34214.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 195, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_Circle_Green_34211 (1).png"))); // NOI18N
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 195, -1, -1));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_Circle_Red_34214.png"))); // NOI18N
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 196, -1, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_Circle_Green_34211 (1).png"))); // NOI18N
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 196, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_Circle_Red_34214.png"))); // NOI18N
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 195, -1, -1));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_Circle_Green_34211 (1).png"))); // NOI18N
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 195, -1, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_Circle_Green_34211 (1).png"))); // NOI18N
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 195, -1, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_Circle_Red_34214.png"))); // NOI18N
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 195, -1, -1));

        jLabel63.setForeground(new java.awt.Color(255, 255, 51));
        jLabel63.setText("SetPoint:");
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 459, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status_46254.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 286, 20, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 286, 20, 20));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 286, 20, 20));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status_46254.png"))); // NOI18N
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 286, 20, 20));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 286, 20, 20));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status_46254.png"))); // NOI18N
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 286, 20, 20));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status_46254.png"))); // NOI18N
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 286, 20, 20));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 286, 20, 20));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 286, 20, 20));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status_46254.png"))); // NOI18N
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 286, 20, 20));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status_46254.png"))); // NOI18N
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 286, 20, 20));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 286, 20, 20));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 286, 20, 20));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status_46254.png"))); // NOI18N
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 286, 20, 20));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status_46254.png"))); // NOI18N
        getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 286, 20, 20));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 286, 20, 20));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("UHF 4");
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 60, -1));

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("UHF 2");
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 60, -1));

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("UHF 3");
        getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 50, -1));

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("UHF 1");
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, -1));

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Aquecimeno PCT");
        getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 130, -1));

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Aquecimeno 1");
        getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 130, -1));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Exaustão");
        getContentPane().add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 70, -1));
        getContentPane().add(lbperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/L11Microondas.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(L09Microondas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L09Microondas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L09Microondas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L09Microondas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L09Microondas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbUHF1Real;
    private javax.swing.JLabel lbperfil;
    // End of variables declaration//GEN-END:variables
}
