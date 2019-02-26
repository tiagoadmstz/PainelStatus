/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.status;

import br.com.painel.util.Auxiliar;
import br.com.painel.framesGG.L01ATBOverViewGG;
import br.com.painel.framesGG.L09OverViewGG;
import br.com.painel.framesGG.L11OverViewGG;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author rsouza10
 */
public class Painel extends javax.swing.JFrame {

    /**
     * Creates new form Painel
     */
    public Painel() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        start();
        setIcon();
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        lb11Status.setVisible(false);
        lb11Status1.setVisible(false);
        lb11Status2.setVisible(false);
        lb11Status3.setVisible(false);

    }

    public void start() {
        int delay = 1;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();

        /////////////////////////////////////////////////L09
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (InicioProd) as inicioprod,(Status_Da_Linha) as value,(Perfil)as perfil, (TotalProdu) as pecatotal  FROM L09 ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    float value = 0f;
                    String inicioprod = "";
                    String perfil = "";
                    Float pecatotal = 0f;

                    while (rs.next()) {
                        value = rs.getFloat("value");
                        perfil = rs.getString("perfil");
                        inicioprod = rs.getString("inicioprod");
                        perfil = rs.getString("perfil");
                        pecatotal = rs.getFloat("pecatotal");
                    }
                    lb9Status.setText(String.valueOf(value));
                    jLabel12.setText(perfil);
                    lb09TotalPro.setText(String.valueOf(pecatotal));
                    lb09Hora.setText(inicioprod);

                } catch (Exception e) {
//                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }
                if (!lb9Status.getText().equals("0.0")) {
                    jLabel16.setVisible(true);
                    jLabel17.setVisible(false);
                } else {
                    jLabel17.setVisible(true);
                    jLabel16.setVisible(false);
                }
            }

        }, delay, interval);

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (ScrapTotal)as scraptotal, (FatorScrap)as porcscarp FROM L09_Doc ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);

                    float scraptotal = 0f;
                    float porcscarp = 0f;

                    while (rs.next()) {
                        scraptotal = rs.getFloat("scraptotal");
                        porcscarp = rs.getFloat("porcscarp");

                    }
                    lb09ScrapTotal.setText(String.valueOf(scraptotal));
//                    lb09PorcScrap.setText(String.valueOf(porcscarp + "%"));
                    lb09PorcScrap.setText(String.format("%.1f", porcscarp) + "%");
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }, delay, interval);
        //////////////////////////////////////////

        ////////////////////////////////////////// L03
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (Status_Da_Linha) as value,(Perfil) as perfil, (DDZ_CompTotal) as pecatotal FROM L03 ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    float value = 0f;
                    String perfil = "";
                    float pecatotal = 0f;

                    while (rs.next()) {
                        value = rs.getFloat("value");
                        perfil = rs.getString("perfil");
                        pecatotal = rs.getFloat("pecatotal");

                    }
                    lb3Status.setText(String.valueOf(value));
                    lb03Perfil.setText(perfil);
                    lb03PecaTotal.setText(String.valueOf(pecatotal));

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, e);
                }
                if (!lb3Status.getText().equals("0.0")) {
                    jLabel18.setVisible(true);
                    jLabel19.setVisible(false);
                } else {
                    jLabel19.setVisible(true);
                    jLabel18.setVisible(false);
                }
            }

        }, delay, interval);

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (HInicial) as value, (ScrapTotal)as scraptotal, (FatorScrap)as porcscarp  FROM L03_Doc ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    String value = "";
                    float scraptotal = 0f;
                    float porcscarp = 0f;

                    while (rs.next()) {
                        value = rs.getString("value");
                        scraptotal = rs.getFloat("scraptotal");
                        porcscarp = rs.getFloat("porcscarp");

                    }
                    lb03Data.setText(value);
                    lb03ScrapTotal.setText(String.valueOf(scraptotal));
                    lb03PorcScrap.setText(String.format("%.1f", porcscarp) + "%");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }, delay, interval);

        ///////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////// L11
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (ExtA_Bar) as value,(ExtB_Bar)as value2,(ExtC_Bar)as value3,(ExtD_Bar)as value4, (Perfil)as perfil,(Puller1_IndVelocidade)as velocidade,(HoarioLancamento)as horalancamento, (TotalProduzido)as totalproduzido FROM L11 ORDER BY E3TimeStamp DESC";

                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    float value = 0f;
                    float value2 = 0f;
                    float value3 = 0f;
                    float value4 = 0f;
                    String perfil = "";
                    float velocidade = 0f;
                    float totalproduzido = 0f;

                    String horalancamento = "";

                    while (rs.next()) {
                        value = rs.getFloat("value");
                        value2 = rs.getFloat("value2");
                        value3 = rs.getFloat("value3");
                        value4 = rs.getFloat("value4");
                        perfil = rs.getString("perfil");
                        velocidade = rs.getFloat("velocidade");
                        horalancamento = rs.getString("horalancamento");
                        totalproduzido = rs.getFloat("totalproduzido");

                    }
                    lb11Status.setText(String.valueOf(value));
                    lb11Status1.setText(String.valueOf(value2));
                    lb11Status2.setText(String.valueOf(value3));
                    lb11Status3.setText(String.valueOf(value4));
                    lb11Perfil.setText(perfil);
                    lb11Lancamento.setText(horalancamento);
                    lb11Velocidade1.setText(String.valueOf(totalproduzido));
                    double lb = Double.parseDouble(lb11Status.getText());
                    double lb1 = Double.parseDouble(lb11Status1.getText());
                    double lb2 = Double.parseDouble(lb11Status2.getText());
                    double lb3 = Double.parseDouble(lb11Status3.getText());
                    if (lb > 10 || lb1 > 10 || lb2 > 10 || lb3 > 10) {
                        lb11Velocidade.setText(String.valueOf(velocidade));
                        jLabel30.setVisible(true);
                        jLabel31.setVisible(false);
                    } else {
                        lb11Velocidade.setText(String.valueOf("0.0"));
                        jLabel31.setVisible(true);
                        jLabel30.setVisible(false);
                    }
                } catch (Exception e) {
//                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }

            }

        }, delay, interval);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lb3Status = new javax.swing.JLabel();
        lb9Status = new javax.swing.JLabel();
        lb11Status = new javax.swing.JLabel();
        lb11Status1 = new javax.swing.JLabel();
        lb11Status2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb11Status3 = new javax.swing.JLabel();
        lb03Perfil = new javax.swing.JLabel();
        lb09Hora = new javax.swing.JLabel();
        lb03Data = new javax.swing.JLabel();
        lb09TotalPro = new javax.swing.JLabel();
        lb03PecaTotal = new javax.swing.JLabel();
        lb09ScrapTotal = new javax.swing.JLabel();
        lb09PorcScrap = new javax.swing.JLabel();
        lb03ScrapTotal = new javax.swing.JLabel();
        lb03PorcScrap = new javax.swing.JLabel();
        lb11Velocidade = new javax.swing.JLabel();
        lb11Perfil = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lb11Lancamento = new javax.swing.JLabel();
        lb11Velocidade1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Status da Linha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Velocidade da Linha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Data/Horário de Lançamento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total Produzido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 870, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 852, 1266, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Velocidade da Linha:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 740, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Perfil:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Status da Linha:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 40, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 40, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 40, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 40, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Perfil:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("% Scrap:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 930, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Scrap Total:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 900, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Total Produzido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 870, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Scrap Total:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 900, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("% Scrap:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 930, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Scrap Total:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 900, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("% Scrap:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 930, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Total Produzido:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 870, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Data/Horário de Lançamento:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, 40, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, 40, 40));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Status da Linha:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Data/Horário de Lançamento:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Perfil:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("Velocidade da Linha:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 740, -1, -1));

        lb3Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb3Status.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb3Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 740, 140, 20));

        lb9Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb9Status.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb9Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 740, 140, 20));

        lb11Status.setText("jLabel12");
        jPanel1.add(lb11Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        lb11Status1.setText("jLabel12");
        jPanel1.add(lb11Status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, -1, -1));

        lb11Status2.setText("jLabel12");
        jPanel1.add(lb11Status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 260, 20));

        lb11Status3.setText("jLabel12");
        jPanel1.add(lb11Status3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, -1, -1));

        lb03Perfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03Perfil.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb03Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 270, 20));

        lb09Hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb09Hora.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb09Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 160, 20));

        lb03Data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03Data.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb03Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 160, 20));

        lb09TotalPro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb09TotalPro.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb09TotalPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 870, 110, 20));

        lb03PecaTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03PecaTotal.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb03PecaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 870, 130, 20));

        lb09ScrapTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb09ScrapTotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lb09ScrapTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 900, 100, 20));

        lb09PorcScrap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb09PorcScrap.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lb09PorcScrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 930, 90, 20));

        lb03ScrapTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03ScrapTotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lb03ScrapTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 900, 100, 20));

        lb03PorcScrap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03PorcScrap.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lb03PorcScrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 930, 90, 20));

        lb11Velocidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11Velocidade.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb11Velocidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 740, 90, 20));

        lb11Perfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11Perfil.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb11Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 280, 20));

        jButton2.setBackground(new java.awt.Color(191, 236, 247));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Overview");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 100, 87, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linha 09");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setName(""); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 146, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Linha 01 ATB");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setName(""); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 146, -1));

        jButton1.setBackground(new java.awt.Color(191, 236, 247));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Overview");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1184, 100, 87, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Linha 11");
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setName(""); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 105, -1));

        jButton3.setBackground(new java.awt.Color(191, 236, 247));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setText("Overview");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 100, 87, 20));

        lb11Lancamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11Lancamento.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb11Lancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 330, 160, 20));

        lb11Velocidade1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11Velocidade1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb11Velocidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 870, 90, 20));

        jButton4.setBackground(new java.awt.Color(191, 236, 247));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Alarmes");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1184, 117, 87, 20));

        jButton5.setBackground(new java.awt.Color(191, 236, 247));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton5.setText("DDZ");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 135, 87, 20));

        jButton6.setBackground(new java.awt.Color(191, 236, 247));
        jButton6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("Alarmes");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 117, 87, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/TelaInicial.PNG"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 960));

        jButton7.setBackground(new java.awt.Color(191, 236, 247));
        jButton7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("Alarmes");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 117, 87, 20));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        if (resolucao.equals(new Dimension(1280, 1024))) {
            L11OverView frame = new L11OverView();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else if (resolucao.equals(new Dimension(800, 600))) {
            L11OverView frame = new L11OverView();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else if (resolucao.equals(new Dimension(1920, 1080))) {
            L11OverViewGG frame = new L11OverViewGG();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else {
            L11OverViewGG frame = new L11OverViewGG();
            frame.setSize(resolucao);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        if (resolucao.equals(new Dimension(1280, 1024))) {
            L09OverView frame = new L09OverView();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else if (resolucao.equals(new Dimension(800, 600))) {
            L09OverView frame = new L09OverView();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else if (resolucao.equals(new Dimension(1920, 1080))) {
            L09OverViewGG frame = new L09OverViewGG();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else {
            L09OverViewGG frame = new L09OverViewGG();
            frame.setSize(resolucao);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        if (resolucao.equals(new Dimension(1280, 1024))) {
            L01ATBOverView frame = new L01ATBOverView();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else if (resolucao.equals(new Dimension(800, 600))) {
            L01ATBOverView frame = new L01ATBOverView();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else if (resolucao.equals(new Dimension(1920, 1080))) {
            L01ATBOverViewGG frame = new L01ATBOverViewGG();
            frame.setSize(resolucao);
            frame.setVisible(true);
        } else {
            L01ATBOverViewGG frame = new L01ATBOverViewGG();
            frame.setSize(resolucao);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        L11Alarmes t = new L11Alarmes();
        t.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new L09DDZ().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        L09Alarmes t = new L09Alarmes();
        t.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //começa o look aqui
                LookAndFeel lf = UIManager.getLookAndFeel();

                try {

                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }

                } catch (UnsupportedLookAndFeelException exc) {
                } catch (ClassNotFoundException exc) {
                } catch (InstantiationException exc) {
                } catch (IllegalAccessException exc) {
                }

                UIManager.put("nimbusBase", new Color(238, 232, 170));

                UIManager.put("nimbusBlueGrey", new Color(240, 255, 240));

                UIManager.put("control", new Color(220, 220, 220));
                //temina o look aqui
                new Painel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb03Data;
    private javax.swing.JLabel lb03PecaTotal;
    private javax.swing.JLabel lb03Perfil;
    private javax.swing.JLabel lb03PorcScrap;
    private javax.swing.JLabel lb03ScrapTotal;
    private javax.swing.JLabel lb09Hora;
    private javax.swing.JLabel lb09PorcScrap;
    private javax.swing.JLabel lb09ScrapTotal;
    private javax.swing.JLabel lb09TotalPro;
    private javax.swing.JLabel lb11Lancamento;
    private javax.swing.JLabel lb11Perfil;
    private javax.swing.JLabel lb11Status;
    private javax.swing.JLabel lb11Status1;
    private javax.swing.JLabel lb11Status2;
    private javax.swing.JLabel lb11Status3;
    private javax.swing.JLabel lb11Velocidade;
    private javax.swing.JLabel lb11Velocidade1;
    private javax.swing.JLabel lb3Status;
    private javax.swing.JLabel lb9Status;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/painel/img/iconprincipal.png")));
    }
}
