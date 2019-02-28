/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.framesGG;

import br.com.painel.annotations.MapFrame;
import br.com.painel.entities.PainelPrincipal;
import br.com.painel.interfaces.ManipulaFrame;
import br.com.painel.listener.Listener_PainelGG;
import br.com.painel.util.FrameUtil;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author rsouza10
 */
public final class PainelGG extends ManipulaFrame {

    private static final long serialVersionUID = -6666309417334080833L;
    private final Listener_PainelGG listener;

    public PainelGG() {
        maximize();
        setImageIcon();
        initComponents();
        listener = new Listener_PainelGG(this);
        //start();
    }

    @Override
    public List<JLabel> getJLabelList() {
        return Arrays.asList(jLabel16, jLabel17, lb11Status, lb11Status1, lb11Status2, lb11Status3);
    }

    @Override
    public List<JButton> getJButtonList() {
        return Arrays.asList(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6);
    }

    @Override
    public JLabel[][] getOnOffFields() {
        return new JLabel[][]{
            {lb3Status, jLabel18, jLabel19},
            {lb9Status, jLabel16, jLabel17}
        };
    }

    public JLabel[] getLabelVelocidadeAlarme() {
        return new JLabel[]{jLabel30, jLabel31};
    }

    public JLabel getLb11Velocidade() {
        return lb11Velocidade;
    }

    @MapFrame(field = "valueL09", target = PainelPrincipal.class)
    public JLabel getLb9Status() {
        return lb9Status;
    }

    @MapFrame(field = "perfilL09", target = PainelPrincipal.class)
    public JLabel getJLabel12() {
        return jLabel12;
    }

    @MapFrame(field = "pecatotalL09", target = PainelPrincipal.class)
    public JLabel getLb09TotalPro() {
        return lb09TotalPro;
    }

    @MapFrame(field = "inicioprodL09", target = PainelPrincipal.class)
    public JLabel getLb09Hora() {
        return lb09Hora;
    }

    @MapFrame(field = "scraptotalL09Doc", target = PainelPrincipal.class)
    public JLabel getLb09ScrapTotal() {
        return null;
    }

    @MapFrame(get = "getPorcscarpL09DocStr", target = PainelPrincipal.class)
    public JLabel getLb09PorcScrap() {
        return null;
    }

    @MapFrame(field = "valueL03", target = PainelPrincipal.class)
    public JLabel getLb3Status() {
        return lb3Status;
    }

    @MapFrame(field = "perfilL03", target = PainelPrincipal.class)
    public JLabel getLb03Perfil() {
        return lb03Perfil;
    }

    @MapFrame(field = "pecatotalL03", target = PainelPrincipal.class)
    public JLabel getLb03PecaTotal() {
        return lb03PecaTotal;
    }

    @MapFrame(field = "valueL03Doc", target = PainelPrincipal.class)
    public JLabel getLb03Data() {
        return lb03Data;
    }

    @MapFrame(field = "scraptotalL03Doc", target = PainelPrincipal.class)
    public JLabel getLb03ScrapTotal() {
        return lb03ScrapTotal;
    }

    @MapFrame(get = "getPorcscarpL03DocStr", target = PainelPrincipal.class)
    public JLabel getLb03PorcScrap() {
        return lb03PorcScrap;
    }

    @MapFrame(field = "valueL11", target = PainelPrincipal.class)
    public JLabel getLb11Status() {
        return lb11Status;
    }

    @MapFrame(field = "value2L11", target = PainelPrincipal.class)
    public JLabel getLb11Status1() {
        return lb11Status1;
    }

    @MapFrame(field = "value3L11", target = PainelPrincipal.class)
    public JLabel getLb11Status2() {
        return lb11Status2;
    }

    @MapFrame(field = "value4L11", target = PainelPrincipal.class)
    public JLabel getLb11Status3() {
        return lb11Status3;
    }

    @MapFrame(field = "perfilL11", target = PainelPrincipal.class)
    public JLabel getLb11Perfil() {
        return lb11Perfil;
    }

    @MapFrame(field = "horalancamentoL11", target = PainelPrincipal.class)
    public JLabel getLb11Lancamento() {
        return lb11Lancamento;
    }

    @MapFrame(field = "totalproduzidoL11", target = PainelPrincipal.class)
    public JLabel getLb11Velocidade1() {
        return lb11Velocidade1;
    }

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Status da Linha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Velocidade da Linha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Data/Horário de Lançamento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total Produzido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 890, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 852, 1855, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Velocidade da Linha:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 740, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Perfil:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Status da Linha:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 40, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 40, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 40, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 40, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Perfil:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("% Scrap:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 950, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Scrap Total:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 920, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Total Produzido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 890, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Scrap Total:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 920, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("% Scrap:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 950, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Scrap Total:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 920, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("% Scrap:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 950, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Total Produzido:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 890, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Data/Horário de Lançamento:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 110, 40, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 110, 40, 40));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Status da Linha:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 120, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Data/Horário de Lançamento:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 320, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Perfil:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 500, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("Velocidade da Linha:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 730, -1, -1));

        lb3Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb3Status.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb3Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 740, 140, 20));

        lb9Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb9Status.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb9Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 740, 140, 20));

        lb11Status.setText("jLabel12");
        jPanel1.add(lb11Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 100, -1, -1));

        lb11Status1.setText("jLabel12");
        jPanel1.add(lb11Status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 100, -1, -1));

        lb11Status2.setText("jLabel12");
        jPanel1.add(lb11Status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 260, 20));

        lb11Status3.setText("jLabel12");
        jPanel1.add(lb11Status3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 100, -1, -1));

        lb03Perfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03Perfil.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb03Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 270, 20));

        lb09Hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb09Hora.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb09Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 160, 20));

        lb03Data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03Data.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb03Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, 160, 20));

        lb09TotalPro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb09TotalPro.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb09TotalPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 890, 110, 20));

        lb03PecaTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03PecaTotal.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb03PecaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 890, 130, 20));

        lb09ScrapTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb09ScrapTotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lb09ScrapTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 920, 100, 20));

        lb09PorcScrap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb09PorcScrap.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lb09PorcScrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 950, 90, 20));

        lb03ScrapTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03ScrapTotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lb03ScrapTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 920, 100, 20));

        lb03PorcScrap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb03PorcScrap.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lb03PorcScrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 950, 90, 20));

        lb11Velocidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11Velocidade.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb11Velocidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 730, 90, 20));

        lb11Perfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11Perfil.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb11Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 500, 280, 20));

        jButton2.setBackground(new java.awt.Color(191, 236, 247));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Overview");
        jButton2.setActionCommand("jButton2");
        jButton2.setFocusable(false);
        jButton2.setName("jButton2"); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 100, 87, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linha 09");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setName(""); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 15, 510, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Linha 01 ATB");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setName(""); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 510, 60));

        jButton1.setBackground(new java.awt.Color(191, 236, 247));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Overview");
        jButton1.setActionCommand("jButton1");
        jButton1.setFocusable(false);
        jButton1.setName("jButton1"); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1802, 100, 87, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Linha 11");
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setName(""); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 20, 500, 60));

        jButton3.setBackground(new java.awt.Color(191, 236, 247));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setText("Overview");
        jButton3.setActionCommand("jButton3");
        jButton3.setFocusable(false);
        jButton3.setName("jButton3"); // NOI18N
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1129, 100, 87, 20));

        lb11Lancamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11Lancamento.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb11Lancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 320, 160, 20));

        lb11Velocidade1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11Velocidade1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lb11Velocidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 890, 90, 20));

        jButton4.setBackground(new java.awt.Color(191, 236, 247));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Alarmes");
        jButton4.setActionCommand("jButton4");
        jButton4.setFocusable(false);
        jButton4.setName("jButton4"); // NOI18N
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1802, 120, 87, 20));

        jButton5.setBackground(new java.awt.Color(191, 236, 247));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Alarmes");
        jButton5.setActionCommand("jButton5");
        jButton5.setFocusable(false);
        jButton5.setName("jButton5"); // NOI18N
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 120, 87, 20));

        jButton6.setBackground(new java.awt.Color(191, 236, 247));
        jButton6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton6.setText("DDZ");
        jButton6.setActionCommand("jButton6");
        jButton6.setFocusable(false);
        jButton6.setName("jButton6"); // NOI18N
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 140, 87, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/InicialNoteGG.PNG"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1010));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FrameUtil.setNimbusLookAndFeel();
                new PainelGG().setVisible(true);
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

}
