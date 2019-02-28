/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.frames.status;

import br.com.painel.util.Auxiliar;
import br.com.painel.util.EstiloTablaHeader;
import br.com.painel.util.EstiloTablaRenderer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rsouza10
 */
public class L11Alarmes extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Data", "Hora", "Nome Alarme", "Valor", "Mensagem"}) {
        @Override
        public boolean isCellEditable(int row, int col) {
            return false;
        }

    };

    public L11Alarmes() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        piscalabel();
        PreencherTabela();
        tbAlarmesAtivos.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        tbAlarmesAtivos.setDefaultRenderer(Object.class, new EstiloTablaRenderer());

        int delay = 1;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();

        /////////////////////////////////////////////////L09
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (NumAlarmesAqFita)as alarmaqfita, (NumAlarmesExtA)as alarmexta,(NumAlarmesExtB)as alarmextb,"
                            + "(NumAlarmesExtC)as alarmextc,(NumAlarmesExtD)as alarmextd,(NumAlarmesMicroondas)as alarmmc,"
                            + "(NumAlarmesHotAir1)as alarmhotair1,(NumAlarmesHotAir2)as alarmhotair2,"
                            + "(NumAlarmesBanheira1)as alarmb1,(NumAlarmesPuller1)as alarmpuller1,(NumAlarmesPintura)as alarmpintura,"
                            + "(NumAlarmesInfraRed)as alarmir,"
                            + "(NumAlarmesBanheira2)as alarmb2,(NumAlarmesBanheira3)as alarmb3,(NumAlarmesPuller2)as alarmpuller2,"
                            + "(NumAlarmesPuller3)as alarmpuller3,(NumAlarmesCortadeira)as alarmcort FROM L11 ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    int alarmaqfita = 0;
                    int alarmexta = 0;
                    int alarmextb = 0;
                    int alarmextc = 0;
                    int alarmextd = 0;
                    int alarmmc = 0;
                    int alarmhotair1 = 0;
                    int alarmhotair2 = 0;
                    int alarmb1 = 0;
                    int alarmpuller1 = 0;
                    int alarmpintura = 0;
                    int alarmir = 0;
                    int alarmb2 = 0;
                    int alarmb3 = 0;
                    int alarmpuller2 = 0;
                    int alarmpuller3 = 0;
                    int alarmcort = 0;

                    while (rs.next()) {
                        alarmaqfita = rs.getInt("alarmaqfita");
                        alarmexta = rs.getInt("alarmexta");
                        alarmextb = rs.getInt("alarmextb");
                        alarmextc = rs.getInt("alarmextc");
                        alarmextd = rs.getInt("alarmextd");
                        alarmmc = rs.getInt("alarmmc");
                        alarmhotair1 = rs.getInt("alarmhotair1");
                        alarmhotair2 = rs.getInt("alarmhotair2");
                        alarmb1 = rs.getInt("alarmb1");
                        alarmpuller1 = rs.getInt("alarmpuller1");
                        alarmpintura = rs.getInt("alarmpintura");
                        alarmir = rs.getInt("alarmir");
                        alarmb2 = rs.getInt("alarmb2");
                        alarmb3 = rs.getInt("alarmb3");
                        alarmpuller2 = rs.getInt("alarmpuller2");
                        alarmpuller3 = rs.getInt("alarmpuller3");
                        alarmcort = rs.getInt("alarmcort");
                        
                    }
                    lbAquecedor.setText(String.valueOf(alarmaqfita));
                    lbExtA.setText(String.valueOf(alarmexta));
                    lbExtB.setText(String.valueOf(alarmextb));
                    lbExtC.setText(String.valueOf(alarmextc));
                    lbExtD.setText(String.valueOf(alarmextd));
                    lbMicroondas.setText(String.valueOf(alarmmc));
                    lbHotAir1.setText(String.valueOf(alarmhotair1));
                    lbHotAir2.setText(String.valueOf(alarmhotair2));
                    lbBanheira1.setText(String.valueOf(alarmb1));
                    lbPuller1.setText(String.valueOf(alarmpuller1));
                    lbPintura.setText(String.valueOf(alarmpintura));
                    lbIR.setText(String.valueOf(alarmir));
                    lbBanheira2.setText(String.valueOf(alarmb2));
                    lbBanheira3.setText(String.valueOf(alarmb3));
                    lbPuller2.setText(String.valueOf(alarmpuller2));
                    lbPuller3.setText(String.valueOf(alarmpuller3));
                    lbCortadeira.setText(String.valueOf(alarmcort));
                    jLabel3.setText(String.valueOf(alarmaqfita + alarmexta + alarmextb + alarmextc + alarmextd + alarmmc + alarmhotair1 + alarmhotair2 + alarmb1 + alarmpuller1 + alarmpintura + alarmir + alarmb2 + alarmb3 + alarmpuller2 + alarmpuller3 + alarmcort));
                    piscalabel();
                } catch (Exception e) {
//                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }

            }

        }, delay, interval);

    }

    Timer timer;

    public void piscandoLabel(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), 0, seconds * 700);
    }

    class RemindTask extends TimerTask {

        public void run() {
            if (true) {
                if (!lbAquecedor.getText().equals("0")) {
                    jLabel22.setVisible(!jLabel22.isVisible());
                }
                if (!lbExtA.getText().equals("0")) {
                    jLabel23.setVisible(!jLabel23.isVisible());
                }
                if (!lbExtB.getText().equals("0")) {
                    jLabel24.setVisible(!jLabel24.isVisible());
                }
                if (!lbExtC.getText().equals("0")) {
                    jLabel25.setVisible(!jLabel25.isVisible());
                }
                if (!lbExtD.getText().equals("0")) {
                    jLabel26.setVisible(!jLabel26.isVisible());
                }
                if (!lbMicroondas.getText().equals("0")) {
                    jLabel27.setVisible(!jLabel27.isVisible());
                }
                if (!lbHotAir1.getText().equals("0")) {
                    jLabel28.setVisible(!jLabel28.isVisible());
                }
                if (!lbHotAir2.getText().equals("0")) {
                    jLabel29.setVisible(!jLabel29.isVisible());
                }
                if (!lbBanheira1.getText().equals("0")) {
                    jLabel30.setVisible(!jLabel30.isVisible());
                }
                if (!lbPuller1.getText().equals("0")) {
                    jLabel31.setVisible(!jLabel31.isVisible());
                }
                if (!lbPintura.getText().equals("0")) {
                    jLabel32.setVisible(!jLabel32.isVisible());
                }
                if (!lbIR.getText().equals("0")) {
                    jLabel33.setVisible(!jLabel33.isVisible());
                }
                if (!lbBanheira2.getText().equals("0")) {
                    jLabel34.setVisible(!jLabel34.isVisible());
                }
                if (!lbBanheira3.getText().equals("0")) {
                    jLabel35.setVisible(!jLabel35.isVisible());
                }
                if (!lbPuller2.getText().equals("0")) {
                    jLabel36.setVisible(!jLabel36.isVisible());
                }
                if (!lbPuller3.getText().equals("0")) {
                    jLabel37.setVisible(!jLabel37.isVisible());
                }
                if (!lbCortadeira.getText().equals("0")) {
                    jLabel4.setVisible(!jLabel4.isVisible());
                }
            }
        }
    }

    public void timerStop() {
        timer.cancel();

        if (lbAquecedor.getText().equals("0")) {
            jLabel22.setVisible(false);
        }
        if (lbExtA.getText().equals("0")) {
            jLabel23.setVisible(false);
        }
        if (lbExtB.getText().equals("0")) {
            jLabel24.setVisible(false);
        }
        if (lbExtC.getText().equals("0")) {
            jLabel25.setVisible(false);
        }
        if (lbExtD.getText().equals("0")) {
            jLabel26.setVisible(false);
        }
        if (lbMicroondas.getText().equals("0")) {
            jLabel27.setVisible(false);
        }
        if (lbHotAir1.getText().equals("0")) {
            jLabel28.setVisible(false);
        }
        if (lbHotAir2.getText().equals("0")) {
            jLabel29.setVisible(false);
        }
        if (lbBanheira1.getText().equals("0")) {
            jLabel30.setVisible(false);
        }
        if (lbPuller1.getText().equals("0")) {
            jLabel31.setVisible(false);
        }
        if (lbPintura.getText().equals("0")) {
            jLabel32.setVisible(false);
        }
        if (lbIR.getText().equals("0")) {
            jLabel33.setVisible(false);
        }
        if (lbBanheira2.getText().equals("0")) {
            jLabel34.setVisible(false);
        }
        if (lbBanheira3.getText().equals("0")) {
            jLabel35.setVisible(false);
        }
        if (lbPuller2.getText().equals("0")) {
            jLabel36.setVisible(false);
        }
        if (lbPuller3.getText().equals("0")) {
            jLabel37.setVisible(false);
        }
        if (lbCortadeira.getText().equals("0")) {
            jLabel4.setVisible(false);
        }
    }

    public void piscalabel() {
        if (!lbAquecedor.getText().equals("0") || !lbExtA.getText().equals("0") || !lbExtB.getText().equals("0") || !lbExtC.getText().equals("0") || !lbExtD.getText().equals("0")
                || !lbMicroondas.getText().equals("0") || !lbHotAir1.getText().equals("0") || !lbHotAir2.getText().equals("0") || !lbBanheira1.getText().equals("0") || !lbPuller1.getText().equals("0") || !lbPintura.getText().equals("0")
                || !lbIR.getText().equals("0") || !lbBanheira2.getText().equals("0") || !lbBanheira3.getText().equals("0") || !lbPuller2.getText().equals("0") || !lbPuller3.getText().equals("0") || !lbCortadeira.getText().equals("0")) {
            piscandoLabel(1);
        }
        if (lbAquecedor.getText().equals("0") || lbExtA.getText().equals("0") || lbExtB.getText().equals("0") || lbExtC.getText().equals("0") || lbExtD.getText().equals("0")
                || lbMicroondas.getText().equals("0") || lbHotAir1.getText().equals("0") || lbHotAir2.getText().equals("0") || lbBanheira1.getText().equals("0") || lbPuller1.getText().equals("0") || lbPintura.getText().equals("0")
                || lbIR.getText().equals("0") || lbBanheira2.getText().equals("0") || lbBanheira3.getText().equals("0") || lbPuller2.getText().equals("0") || lbPuller3.getText().equals("0") || lbCortadeira.getText().equals("0")) {
            timerStop();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlarmesAtivos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbCortadeira = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbAquecedor = new javax.swing.JLabel();
        lbExtA = new javax.swing.JLabel();
        lbExtB = new javax.swing.JLabel();
        lbExtC = new javax.swing.JLabel();
        lbExtD = new javax.swing.JLabel();
        lbMicroondas = new javax.swing.JLabel();
        lbHotAir1 = new javax.swing.JLabel();
        lbHotAir2 = new javax.swing.JLabel();
        lbBanheira1 = new javax.swing.JLabel();
        lbPuller1 = new javax.swing.JLabel();
        lbPintura = new javax.swing.JLabel();
        lbIR = new javax.swing.JLabel();
        lbBanheira2 = new javax.swing.JLabel();
        lbBanheira3 = new javax.swing.JLabel();
        lbPuller2 = new javax.swing.JLabel();
        lbPuller3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbAlarmesAtivos.setAutoCreateRowSorter(true);
        tbAlarmesAtivos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAlarmesAtivos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, 920, 854));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("11");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 7, 50, 34));

        lbCortadeira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCortadeira.setForeground(new java.awt.Color(255, 255, 255));
        lbCortadeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbCortadeira, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 789, 90, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aquecedor de Fita:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 93, 130, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Extrusora A:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 136, 90, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Extrusora B:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 180, 90, 33));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Extrusora C:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 220, 90, 33));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Extrusora D:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 267, 90, 33));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Microondas:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 310, 90, 33));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hot Air 1:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 353, 70, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hot Air 2:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 396, 70, 33));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Banheira 1:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 442, 80, 33));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Puller 1:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 484, 60, 33));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pintura 1:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 527, 70, 33));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Infra Red:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 570, 80, 33));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Banheira 2:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 616, 90, 33));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Banheira 3:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 659, 90, 33));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Puller 2:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 702, 130, 33));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Puller 3:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 744, 130, 33));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cortadeira:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 789, 130, 33));

        lbAquecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbAquecedor.setForeground(new java.awt.Color(255, 255, 255));
        lbAquecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbAquecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 94, 90, 33));

        lbExtA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbExtA.setForeground(new java.awt.Color(255, 255, 255));
        lbExtA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 136, 90, 33));

        lbExtB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbExtB.setForeground(new java.awt.Color(255, 255, 255));
        lbExtB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 180, 90, 33));

        lbExtC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbExtC.setForeground(new java.awt.Color(255, 255, 255));
        lbExtC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 222, 90, 33));

        lbExtD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbExtD.setForeground(new java.awt.Color(255, 255, 255));
        lbExtD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 267, 90, 33));

        lbMicroondas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMicroondas.setForeground(new java.awt.Color(255, 255, 255));
        lbMicroondas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 310, 90, 33));

        lbHotAir1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbHotAir1.setForeground(new java.awt.Color(255, 255, 255));
        lbHotAir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbHotAir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 353, 90, 33));

        lbHotAir2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbHotAir2.setForeground(new java.awt.Color(255, 255, 255));
        lbHotAir2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbHotAir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 396, 90, 33));

        lbBanheira1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbBanheira1.setForeground(new java.awt.Color(255, 255, 255));
        lbBanheira1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbBanheira1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 442, 90, 33));

        lbPuller1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPuller1.setForeground(new java.awt.Color(255, 255, 255));
        lbPuller1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 485, 90, 33));

        lbPintura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPintura.setForeground(new java.awt.Color(255, 255, 255));
        lbPintura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 527, 90, 33));

        lbIR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbIR.setForeground(new java.awt.Color(255, 255, 255));
        lbIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, 90, 33));

        lbBanheira2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbBanheira2.setForeground(new java.awt.Color(255, 255, 255));
        lbBanheira2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbBanheira2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 616, 90, 33));

        lbBanheira3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbBanheira3.setForeground(new java.awt.Color(255, 255, 255));
        lbBanheira3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbBanheira3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 659, 90, 33));

        lbPuller2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPuller2.setForeground(new java.awt.Color(255, 255, 255));
        lbPuller2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 702, 90, 33));

        lbPuller3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPuller3.setForeground(new java.awt.Color(255, 255, 255));
        lbPuller3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 745, 90, 33));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 789, 50, 33));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 94, 50, 33));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 137, 50, 33));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 178, 50, 33));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 221, 50, 33));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 270, 50, 30));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 310, 50, 33));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 353, 50, 33));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 396, 50, 33));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 442, 50, 33));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 485, 50, 33));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 528, 50, 33));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 570, 50, 33));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 615, 50, 33));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 659, 50, 33));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 701, 50, 33));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/warning.png"))); // NOI18N
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 745, 50, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 7, 61, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/Alarme09.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 965));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void PreencherTabela() {
        try {
            modelo.setNumRows(0);
            Class.forName(Auxiliar.AcessoBanco.getDriver());
            Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
            String query1 = "Select TOP 200 E3TimeStamp,AlarmSourceName,CurrentValue,Message  from Alarmes order BY E3TimeStamp DESC";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            while (rs.next()) {

                modelo.addRow(new Object[]{rs.getDate("E3TimeStamp"), rs.getTime("E3TimeStamp"), rs.getString("AlarmSourceName"), rs.getFloat("CurrentValue"), rs.getString("Message")});
            }

            modelo.isCellEditable(modelo.getColumnCount(), modelo.getRowCount());
            tbAlarmesAtivos.setModel(modelo);
            tbAlarmesAtivos.getColumnModel().getColumn(0).setMinWidth(90);
            tbAlarmesAtivos.getColumnModel().getColumn(0).setMaxWidth(90);
            tbAlarmesAtivos.getColumnModel().getColumn(1).setMinWidth(90);
            tbAlarmesAtivos.getColumnModel().getColumn(1).setMaxWidth(90);
            tbAlarmesAtivos.getColumnModel().getColumn(2).setMinWidth(250);
            tbAlarmesAtivos.getColumnModel().getColumn(2).setMaxWidth(250);
            tbAlarmesAtivos.getColumnModel().getColumn(3).setMinWidth(90);
            tbAlarmesAtivos.getColumnModel().getColumn(3).setMaxWidth(90);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

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
            java.util.logging.Logger.getLogger(L11Alarmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L11Alarmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L11Alarmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L11Alarmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L11Alarmes().setVisible(true);
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAquecedor;
    private javax.swing.JLabel lbBanheira1;
    private javax.swing.JLabel lbBanheira2;
    private javax.swing.JLabel lbBanheira3;
    private javax.swing.JLabel lbCortadeira;
    private javax.swing.JLabel lbExtA;
    private javax.swing.JLabel lbExtB;
    private javax.swing.JLabel lbExtC;
    private javax.swing.JLabel lbExtD;
    private javax.swing.JLabel lbHotAir1;
    private javax.swing.JLabel lbHotAir2;
    private javax.swing.JLabel lbIR;
    private javax.swing.JLabel lbMicroondas;
    private javax.swing.JLabel lbPintura;
    private javax.swing.JLabel lbPuller1;
    private javax.swing.JLabel lbPuller2;
    private javax.swing.JLabel lbPuller3;
    private javax.swing.JTable tbAlarmesAtivos;
    // End of variables declaration//GEN-END:variables
}
