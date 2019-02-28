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
public class L11ExtrusoraC extends javax.swing.JFrame {

    /**
     * Creates new form L11Extrusora
     */
    public L11ExtrusoraC() {
        initComponents();
        lbperfil.setVisible(false);
        int delay = 1;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();

        int delay1 = 1;   // delay de 5 seg.
        int interval1 = 1000;  // intervalo de 1 seg.
        Timer timer1 = new Timer();
        /////////////////////////////////////////////////
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (ExtC_IndInv1)as inv1ind,(ExtC_SetInv1)as inv1set, (Perfil)as perfil,"
                            + "(ExtC_IndInv2)as inv2ind, (ExtC_SetInv2)as inv2set,"
                            + "(ExtC_IndParafuso)as parafusoind,(ExtC_SetParafuso)as parafusoset,"
                            + "(ExtC_IndFlange)as extafalngeind,(ExtC_SetFlange)as extafalngeset,"
                            + "(ExtC_IndInv3)AS inv3ind,(ExtC_SetInv3)AS inv3set FROM L11 ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    float inv1ind = 0f;
                    float inv1set = 0f;
                    String perfil = "";
                    float parafusoind = 0f;
                    float parafusoset = 0f;
                    float inv2ind = 0f;
                    float inv2set = 0f;
                    float extafalngeind = 0f;
                    float extafalngeset = 0f;
                    float inv3ind = 0f;
                    float inv3set = 0f;

                    while (rs.next()) {
                        inv1ind = rs.getFloat("inv1ind");
                        inv1set = rs.getFloat("inv1set");
                        perfil = rs.getString("perfil");
                        inv2ind = rs.getFloat("inv2ind");
                        inv2set = rs.getFloat("inv2set");
                        parafusoind = rs.getFloat("parafusoind");
                        parafusoset = rs.getFloat("parafusoset");
                        extafalngeind = rs.getFloat("extafalngeind");
                        extafalngeset = rs.getFloat("extafalngeset");
                        inv3ind = rs.getFloat("inv3ind");
                        inv3set = rs.getFloat("inv3set");

                    }
                    lbInv1Real.setText(String.valueOf(inv1ind));
                    lbInv1Set.setText(String.valueOf(inv1set));
                    lbperfil.setText(perfil);
                    lbInv2Set.setText(String.valueOf(inv2set));
                    lbInv2Real.setText(String.valueOf(inv2ind));
                    lbParafSet.setText(String.valueOf(parafusoset));
                    lbParafReal.setText(String.valueOf(parafusoind));
                    lbFlangeSet.setText(String.valueOf(extafalngeset));
                    lbFlangeReal.setText(String.valueOf(extafalngeind));
                    lbInv3Real.setText(String.valueOf(inv3ind));
                    lbInv3Set.setText(String.valueOf(inv3set));

                } catch (Exception e) {
//                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }, delay, interval);

/////////////////////////////////////////////////////////////////////////////////////
        timer1.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (ExtC_Corrente) as extamp,(ExtC_Pressao) as extbar,(ExtC_RPM) as extindrpm FROM L11_Criticos ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    float extamp = 0f;
                    float extbar = 0f;
                    float extindrpm = 0f;

                    while (rs.next()) {

                        extamp = rs.getFloat("extamp");
                        extbar = rs.getFloat("extbar");
                        extindrpm = rs.getFloat("extindrpm");
                    }

                    lbCorrente.setText(String.format("%1$,.1f", extamp));
                    lbPressao.setText(String.format("%1$,.1f", extbar));
                    lbRotacaoReal.setText(String.format("%1$,.1f", extindrpm));

                } catch (Exception e) {
//                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }, delay1, interval1);

/////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT TOP 1 (ExtA_IndInv1)as inv1ind,(ExtA_SetInv1)as inv1set FROM L11 ORDER BY E3TimeStamp DESC";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            float inv1ind = 0f;
            Float inv1set = 0f;

            while (rs.next()) {
                inv1ind = rs.getFloat("inv1ind");
                inv1set = rs.getFloat("inv1set");

            }
            lbInv1Real.setText(String.valueOf(inv1ind));
            lbInv1Set.setText(String.valueOf(inv1set));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

/////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID, (Value) as valor1 FROM Receita_ValueData WHERE ValueID = (SELECT ValueID FROM Receita_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE TemplateID = '15'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            float valor1 = 0f;

            while (rs.next()) {
                valor1 = rs.getFloat("valor1");

            }
            lbInv1Rec.setText(String.valueOf(valor1));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita_ValueData WHERE ValueID = (SELECT ValueID FROM Receita_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '19'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            lbInv2Rec.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita_ValueData WHERE ValueID = (SELECT ValueID FROM Receita_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '11'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            lbParafRec.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita_ValueData WHERE ValueID = (SELECT ValueID FROM Receita_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '7'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            lbFlangeRec.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

        /////////////////////////////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita_ValueData WHERE ValueID = (SELECT ValueID FROM Receita_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '22'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            float valor2 = 0f;

            while (rs.next()) {
                valor2 = rs.getFloat("valor2");

            }

            lbInv3Rec.setText(String.valueOf(valor2));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        /////////////////////////////////////////////////////////////
        try {
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "SELECT * FROM(SELECT ValueID, TemplateID,(Value) as valor2 FROM Receita_ValueData WHERE ValueID = (SELECT ValueID FROM Receita_ValueData WHERE Value = '" + lbperfil.getText() + "')) RECEITA WHERE  TemplateID = '38'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            String valor2 = "";

            while (rs.next()) {
                valor2 = rs.getString("valor2");

            }

            lbRotacaoReceita.setText(valor2);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }        /////////////////////////////////////////////////////////////////////////////////////
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbPressao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbInv1Real = new javax.swing.JLabel();
        lbInv1Rec = new javax.swing.JLabel();
        lbInv2Set = new javax.swing.JLabel();
        lbInv2Rec = new javax.swing.JLabel();
        lbInv2Real = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbInv3Set = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbInv3Rec = new javax.swing.JLabel();
        lbInv3Real = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbParafReal = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbParafRec = new javax.swing.JLabel();
        lbParafSet = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbFlangeRec = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbFlangeSet = new javax.swing.JLabel();
        lbFlangeReal = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbInv1Set = new javax.swing.JLabel();
        lbRotacaoReal = new javax.swing.JLabel();
        lbRotacaoReceita = new javax.swing.JLabel();
        lbCorrente = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lbperfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPressao.setForeground(new java.awt.Color(0, 255, 255));
        lbPressao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPressao.setText("Null");
        jPanel1.add(lbPressao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 452, 50, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("SetPoint:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 60, 60, 20));

        jLabel4.setForeground(new java.awt.Color(102, 255, 102));
        jLabel4.setText("Receita:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 382, 70, 20));

        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Pressão:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 452, 70, 20));

        lbInv1Real.setForeground(new java.awt.Color(0, 255, 255));
        lbInv1Real.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbInv1Real, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 104, 50, 20));

        lbInv1Rec.setForeground(new java.awt.Color(102, 255, 102));
        lbInv1Rec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbInv1Rec, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 82, 50, 20));

        lbInv2Set.setForeground(new java.awt.Color(255, 255, 51));
        lbInv2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbInv2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 50, 20));

        lbInv2Rec.setForeground(new java.awt.Color(102, 255, 102));
        lbInv2Rec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbInv2Rec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 82, 50, 20));

        lbInv2Real.setForeground(new java.awt.Color(0, 255, 255));
        lbInv2Real.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbInv2Real, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 104, 50, 20));

        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("Real:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 104, 70, 20));

        jLabel12.setForeground(new java.awt.Color(102, 255, 102));
        jLabel12.setText("Receita:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 80, 70, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setText("SetPoint:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 60, 70, 20));

        jLabel14.setForeground(new java.awt.Color(102, 255, 102));
        jLabel14.setText("Receita:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 80, 70, 20));

        lbInv3Set.setForeground(new java.awt.Color(255, 255, 51));
        lbInv3Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInv3Set.setText("Null");
        jPanel1.add(lbInv3Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 50, 20));

        jLabel17.setForeground(new java.awt.Color(0, 255, 255));
        jLabel17.setText("Real:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 104, 70, 20));

        lbInv3Rec.setForeground(new java.awt.Color(102, 255, 102));
        lbInv3Rec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInv3Rec.setText("Null");
        jPanel1.add(lbInv3Rec, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 82, 50, 20));

        lbInv3Real.setForeground(new java.awt.Color(0, 255, 255));
        lbInv3Real.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInv3Real.setText("Null");
        jPanel1.add(lbInv3Real, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 104, 50, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 51));
        jLabel19.setText("SetPoint:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 60, 70, 20));

        lbParafReal.setForeground(new java.awt.Color(0, 255, 255));
        lbParafReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbParafReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 417, 50, 20));

        jLabel21.setForeground(new java.awt.Color(102, 255, 102));
        jLabel21.setText("Receita:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 395, 70, 20));

        jLabel22.setForeground(new java.awt.Color(255, 255, 51));
        jLabel22.setText("SetPoint:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 373, 70, 20));

        jLabel23.setForeground(new java.awt.Color(0, 255, 255));
        jLabel23.setText("Real:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 417, 70, 20));

        lbParafRec.setForeground(new java.awt.Color(102, 255, 102));
        lbParafRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbParafRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 395, 50, 20));

        lbParafSet.setForeground(new java.awt.Color(255, 255, 51));
        lbParafSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbParafSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 373, 50, 20));

        jLabel26.setForeground(new java.awt.Color(0, 255, 255));
        jLabel26.setText("Real:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 414, 70, 20));

        lbFlangeRec.setForeground(new java.awt.Color(102, 255, 102));
        lbFlangeRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbFlangeRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 392, 50, 20));

        jLabel28.setForeground(new java.awt.Color(255, 255, 51));
        jLabel28.setText("SetPoint:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 370, 70, 20));

        lbFlangeSet.setForeground(new java.awt.Color(255, 255, 51));
        lbFlangeSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbFlangeSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 50, 20));

        lbFlangeReal.setForeground(new java.awt.Color(0, 255, 255));
        lbFlangeReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbFlangeReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 414, 50, 20));

        jLabel31.setForeground(new java.awt.Color(102, 255, 102));
        jLabel31.setText("Receita:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 392, 70, 20));

        jLabel32.setForeground(new java.awt.Color(0, 255, 255));
        jLabel32.setText("Real:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 104, 60, 20));

        jLabel33.setForeground(new java.awt.Color(102, 255, 102));
        jLabel33.setText("Receita:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 82, 60, 20));

        jLabel34.setForeground(new java.awt.Color(0, 255, 255));
        jLabel34.setText("Real:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 360, 70, 20));

        jLabel35.setForeground(new java.awt.Color(0, 255, 255));
        jLabel35.setText("Corrente:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 417, 70, 20));

        lbInv1Set.setForeground(new java.awt.Color(255, 255, 51));
        lbInv1Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbInv1Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 50, 20));

        lbRotacaoReal.setForeground(new java.awt.Color(0, 255, 255));
        lbRotacaoReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRotacaoReal.setText("Null");
        jPanel1.add(lbRotacaoReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 50, 20));

        lbRotacaoReceita.setForeground(new java.awt.Color(102, 255, 102));
        lbRotacaoReceita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRotacaoReceita.setText("Null");
        jPanel1.add(lbRotacaoReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 382, 50, 20));

        lbCorrente.setForeground(new java.awt.Color(0, 255, 255));
        lbCorrente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCorrente.setText("Null");
        jPanel1.add(lbCorrente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 417, 50, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Involucro 1");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Involucro 2");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 120, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Involucro 3");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 120, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Rotação");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Flange");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 120, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("C");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 6, 37, 25));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Parafuso");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 442, 120, -1));

        lbperfil.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/ExtrusoraA.PNG"))); // NOI18N
        jLabel1.setText("A");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 595, 486));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(L11ExtrusoraC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L11ExtrusoraC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L11ExtrusoraC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L11ExtrusoraC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L11ExtrusoraC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCorrente;
    private javax.swing.JLabel lbFlangeReal;
    private javax.swing.JLabel lbFlangeRec;
    private javax.swing.JLabel lbFlangeSet;
    private javax.swing.JLabel lbInv1Real;
    private javax.swing.JLabel lbInv1Rec;
    private javax.swing.JLabel lbInv1Set;
    private javax.swing.JLabel lbInv2Real;
    private javax.swing.JLabel lbInv2Rec;
    private javax.swing.JLabel lbInv2Set;
    private javax.swing.JLabel lbInv3Real;
    private javax.swing.JLabel lbInv3Rec;
    private javax.swing.JLabel lbInv3Set;
    private javax.swing.JLabel lbParafReal;
    private javax.swing.JLabel lbParafRec;
    private javax.swing.JLabel lbParafSet;
    private javax.swing.JLabel lbPressao;
    private javax.swing.JLabel lbRotacaoReal;
    private javax.swing.JLabel lbRotacaoReceita;
    private javax.swing.JLabel lbperfil;
    // End of variables declaration//GEN-END:variables
}
