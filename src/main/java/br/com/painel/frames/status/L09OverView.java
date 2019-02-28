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
public class L09OverView extends javax.swing.JFrame {

    /**
     * Creates new form L09OuverView
     */
    public L09OverView() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    public void start() {
        int delay = 1;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();

        int delay1 = 1;   // delay de 5 seg.
        int interval1 = 1000;  // intervalo de 1 seg.
        Timer timer1 = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (Microondas_EsqPCT_Ind) as micropctind, (Microondas_EsqPCT_Set) as micropctset,"
                            + "(Microondas_Esq1_Ind)as microesqind,(Microondas_Esq1_Set)as microesqset,"
                            + "(Microondas_TapeteEntrada_Ind)as microesteiraind,(Microondas_TapeteEntrada_Set)as microesteiraset,"
                            + "(Microondas_Exaustao_Ind)as microexaustorind, (Microondas_Exaustao_Set)as microexaustorset,"
                            + "(Microondas_ArRefrigerado_Ind)as microrefrigeradoind,(Microondas_ArRefrigerado_Set)as microrefrigeradoset,"
                            + "(Vulc1_IndTempControle1)as vulc1queimadorind,(Vulc1_SetTempControle1)as vulc1queimadorset,"
                            + "(Vulc1_IndTempControle2)as vulc1queimador2ind,(Vulc1_SetTempControle2)as vulc1queimador2set,"
                            + "(ExtA_IndRpm)as extarpm,(ExtB_IndRpm)as extbrpm,(ExtC_IndRpm)as extcrpm,(ExtD_IndRpm)as extdrpm,"
                            + "(ExtA_Bar)as extabar,(ExtB_Bar)as extbbar,(ExtC_Bar)as extcbar,(ExtD_Bar)as extdbar,"
                            + "(Vulc1_IndEsteira)as vulc1esteiraind,(Vulc1_SetEsteira)as vulc1esteiraset,"
                            + "(Puller1_IndVelocidade)as puller1velocidadeind,(Puller1_SetVelocidade)as puller1velocidadeset,"
                            + "(VUlc2_IndTempControle1)as vulc2queimadorind,(Vulc2_SetTempControle1)as vulc2queimadorset,"
                            + "(Vulc2_IndTempControle2)as vulc2queimador2ind,(Vulc2_SetTempControle2)as vulc2queimador2set,"
                            + "(Vulc1_IndEsteira)as vulc2esteiraind,(Vulc1_SetEsteira)as vulc2esteiraset,"
                            + "(Banheira1_SetTempReservatorio)as banheira1reservatorioind,"
                            + "(Banheira1_BombaPerfil_OnOff)as banheira1onof, (Banheira1_BombaTanque_OnOff)as banheira1bombatanqueonof,"
                            + "(Puller1_Inversor_OnOff) as pullerinversoronof,"
                            + "(Pintura_B1_Set)as pinturab1set,(Pintura_B1_OnOff) as pintura1onof,"
                            + "(Pintura_B2_Set)as pinturab2set,(Pintura_B2_OnOff)as pintura2onof,"
                            + "(Pintura_B3_Set)as pinturab3set, (Pintura_B3_OnOff)as pintura3onof,"
                            + "(Pintura_B4_Set)as pinturab4set, (Pintura_B4_OnOff)as pintura4onof,"
                            + "(InfraRedForno_SetLampFrontal)as iflampfrontal,(InfraRedForno_IndLampFrontalOnOff)as iflampfonof, "
                            + "(InfraRedForno_SetLampCentral)as iflampcentral, (InfraRedForno_IndLamCentralOnOff)as iflampconof,"
                            + "(InfraRedForno_SetLampTraseira)as iflamptraseira,(InfraRedForno_IndLampTraseiraOnOff)as iflamptonof,"
                            + "(InfraRedForno_IndEsteira2)as ifesteira2ind,(InfraRedForno_SetEsteira2)as ifesteira2set,"
                            + "(Perfil)as perfil,"
                            + "(InfraRedForno_IndEsteira1)as ifesteiraind, (InfraRedForno_SetEsteira1)as ifesteiraset FROM L09 ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);
                    float micropctind = 0f;
                    float micropctset = 0f;
                    float microesqind = 0f;
                    float microesqset = 0f;
                    float microesteiraind = 0f;
                    float microesteiraset = 0f;
                    float microexaustorind = 0f;
                    float microexaustorset = 0f;
                    float microrefrigeradoind = 0f;
                    float microrefrigeradoset = 0f;
                    float vulc1queimadorind = 0f;
                    float vulc1queimadorset = 0f;
                    float vulc1queimador2ind = 0f;
                    float vulc1queimador2set = 0f;
                    float vulc1esteiraind = 0f;
                    float vulc1esteiraset = 0f;
                    float puller1velocidadeset = 0f;
                    float vulc2queimadorind = 0f;
                    float vulc2queimadorset = 0f;
                    float vulc2queimador2ind = 0f;
                    float vulc2queimador2set = 0f;
                    float vulc2esteiraind = 0f;
                    float vulc2esteiraset = 0f;
                    float banheira1reservatorioind = 0f;
                    float banheira1onof = 0f;
                    float banheira1bombatanqueonof = 0f;
                    float pullerinversoronof = 0f;
                    float pinturab1set = 0f;
                    float pintura1onof = 0f;
                    float pinturab2set = 0f;
                    float pintura2onof = 0f;
                    float pinturab3set = 0f;
                    float pintura3onof = 0f;
                    float pinturab4set = 0f;
                    float pintura4onof = 0f;
                    float iflampfrontal = 0f;
                    float iflampfonof = 0f;
                    float iflampcentral = 0f;
                    float iflampconof = 0f;
                    float iflamptraseira = 0f;
                    float iflamptonof = 0f;
                    float ifesteira2ind = 0f;
                    float ifesteira2set = 0f;
                    String perfil = "";
                    //
                    float ifesteiraind = 0f;
                    float ifesteiraset = 0f;
                    //

                    while (rs.next()) {

                        micropctind = rs.getFloat("micropctind");
                        micropctset = rs.getFloat("micropctset");
                        microesqind = rs.getFloat("microesqind");
                        microesqset = rs.getFloat("microesqset");
                        microesteiraind = rs.getFloat("microesteiraind");
                        microesteiraset = rs.getFloat("microesteiraset");
                        microexaustorind = rs.getFloat("microexaustorind");
                        microexaustorset = rs.getFloat("microexaustorset");
                        microrefrigeradoind = rs.getFloat("microrefrigeradoind");
                        microrefrigeradoset = rs.getFloat("microrefrigeradoset");
                        vulc1queimadorind = rs.getFloat("vulc1queimadorind");
                        vulc1queimadorset = rs.getFloat("vulc1queimadorset");
                        vulc1queimador2ind = rs.getFloat("vulc1queimador2ind");
                        vulc1queimador2set = rs.getFloat("vulc1queimador2set");
                        vulc1esteiraind = rs.getFloat("vulc1esteiraind");
                        vulc1esteiraset = rs.getFloat("vulc1esteiraset");
                        puller1velocidadeset = rs.getFloat("puller1velocidadeset");
                        vulc2queimadorind = rs.getFloat("vulc2queimadorind");
                        vulc2queimadorset = rs.getFloat("vulc2queimadorset");
                        vulc2queimador2ind = rs.getFloat("vulc2queimador2ind");
                        vulc2queimador2set = rs.getFloat("vulc2queimador2set");
                        vulc2esteiraind = rs.getFloat("vulc2esteiraind");
                        vulc2esteiraset = rs.getFloat("vulc2esteiraset");
                        banheira1reservatorioind = rs.getFloat("banheira1reservatorioind");
                        banheira1onof = rs.getFloat("banheira1onof");
                        banheira1bombatanqueonof = rs.getFloat("banheira1bombatanqueonof");
                        pullerinversoronof = rs.getFloat("pullerinversoronof");
                        pinturab1set = rs.getFloat("pinturab1set");
                        pintura1onof = rs.getFloat("pintura1onof");
                        pinturab2set = rs.getFloat("pinturab2set");
                        pintura2onof = rs.getFloat("pintura2onof");
                        pinturab3set = rs.getFloat("pinturab3set");
                        pintura3onof = rs.getFloat("pintura3onof");
                        pinturab4set = rs.getFloat("pinturab4set");
                        pintura4onof = rs.getFloat("pintura4onof");
                        iflampfrontal = rs.getFloat("iflampfrontal");
                        iflampfonof = rs.getFloat("iflampfonof");
                        iflampcentral = rs.getFloat("iflampcentral");
                        iflampconof = rs.getFloat("iflampconof");
                        iflamptraseira = rs.getFloat("iflamptraseira");
                        iflamptonof = rs.getFloat("iflamptonof");
                        ifesteira2ind = rs.getFloat("ifesteira2ind");
                        ifesteira2set = rs.getFloat("ifesteira2set");
                        perfil = rs.getString("perfil");
                        //
                        ifesteiraind = rs.getFloat("ifesteiraind");
                        ifesteiraset = rs.getFloat("ifesteiraset");
                        //

                    }

                    lbMicroPctInd.setText(String.valueOf(micropctind));
                    lbMicroPctSet.setText(String.valueOf(micropctset));
                    lbMicroEsqInd.setText(String.valueOf(microesqind));
                    lbMicroEsqSet.setText(String.valueOf(microesqset));
                    lbMicroEsteiraInd.setText(String.valueOf(microesteiraind));
                    lbMicroEsteiraSet.setText(String.valueOf(microesteiraset));
                    lbMicroExaustorInd.setText(String.valueOf(microexaustorind));
                    lbMicroExaustorSet.setText(String.valueOf(microexaustorset));
                    lbMicroRefrigeradoInd.setText(String.valueOf(microrefrigeradoind));
                    lbMicroRefrigeradoSet.setText(String.valueOf(microrefrigeradoset));
                    lbVulc1QueimadorInd.setText(String.valueOf(vulc1queimadorind));
                    lbVulc1QueimadorSet.setText(String.valueOf(vulc1queimadorset));
                    lbVulc1Queimador2Ind.setText(String.valueOf(vulc1queimador2ind));
                    lbVulc1Queimador2Set.setText(String.valueOf(vulc1queimador2set));
                    lbVulc1EsteiraInd.setText(String.valueOf(vulc1esteiraind));
                    lbVulc1EsteiraSet.setText(String.valueOf(vulc1esteiraset));
                    lbPuller1VelocidadeSet.setText(String.valueOf(puller1velocidadeset));
                    lbVulc2QueimadorInd.setText(String.valueOf(vulc2queimadorind));
                    lbVulc2QueimadorSet.setText(String.valueOf(vulc2queimadorset));
                    lbVulc2Queimador2Ind.setText(String.valueOf(vulc2queimador2ind));
                    lbVulc2Queimador2Set.setText(String.valueOf(vulc2queimador2set));
                    lbVulc2EsteiraInd.setText(String.valueOf(vulc2esteiraind));
                    lbVulc2EsteiraSet.setText(String.valueOf(vulc2esteiraset));
                    lbBanheirareseRvatorioInd.setText(String.valueOf(banheira1reservatorioind));
                    lbaBanheira1BombaChillerON.setText(String.valueOf(banheira1onof));
                    lbaBanheira1BombaTanque.setText(String.valueOf(banheira1bombatanqueonof));
                    lbPuller1.setText(String.valueOf(pullerinversoronof));
                    lbPinturaB1Ind.setText(String.valueOf(pinturab1set * pintura1onof));
                    lbPinturaB1Set.setText(String.valueOf(pinturab1set));
                    lbPinturaB2Ind.setText(String.valueOf(pinturab2set * pintura2onof));
                    lbPinturaB2Set.setText(String.valueOf(pinturab2set));
                    lbPinturaB3Ind.setText(String.valueOf(pinturab3set * pintura3onof));
                    lbPinturaB3Set.setText(String.valueOf(pinturab3set));
                    lbPinturaB4Ind.setText(String.valueOf(pinturab4set * pintura4onof));
                    lbPinturaB4Set.setText(String.valueOf(pinturab4set));
                    lbIFLFrontalSet.setText(String.valueOf(iflampfrontal));
                    lbIFLFrontalInd.setText(String.valueOf(iflampfrontal * iflampfonof));
                    lbIFLCentralSet.setText(String.valueOf(iflampcentral));
                    lbIFLCentralInd.setText(String.valueOf(iflampcentral * iflampconof));
                    lbIFLTraseiraSet.setText(String.valueOf(iflamptraseira));
                    lbIFLTraseiraInd.setText(String.valueOf(iflamptraseira * iflamptonof));
                    lbIFLEsteira2Ind.setText(String.format("%1$,.1f", ifesteira2ind));
                    lbIFLEsteira2Set.setText(String.valueOf(ifesteira2set));
                    lbPerfil.setText(perfil);
                    //
                    lbIFLEsteiraInd.setText(String.format("%1$,.1f", ifesteiraind));
                    lbIFLEsteiraSet.setText(String.valueOf(ifesteiraset));
                    //

                    //Banheira 1
                    lbaBanheira1BombaChillerON.setVisible(false);
                    if (!lbaBanheira1BombaChillerON.getText().equals("0.0")) {
                        lbBanheira1BombaChillerON.setVisible(true);
                        lbBanheira1BombaChillerOF.setVisible(false);
                    } else {
                        lbBanheira1BombaChillerOF.setVisible(true);
                        lbBanheira1BombaChillerON.setVisible(false);
                    }
                    //Banheira 1
                    lbaBanheira1BombaTanque.setVisible(false);
                    if (!lbaBanheira1BombaTanque.getText().equals("0.0")) {
                        lbBanheira1BombaTanqueON.setVisible(true);
                        lbBanheira1BombaTanqueOf.setVisible(false);
                    } else {
                        lbBanheira1BombaTanqueOf.setVisible(true);
                        lbBanheira1BombaTanqueON.setVisible(false);
                    }

                    //Puller1
                    lbPuller1.setVisible(false);
                    if (!lbPuller1.getText().equals("0.0")) {
                        lbPuller1ON.setVisible(true);
                        lbPuller1OF.setVisible(false);
                    } else {
                        lbPuller1OF.setVisible(true);
                        lbPuller1ON.setVisible(false);
                    }
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }, delay, interval);

        timer1.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    Class.forName(Auxiliar.AcessoBanco.getDriver());
                    Connection con = DriverManager.getConnection(Auxiliar.AcessoBanco.getUrl(), Auxiliar.AcessoBanco.getUser(), Auxiliar.AcessoBanco.getPass());
                    String query1 = "SELECT TOP 1 (ExtA_RPM)as extarpm,(ExtB_RPM)as extbrpm,(ExtC_RPM)as extcrpm,(ExtD_RPM)as extdrpm,"
                            + "(ExtA_Pressao)as extabar,(ExtB_Pressao)as extbbar,(ExtC_Pressao)as extcbar,(ExtD_Pressao)as extdbar,"
                            + "(Puller_Velocidade)as puller1velocidadeind FROM L09_Criticos ORDER BY E3TimeStamp DESC";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query1);

                    float extarpm = 0f;
                    float extbrpm = 0f;
                    float extcrpm = 0f;
                    float extdrpm = 0f;
                    float extabar = 0f;
                    float extbbar = 0f;
                    float extcbar = 0f;
                    float extdbar = 0f;
                    float puller1velocidadeind = 0f;

                    while (rs.next()) {
                        extarpm = rs.getFloat("extarpm");
                        extbrpm = rs.getFloat("extbrpm");
                        extcrpm = rs.getFloat("extcrpm");
                        extdrpm = rs.getFloat("extdrpm");
                        extabar = rs.getFloat("extabar");
                        extbbar = rs.getFloat("extbbar");
                        extcbar = rs.getFloat("extcbar");
                        extdbar = rs.getFloat("extdbar");
                        puller1velocidadeind = rs.getFloat("puller1velocidadeind");

                    }
                    lbExtARpm.setText(String.format("%1$,.1f", extarpm));
                    lbExtBRpm.setText(String.format("%1$,.1f", extbrpm));
                    lbExtCRpm.setText(String.format("%1$,.1f", extcrpm));
                    lbExtDRpm.setText(String.format("%1$,.1f", extdrpm));
                    lbExtABar.setText(String.valueOf(extabar));
                    lbExtBBar.setText(String.valueOf(extbbar));
                    lbExtCBar.setText(String.valueOf(extcbar));
                    lbExtDBar.setText(String.valueOf(extdbar));
                    lbPuller1VelocidadeInd.setText(String.valueOf(puller1velocidadeind));
//                    piscalabel();

                } catch (Exception e) {
//                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }, delay1, interval1);
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
        lbMicroPctInd = new javax.swing.JLabel();
        lbMicroEsqInd = new javax.swing.JLabel();
        lbMicroEsqSet = new javax.swing.JLabel();
        lbMicroEsteiraInd = new javax.swing.JLabel();
        lbMicroEsteiraSet = new javax.swing.JLabel();
        lbMicroExaustorInd = new javax.swing.JLabel();
        lbMicroExaustorSet = new javax.swing.JLabel();
        lbMicroRefrigeradoSet = new javax.swing.JLabel();
        lbMicroRefrigeradoInd = new javax.swing.JLabel();
        lbMicroPctSet = new javax.swing.JLabel();
        lbVulc1QueimadorSet = new javax.swing.JLabel();
        lbVulc1QueimadorInd = new javax.swing.JLabel();
        lbVulc1Queimador2Ind = new javax.swing.JLabel();
        lbVulc1EsteiraSet = new javax.swing.JLabel();
        lbVulc1EsteiraInd = new javax.swing.JLabel();
        lbVulc1Queimador2Set = new javax.swing.JLabel();
        lbExtARpm = new javax.swing.JLabel();
        lbExtABar = new javax.swing.JLabel();
        lbExtBBar = new javax.swing.JLabel();
        lbExtBRpm = new javax.swing.JLabel();
        lbExtDBar = new javax.swing.JLabel();
        lbExtDRpm = new javax.swing.JLabel();
        lbExtCBar = new javax.swing.JLabel();
        lbExtCRpm = new javax.swing.JLabel();
        lbMicroPctInd1 = new javax.swing.JLabel();
        lbMicroPctSet1 = new javax.swing.JLabel();
        lbMicroPctSet2 = new javax.swing.JLabel();
        lbBanheirareseRvatorioInd = new javax.swing.JLabel();
        lbPuller1VelocidadeSet = new javax.swing.JLabel();
        lbPuller1VelocidadeInd = new javax.swing.JLabel();
        lbVulc2QueimadorSet = new javax.swing.JLabel();
        lbVulc2QueimadorInd = new javax.swing.JLabel();
        lbVulc2Queimador2Ind = new javax.swing.JLabel();
        lbVulc2Queimador2Set = new javax.swing.JLabel();
        lbVulc2EsteiraSet = new javax.swing.JLabel();
        lbVulc2EsteiraInd = new javax.swing.JLabel();
        lbBanheira1BombaChillerON = new javax.swing.JLabel();
        lbBanheira1BombaChillerOF = new javax.swing.JLabel();
        lbBanheira1BombaTanqueON = new javax.swing.JLabel();
        lbBanheira1BombaTanqueOf = new javax.swing.JLabel();
        lbPinturaB1Set = new javax.swing.JLabel();
        lbaBanheira1BombaChillerON = new javax.swing.JLabel();
        lbPinturaB1Ind = new javax.swing.JLabel();
        lbaBanheira1BombaTanque = new javax.swing.JLabel();
        lbPinturaB2Set = new javax.swing.JLabel();
        lbPinturaB2Ind = new javax.swing.JLabel();
        lbPinturaB3Ind = new javax.swing.JLabel();
        lbPinturaB3Set = new javax.swing.JLabel();
        lbPinturaB4Set = new javax.swing.JLabel();
        lbPinturaB4Ind = new javax.swing.JLabel();
        lbIFLFrontalInd = new javax.swing.JLabel();
        lbIFLFrontalSet = new javax.swing.JLabel();
        lbPuller1VelocidadeSet6 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd6 = new javax.swing.JLabel();
        lbIFLCentralSet = new javax.swing.JLabel();
        lbIFLCentralInd = new javax.swing.JLabel();
        lbIFLTraseiraInd = new javax.swing.JLabel();
        lbIFLTraseiraSet = new javax.swing.JLabel();
        lbIFLEsteira2Ind = new javax.swing.JLabel();
        lbIFLEsteira2Set = new javax.swing.JLabel();
        lbPuller1VelocidadeSet10 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd10 = new javax.swing.JLabel();
        lbPuller1VelocidadeSet11 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd11 = new javax.swing.JLabel();
        lbPuller1VelocidadeSet12 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd12 = new javax.swing.JLabel();
        lbPuller1VelocidadeSet13 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd13 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd14 = new javax.swing.JLabel();
        lbPuller1VelocidadeSet14 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd15 = new javax.swing.JLabel();
        lbPuller1VelocidadeSet15 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd16 = new javax.swing.JLabel();
        lbPuller1VelocidadeSet16 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd17 = new javax.swing.JLabel();
        lbPuller1VelocidadeSet17 = new javax.swing.JLabel();
        lbPuller1ON = new javax.swing.JLabel();
        lbPuller1OF = new javax.swing.JLabel();
        lbPuller1 = new javax.swing.JLabel();
        lbPerfil = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbIFLEsteiraSet = new javax.swing.JLabel();
        lbIFLEsteiraInd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
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
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMicroPctInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroPctInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 104, 60, 25));

        lbMicroEsqInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroEsqInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsqInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsqInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 106, 60, 23));

        lbMicroEsqSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroEsqSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsqSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsqSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 78, 59, 24));

        lbMicroEsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroEsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 299, 59, 25));

        lbMicroEsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroEsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 272, 59, 25));

        lbMicroExaustorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroExaustorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroExaustorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroExaustorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 299, 60, 25));

        lbMicroExaustorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroExaustorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroExaustorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroExaustorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 272, 60, 25));

        lbMicroRefrigeradoSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroRefrigeradoSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroRefrigeradoSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroRefrigeradoSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 272, 60, 24));

        lbMicroRefrigeradoInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroRefrigeradoInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroRefrigeradoInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroRefrigeradoInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 299, 60, 25));

        lbMicroPctSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroPctSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 78, 60, 24));

        lbVulc1QueimadorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1QueimadorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1QueimadorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1QueimadorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 78, 60, 24));

        lbVulc1QueimadorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1QueimadorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1QueimadorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1QueimadorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 106, 60, 24));

        lbVulc1Queimador2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1Queimador2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1Queimador2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1Queimador2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 106, 59, 24));

        lbVulc1EsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1EsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1EsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1EsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 272, 60, 24));

        lbVulc1EsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1EsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1EsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1EsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 299, 60, 25));

        lbVulc1Queimador2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1Queimador2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1Queimador2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1Queimador2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 79, 59, 24));

        lbExtARpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtARpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtARpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtARpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 19, 60, 25));

        lbExtABar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtABar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtABar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtABar, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 47, 60, 25));

        lbExtBBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtBBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtBBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtBBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 92, 59, 25));

        lbExtBRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtBRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtBRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtBRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 66, 60, 25));

        lbExtDBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtDBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtDBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtDBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 355, 60, 25));

        lbExtDRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtDRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtDRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtDRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 327, 60, 25));

        lbExtCBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtCBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtCBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtCBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 306, 58, 25));

        lbExtCRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtCRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtCRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtCRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 280, 60, 23));

        lbMicroPctInd1.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroPctInd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctInd1.setText("Null");
        lbMicroPctInd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctInd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 459, 60, 25));

        lbMicroPctSet1.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroPctSet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctSet1.setText("Null");
        lbMicroPctSet1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctSet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 432, 60, 25));

        lbMicroPctSet2.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroPctSet2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctSet2.setText("Null");
        lbMicroPctSet2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctSet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 432, 60, 25));

        lbBanheirareseRvatorioInd.setForeground(new java.awt.Color(0, 255, 255));
        lbBanheirareseRvatorioInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanheirareseRvatorioInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbBanheirareseRvatorioInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 459, 60, 25));

        lbPuller1VelocidadeSet.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 433, 60, 25));

        lbPuller1VelocidadeInd.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 459, 60, 25));

        lbVulc2QueimadorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2QueimadorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2QueimadorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2QueimadorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 78, 60, 25));

        lbVulc2QueimadorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2QueimadorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2QueimadorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2QueimadorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 106, 60, 25));

        lbVulc2Queimador2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2Queimador2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2Queimador2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2Queimador2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1137, 105, 60, 25));

        lbVulc2Queimador2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2Queimador2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2Queimador2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2Queimador2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 78, 60, 25));

        lbVulc2EsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2EsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2EsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2EsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 272, 60, 24));

        lbVulc2EsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2EsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2EsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2EsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 299, 60, 25));

        lbBanheira1BombaChillerON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaChillerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, -1));

        lbBanheira1BombaChillerOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaChillerOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, -1));

        lbBanheira1BombaTanqueON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaTanqueON, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, -1, -1));

        lbBanheira1BombaTanqueOf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaTanqueOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, -1, -1));

        lbPinturaB1Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB1Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB1Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB1Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 433, 60, 25));

        lbaBanheira1BombaChillerON.setText("jLabel2");
        jPanel1.add(lbaBanheira1BombaChillerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, -1, -1));

        lbPinturaB1Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB1Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB1Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB1Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 460, 60, 25));

        lbaBanheira1BombaTanque.setText("jLabel4");
        jPanel1.add(lbaBanheira1BombaTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, -1, -1));

        lbPinturaB2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 433, 60, 25));

        lbPinturaB2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 60, 25));

        lbPinturaB3Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB3Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB3Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB3Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 655, 60, 25));

        lbPinturaB3Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB3Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB3Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB3Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 628, 60, 25));

        lbPinturaB4Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB4Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB4Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB4Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 627, 60, 25));

        lbPinturaB4Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB4Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB4Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB4Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 655, 60, 25));

        lbIFLFrontalInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLFrontalInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLFrontalInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLFrontalInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 460, 60, 25));

        lbIFLFrontalSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLFrontalSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLFrontalSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLFrontalSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 432, 60, 25));

        lbPuller1VelocidadeSet6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 60, 25));

        lbPuller1VelocidadeInd6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 60, 25));

        lbIFLCentralSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLCentralSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLCentralSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLCentralSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 433, 60, 25));

        lbIFLCentralInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLCentralInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLCentralInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLCentralInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 60, 25));

        lbIFLTraseiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLTraseiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLTraseiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLTraseiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 460, 60, 25));

        lbIFLTraseiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLTraseiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLTraseiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLTraseiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 433, 60, 25));

        lbIFLEsteira2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLEsteira2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteira2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteira2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 655, 60, 25));

        lbIFLEsteira2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLEsteira2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteira2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteira2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 628, 60, 25));

        lbPuller1VelocidadeSet10.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet10.setText("Null");
        lbPuller1VelocidadeSet10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet10, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 708, 60, 25));

        lbPuller1VelocidadeInd10.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd10.setText("Null");
        lbPuller1VelocidadeInd10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd10, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 734, 60, 25));

        lbPuller1VelocidadeSet11.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet11.setText("Null");
        lbPuller1VelocidadeSet11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet11, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 708, 60, 25));

        lbPuller1VelocidadeInd11.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd11.setText("Null");
        lbPuller1VelocidadeInd11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd11, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 734, 60, 25));

        lbPuller1VelocidadeSet12.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet12.setText("Null");
        lbPuller1VelocidadeSet12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet12, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 708, 60, 25));

        lbPuller1VelocidadeInd12.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd12.setText("Null");
        lbPuller1VelocidadeInd12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd12, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 735, 60, 25));

        lbPuller1VelocidadeSet13.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet13.setText("Null");
        lbPuller1VelocidadeSet13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 708, 60, 25));

        lbPuller1VelocidadeInd13.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd13.setText("Null");
        lbPuller1VelocidadeInd13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 735, 60, 25));

        lbPuller1VelocidadeInd14.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd14.setText("Null");
        lbPuller1VelocidadeInd14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd14, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 735, 60, 25));

        lbPuller1VelocidadeSet14.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet14.setText("Null");
        lbPuller1VelocidadeSet14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet14, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 708, 60, 25));

        lbPuller1VelocidadeInd15.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd15.setText("Null");
        lbPuller1VelocidadeInd15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd15, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 735, 60, 25));

        lbPuller1VelocidadeSet15.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet15.setText("Null");
        lbPuller1VelocidadeSet15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet15, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 708, 60, 25));

        lbPuller1VelocidadeInd16.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd16.setText("Null");
        lbPuller1VelocidadeInd16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 735, 60, 25));

        lbPuller1VelocidadeSet16.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet16.setText("Null");
        lbPuller1VelocidadeSet16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 708, 60, 25));

        lbPuller1VelocidadeInd17.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd17.setText("Null");
        lbPuller1VelocidadeInd17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 936, 60, 25));

        lbPuller1VelocidadeSet17.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet17.setText("Null");
        lbPuller1VelocidadeSet17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 909, 60, 25));

        lbPuller1ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbPuller1ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, -1, -1));

        lbPuller1OF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbPuller1OF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, -1, -1));

        lbPuller1.setText("jLabel2");
        jPanel1.add(lbPuller1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 670, -1, -1));

        lbPerfil.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbPerfil.setForeground(new java.awt.Color(0, 255, 255));
        lbPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 10, 175, 36));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("09");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 10, 50, 37));

        lbIFLEsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLEsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 628, 60, 25));

        lbIFLEsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLEsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 655, 60, 25));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cº");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 450, 50, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("rpm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 50, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("rpm");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 60, 50, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("rpm");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 280, 50, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("rpm");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 460, 50, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("bar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 50, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("bar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 310, 50, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("bar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 90, 50, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("bar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 50, 40));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cº");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 70, 50, 40));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cº");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 100, 50, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cº");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 100, 50, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cº");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 100, 50, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("%");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 450, 50, 40));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cº");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 270, 50, 30));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cº");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 70, 50, 40));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cº");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 70, 50, 40));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cº");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 100, 50, 30));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cº");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 70, 50, 40));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cº");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 100, 50, 30));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cº");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 70, 50, 40));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cº");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 100, 50, 30));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cº");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 70, 50, 40));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("m/min");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 300, 50, 20));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("m/min");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 300, 50, 20));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("%");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 270, 50, 30));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("m/min");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 450, 50, 40));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("m/min");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 270, 50, 30));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("m/min");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 650, 50, 40));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("m/min");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 270, 50, 30));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cº");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 300, 50, 20));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("m/min");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 270, 50, 30));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("m/min");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 430, 50, 30));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("rpm");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 50, 20));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("rpm");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 650, 50, 30));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("rpm");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 450, 50, 40));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("rpm");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 430, 50, 30));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("%");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 300, 50, 20));

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("%");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 430, 50, 30));

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("%");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 460, 50, 30));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("%");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 430, 30, 30));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("%");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 458, 50, 30));

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("%");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 430, 50, 30));

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("m/min");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 290, 50, 40));

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("m/min");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1087, 630, 50, 20));

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("m/min");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1087, 650, 50, 30));

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("m/min");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 620, 50, 40));

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("rpm");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 430, 50, 30));

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("rpm");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 630, 50, 20));

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("rpm");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 650, 50, 30));

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("rpm");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 630, 50, 20));

        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 74, 51, 85));

        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 80, 20));

        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, 20));

        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 40, 30));

        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 40, 30));

        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 20));

        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 80, 20));

        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 244, 51, 83));

        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 370, 120));

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/L09.JPG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 970));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1279, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        L09ExtrusoraA t = new L09ExtrusoraA();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        L09ExtrusoraB t = new L09ExtrusoraB();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        L09ExtrusoraB t = new L09ExtrusoraB();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        L09ExtrusoraB t = new L09ExtrusoraB();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        L09ExtrusoraC t = new L09ExtrusoraC();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
        L09ExtrusoraC t = new L09ExtrusoraC();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        L09ExtrusoraC t = new L09ExtrusoraC();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        L09ExtrusoraD t = new L09ExtrusoraD();
        t.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        new L09Microondas().setVisible(true);
    }//GEN-LAST:event_jLabel76MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
start(); 
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(L09OverView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L09OverView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L09OverView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L09OverView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L09OverView().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBanheira1BombaChillerOF;
    private javax.swing.JLabel lbBanheira1BombaChillerON;
    private javax.swing.JLabel lbBanheira1BombaTanqueON;
    private javax.swing.JLabel lbBanheira1BombaTanqueOf;
    private javax.swing.JLabel lbBanheirareseRvatorioInd;
    private javax.swing.JLabel lbExtABar;
    private javax.swing.JLabel lbExtARpm;
    private javax.swing.JLabel lbExtBBar;
    private javax.swing.JLabel lbExtBRpm;
    private javax.swing.JLabel lbExtCBar;
    private javax.swing.JLabel lbExtCRpm;
    private javax.swing.JLabel lbExtDBar;
    private javax.swing.JLabel lbExtDRpm;
    private javax.swing.JLabel lbIFLCentralInd;
    private javax.swing.JLabel lbIFLCentralSet;
    private javax.swing.JLabel lbIFLEsteira2Ind;
    private javax.swing.JLabel lbIFLEsteira2Set;
    private javax.swing.JLabel lbIFLEsteiraInd;
    private javax.swing.JLabel lbIFLEsteiraSet;
    private javax.swing.JLabel lbIFLFrontalInd;
    private javax.swing.JLabel lbIFLFrontalSet;
    private javax.swing.JLabel lbIFLTraseiraInd;
    private javax.swing.JLabel lbIFLTraseiraSet;
    private javax.swing.JLabel lbMicroEsqInd;
    private javax.swing.JLabel lbMicroEsqSet;
    private javax.swing.JLabel lbMicroEsteiraInd;
    private javax.swing.JLabel lbMicroEsteiraSet;
    private javax.swing.JLabel lbMicroExaustorInd;
    private javax.swing.JLabel lbMicroExaustorSet;
    private javax.swing.JLabel lbMicroPctInd;
    private javax.swing.JLabel lbMicroPctInd1;
    private javax.swing.JLabel lbMicroPctSet;
    private javax.swing.JLabel lbMicroPctSet1;
    private javax.swing.JLabel lbMicroPctSet2;
    private javax.swing.JLabel lbMicroRefrigeradoInd;
    private javax.swing.JLabel lbMicroRefrigeradoSet;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JLabel lbPinturaB1Ind;
    private javax.swing.JLabel lbPinturaB1Set;
    private javax.swing.JLabel lbPinturaB2Ind;
    private javax.swing.JLabel lbPinturaB2Set;
    private javax.swing.JLabel lbPinturaB3Ind;
    private javax.swing.JLabel lbPinturaB3Set;
    private javax.swing.JLabel lbPinturaB4Ind;
    private javax.swing.JLabel lbPinturaB4Set;
    private javax.swing.JLabel lbPuller1;
    private javax.swing.JLabel lbPuller1OF;
    private javax.swing.JLabel lbPuller1ON;
    private javax.swing.JLabel lbPuller1VelocidadeInd;
    private javax.swing.JLabel lbPuller1VelocidadeInd10;
    private javax.swing.JLabel lbPuller1VelocidadeInd11;
    private javax.swing.JLabel lbPuller1VelocidadeInd12;
    private javax.swing.JLabel lbPuller1VelocidadeInd13;
    private javax.swing.JLabel lbPuller1VelocidadeInd14;
    private javax.swing.JLabel lbPuller1VelocidadeInd15;
    private javax.swing.JLabel lbPuller1VelocidadeInd16;
    private javax.swing.JLabel lbPuller1VelocidadeInd17;
    private javax.swing.JLabel lbPuller1VelocidadeInd6;
    private javax.swing.JLabel lbPuller1VelocidadeSet;
    private javax.swing.JLabel lbPuller1VelocidadeSet10;
    private javax.swing.JLabel lbPuller1VelocidadeSet11;
    private javax.swing.JLabel lbPuller1VelocidadeSet12;
    private javax.swing.JLabel lbPuller1VelocidadeSet13;
    private javax.swing.JLabel lbPuller1VelocidadeSet14;
    private javax.swing.JLabel lbPuller1VelocidadeSet15;
    private javax.swing.JLabel lbPuller1VelocidadeSet16;
    private javax.swing.JLabel lbPuller1VelocidadeSet17;
    private javax.swing.JLabel lbPuller1VelocidadeSet6;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVulc1EsteiraInd;
    private javax.swing.JLabel lbVulc1EsteiraSet;
    private javax.swing.JLabel lbVulc1Queimador2Ind;
    private javax.swing.JLabel lbVulc1Queimador2Set;
    private javax.swing.JLabel lbVulc1QueimadorInd;
    private javax.swing.JLabel lbVulc1QueimadorSet;
    private javax.swing.JLabel lbVulc2EsteiraInd;
    private javax.swing.JLabel lbVulc2EsteiraSet;
    private javax.swing.JLabel lbVulc2Queimador2Ind;
    private javax.swing.JLabel lbVulc2Queimador2Set;
    private javax.swing.JLabel lbVulc2QueimadorInd;
    private javax.swing.JLabel lbVulc2QueimadorSet;
    private javax.swing.JLabel lbaBanheira1BombaChillerON;
    private javax.swing.JLabel lbaBanheira1BombaTanque;
    // End of variables declaration//GEN-END:variables
}
