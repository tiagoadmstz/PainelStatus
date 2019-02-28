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
public class L01ATBOverView extends javax.swing.JFrame {

    public L01ATBOverView() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    public void start() {
        int delay = 1;
        int interval = 5000;
        Timer timer = new Timer();

        int delay1 = 1;
        int interval1 = 1000;
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
                            + "(Puller2_IndVelocidade)as puller2velocidadeind,(Puller2_SetVelocidade)as puller2velocidadeset,"
                            + "(Puller3_IndVelocidade)as puller3velocidadeind,(Puller3_SetVelocidade)as puller3velocidadeset,"
                            + "(VUlc2_IndTempControle1)as vulc2queimadorind,(Vulc2_SetTempControle1)as vulc2queimadorset,"
                            + "(Vulc2_IndTempControle2)as vulc2queimador2ind,(Vulc2_SetTempControle2)as vulc2queimador2set,"
                            + "(Vulc1_IndEsteira)as vulc2esteiraind,(Vulc1_SetEsteira)as vulc2esteiraset,"
                            + "(Banheira1_BombaPerfil_OnOff)as banheira1onof, (Banheira1_BombaTanque_OnOff)as banheira1bombatanqueonof,"
                            + "(Banheira1_IndTempChiller)as b1tempchillerind,(Banheira1_SetTempChiller)as b1tempchillerset,"
                            + "(Banheira1_IndTempReservatorio)as banheira1reservatorioind,(Banheira1_SetTempReservatorio)as b1reserset,"
                            + "(Banheira2_BombaPerfil_OnOff)as banheira2onof, (Banheira2_BombaTanque_OnOff)as banheira2bombatanqueonof,"
                            + "(Banheira2_InfTempChiller)as b2tempchillerind,(Banheira2_SetTempChiller)as b2tempchillerset,"
                            + "(Banheira2_IndTempTanque)as banheira2reservatorioind,(Banheira2_SetTempTanque)as b2reserset,"
                            + "(Banheira3_BombaPerfil_OnOff)as banheira3onof, (Banheira3_BombaTanque_OnOff)as banheira3bombatanqueonof,"
                            + "(Banheira3_IndTempChiller)as b3tempchillerind,(Banheira3_SetTempChiller)as b3tempchillerset,"
                            + "(Banheira3_IndTempTanque)as banheira3reservatorioind,(Banheira3_SetTempTanque)as b3reserset,"
                            + "(Puller1_Inversor_OnOff) as pullerinversoronof,(Puller2_Inversor_OnOff) as puller2inversoronof,(Puller3_InversorOnOff)as puller3inversoronof,"
                            + "(Pintura_B1_Set)as pinturab1set,(Pintura_B1_OnOff) as pintura1onof,"
                            + "(Pintura_B2_Set)as pinturab2set,(Pintura_B2_OnOff)as pintura2onof,"
                            + "(Pintura_B3_Set)as pinturab3set, (Pintura_B3_OnOff)as pintura3onof,"
                            + "(Pintura_B4_Set)as pinturab4set, (Pintura_B4_OnOff)as pintura4onof,"
                            + "(InfraRed_SetLampFrontal)as iflampfrontal,(InfraRed_LampFrontal_OnOff)as iflampfonof, "
                            + "(InfraRed_SetLampCentral)as iflampcentral, (InfraRed_LampCentral_OnOff)as iflampconof,"
                            + "(InfraRed_SetLampTraseira)as iflamptraseira,(InfraRed_LampTraseira_OnOff)as iflamptonof,"
                            + "(Perfil)as perfil,(InfraRed_Exaustor_OnOff)as ifexaustoronof, "
                            + "(InfraRed_IndEsteira)as ifesteiraind, (InfraRed_SetEsteira)as ifesteiraset,"
                            + "(InfraRed_Vent2)as ifventilador FROM L03 ORDER BY E3TimeStamp DESC";
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
                    String perfil = "";
                    float ifexaustoronof = 0f;
                    float ifesteiraind = 0f;
                    float ifesteiraset = 0f;
                    float b1tempchillerind = 0f;
                    float b1tempchillerset = 0f;
                    float b1reserset = 0f;
                    float banheira2onof = 0f;
                    float banheira2bombatanqueonof = 0f;
                    float b2tempchillerind = 0f;
                    float b2tempchillerset = 0f;
                    float banheira2reservatorioind = 0f;
                    float b2reserset = 0f;
                    float banheira3onof = 0f;
                    float banheira3bombatanqueonof = 0f;
                    float b3tempchillerind = 0f;
                    float b3tempchillerset = 0f;
                    float banheira3reservatorioind = 0f;
                    float b3reserset = 0f;
                    float puller2velocidadeset = 0f;
                    float puller2inversoronof = 0f;
                    float puller3velocidadeset = 0f;
                    float puller3inversoronof = 0f;
                    float ifventilador = 0f;
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
                        perfil = rs.getString("perfil");
                        ifexaustoronof = rs.getFloat("ifexaustoronof");
                        ifesteiraind = rs.getFloat("ifesteiraind");
                        ifesteiraset = rs.getFloat("ifesteiraset");
                        b1tempchillerind = rs.getFloat("b1tempchillerind");
                        b1tempchillerset = rs.getFloat("b1tempchillerset");
                        b1reserset = rs.getFloat("b1reserset");
                        banheira2onof = rs.getFloat("banheira2onof");
                        banheira2bombatanqueonof = rs.getFloat("banheira2bombatanqueonof");
                        b2tempchillerind = rs.getFloat("b2tempchillerind");
                        b2tempchillerset = rs.getFloat("b2tempchillerset");
                        banheira2reservatorioind = rs.getFloat("banheira2reservatorioind");
                        b2reserset = rs.getFloat("b2reserset");
                        banheira3onof = rs.getFloat("banheira3onof");
                        banheira3bombatanqueonof = rs.getFloat("banheira3bombatanqueonof");
                        b3tempchillerind = rs.getFloat("b3tempchillerind");
                        b3tempchillerset = rs.getFloat("b3tempchillerset");
                        banheira3reservatorioind = rs.getFloat("banheira3reservatorioind");
                        b3reserset = rs.getFloat("b3reserset");
                        puller2velocidadeset = rs.getFloat("puller2velocidadeset");
                        puller2inversoronof = rs.getFloat("puller2inversoronof");
                        puller3velocidadeset = rs.getFloat("puller3velocidadeset");
                        puller3inversoronof = rs.getFloat("puller3inversoronof");
                        ifventilador = rs.getFloat("ifventilador");
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
                    lbPerfil.setText(perfil);
                    lbExaustor.setText(String.valueOf(ifexaustoronof));
                    lbIFLEsteiraInd.setText(String.valueOf(ifesteiraind));
                    lbIFLEsteiraSet.setText(String.valueOf(ifesteiraset));
                    lbMicroPctInd1.setText(String.valueOf(b1tempchillerind));
                    lbMicroPctSet1.setText(String.valueOf(b1tempchillerset));
                    lbBanheirareseRvatorioSet.setText(String.valueOf(b1reserset));
                    lbB2ChillerInd.setText(String.valueOf(b2tempchillerind));
                    lbB2ChillerSet.setText(String.valueOf(b2tempchillerset));
                    lbB2TanqueSet.setText(String.valueOf(b2reserset));
                    lbB2TanqueInd.setText(String.valueOf(banheira2reservatorioind));
                    lbaBanheira2BombaChiller.setText(String.valueOf(banheira2onof));
                    lbaBanheira2BombaTanque.setText(String.valueOf(banheira2bombatanqueonof));
                    lbB3ChillerInd.setText(String.valueOf(b3tempchillerind));
                    lbB3ChillerSet.setText(String.valueOf(b3tempchillerset));
                    lbB3TanqueSet.setText(String.valueOf(b3reserset));
                    lbB3TanqueInd.setText(String.valueOf(banheira3reservatorioind));
                    lbaBanheira3BombaChiller.setText(String.valueOf(banheira3onof));
                    lbaBanheira3BombaTanque.setText(String.valueOf(banheira3bombatanqueonof));
                    lbPuller2VelocidadeSet.setText(String.valueOf(puller2velocidadeset));
                    lbPuller2.setText(String.valueOf(puller2inversoronof));
                    lbPuller3VelocidadeSet.setText(String.valueOf(puller3velocidadeset));
                    lbPuller3.setText(String.valueOf(puller3inversoronof));
                    lbVentilador.setText(String.valueOf(ifventilador));
//////////////////////////////////////////////////////////////////////////////////////////////////////////
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

                    //Banheira 2
                    lbaBanheira2BombaChiller.setVisible(false);
                    if (!lbaBanheira2BombaChiller.getText().equals("0.0")) {
                        lbBanheira2BombaChillerON.setVisible(true);
                        lbBanheira2BombaChillerOF.setVisible(false);
                    } else {
                        lbBanheira2BombaChillerOF.setVisible(true);
                        lbBanheira2BombaChillerON.setVisible(false);
                    }
                    //Banheira 2
                    lbaBanheira2BombaTanque.setVisible(false);
                    if (!lbaBanheira2BombaTanque.getText().equals("0.0")) {
                        lbBanheira2BombaTanqueON.setVisible(true);
                        lbBanheira2BombaTanqueOf.setVisible(false);
                    } else {
                        lbBanheira2BombaTanqueOf.setVisible(true);
                        lbBanheira2BombaTanqueON.setVisible(false);
                    }

                    //Banheira 3
                    lbaBanheira3BombaChiller.setVisible(false);
                    if (!lbaBanheira3BombaChiller.getText().equals("0.0")) {
                        lbBanheira3BombaChillerON1.setVisible(true);
                        lbBanheira3BombaChillerOF1.setVisible(false);
                    } else {
                        lbBanheira3BombaChillerOF1.setVisible(true);
                        lbBanheira3BombaChillerON1.setVisible(false);
                    }
                    //Banheira 3
                    lbaBanheira3BombaTanque.setVisible(false);
                    if (!lbaBanheira3BombaTanque.getText().equals("0.0")) {
                        lbBanheira3BombaTanqueON1.setVisible(true);
                        lbBanheira3BombaTanqueOf1.setVisible(false);
                    } else {
                        lbBanheira3BombaTanqueOf1.setVisible(true);
                        lbBanheira3BombaTanqueON1.setVisible(false);
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

                    //Puller2
                    lbPuller2.setVisible(false);
                    if (!lbPuller2.getText().equals("0.0")) {
                        lbPuller2ON.setVisible(true);
                        lbPuller2OF.setVisible(false);
                    } else {
                        lbPuller2OF.setVisible(true);
                        lbPuller2ON.setVisible(false);
                    }

                    //Puller3
                    lbPuller3.setVisible(false);
                    if (!lbPuller3.getText().equals("0.0")) {
                        lbPuller3ON.setVisible(true);
                        lbPuller3OF.setVisible(false);
                    } else {
                        lbPuller3OF.setVisible(true);
                        lbPuller3ON.setVisible(false);
                    }

                    //Exaustor
                    lbExaustor.setVisible(false);
                    if (!lbExaustor.getText().equals("0.0")) {
                        lbExaustorON.setVisible(true);
                        lbExaustorOF.setVisible(false);
                    } else {
                        lbExaustorOF.setVisible(true);
                        lbExaustorON.setVisible(false);
                    }
                    //IFVentilador
                    lbVentilador.setVisible(false);
                    if (!lbVentilador.getText().equals("0.0")) {
                        lbVentiladorON.setVisible(true);
                        lbVentiladorOF.setVisible(false);
                    } else {
                        lbVentiladorOF.setVisible(true);
                        lbVentiladorON.setVisible(false);
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
                    String query1 = "SELECT TOP 1 (ExtA_Rotacao)as extarpm,(ExtB_Rotacao)as extbrpm,(ExtC_Rotacao)as extcrpm,(ExtD_Rotacao)as extdrpm,"
                            + "(ExtA_Pressao)as extabar,(ExtB_Pressao)as extbbar,(ExtC_Pressao)as extcbar,(ExtD_Pressao)as extdbar,"
                            + "(Puller1_Velocidade)as puller1velocidadeind,(Puller2_Velocidade)as puller2velocidadeind,(Puller3_Velocidade)as puller3velocidadeind"
                            + " FROM L03_Criticos ORDER BY E3TimeStamp DESC";
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
                    float puller2velocidadeind = 0f;
                    float puller3velocidadeind = 0f;

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
                        puller2velocidadeind = rs.getFloat("puller2velocidadeind");
                        puller3velocidadeind = rs.getFloat("puller3velocidadeind");

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
                    lbPuller2VelocidadeInd.setText(String.valueOf(puller2velocidadeind));
                    lbPuller3VelocidadeInd.setText(String.valueOf(puller3velocidadeind));
//                    piscalabel();

                } catch (Exception e) {
//                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }, delay1, interval1);
    }

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
        lbBanheirareseRvatorioSet = new javax.swing.JLabel();
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
        lbB2ChillerSet = new javax.swing.JLabel();
        lbB2ChillerInd = new javax.swing.JLabel();
        lbB2TanqueSet = new javax.swing.JLabel();
        lbB2TanqueInd = new javax.swing.JLabel();
        lbB3ChillerSet = new javax.swing.JLabel();
        lbB3ChillerInd = new javax.swing.JLabel();
        lbB3TanqueSet = new javax.swing.JLabel();
        lbB3TanqueInd = new javax.swing.JLabel();
        lbPuller2VelocidadeInd = new javax.swing.JLabel();
        lbPuller2VelocidadeSet = new javax.swing.JLabel();
        lbPuller3VelocidadeInd = new javax.swing.JLabel();
        lbPuller3VelocidadeSet = new javax.swing.JLabel();
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
        lbExaustorON = new javax.swing.JLabel();
        lbExaustorOF = new javax.swing.JLabel();
        lbExaustor = new javax.swing.JLabel();
        lbaBanheira2BombaChiller = new javax.swing.JLabel();
        lbBanheira2BombaChillerON = new javax.swing.JLabel();
        lbBanheira2BombaChillerOF = new javax.swing.JLabel();
        lbaBanheira2BombaTanque = new javax.swing.JLabel();
        lbBanheira2BombaTanqueON = new javax.swing.JLabel();
        lbBanheira2BombaTanqueOf = new javax.swing.JLabel();
        lbBanheira3BombaChillerON1 = new javax.swing.JLabel();
        lbBanheira3BombaChillerOF1 = new javax.swing.JLabel();
        lbaBanheira3BombaChiller = new javax.swing.JLabel();
        lbBanheira3BombaTanqueON1 = new javax.swing.JLabel();
        lbBanheira3BombaTanqueOf1 = new javax.swing.JLabel();
        lbaBanheira3BombaTanque = new javax.swing.JLabel();
        lbPuller2ON = new javax.swing.JLabel();
        lbPuller2OF = new javax.swing.JLabel();
        lbPuller2 = new javax.swing.JLabel();
        lbPuller3ON = new javax.swing.JLabel();
        lbPuller3OF = new javax.swing.JLabel();
        lbPuller3 = new javax.swing.JLabel();
        lbVentiladorON = new javax.swing.JLabel();
        lbVentiladorOF = new javax.swing.JLabel();
        lbVentilador = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
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

        lbBanheirareseRvatorioSet.setForeground(new java.awt.Color(255, 255, 153));
        lbBanheirareseRvatorioSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanheirareseRvatorioSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbBanheirareseRvatorioSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 432, 60, 25));

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

        lbB2ChillerSet.setForeground(new java.awt.Color(255, 255, 153));
        lbB2ChillerSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB2ChillerSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB2ChillerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 708, 60, 25));

        lbB2ChillerInd.setForeground(new java.awt.Color(0, 255, 255));
        lbB2ChillerInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB2ChillerInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB2ChillerInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 734, 60, 25));

        lbB2TanqueSet.setForeground(new java.awt.Color(255, 255, 153));
        lbB2TanqueSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB2TanqueSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB2TanqueSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 708, 60, 25));

        lbB2TanqueInd.setForeground(new java.awt.Color(0, 255, 255));
        lbB2TanqueInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB2TanqueInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB2TanqueInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 734, 60, 25));

        lbB3ChillerSet.setForeground(new java.awt.Color(255, 255, 153));
        lbB3ChillerSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB3ChillerSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB3ChillerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 708, 60, 25));

        lbB3ChillerInd.setForeground(new java.awt.Color(0, 255, 255));
        lbB3ChillerInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB3ChillerInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB3ChillerInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 735, 60, 25));

        lbB3TanqueSet.setForeground(new java.awt.Color(255, 255, 153));
        lbB3TanqueSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB3TanqueSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB3TanqueSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 708, 60, 25));

        lbB3TanqueInd.setForeground(new java.awt.Color(0, 255, 255));
        lbB3TanqueInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB3TanqueInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB3TanqueInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 735, 60, 25));

        lbPuller2VelocidadeInd.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller2VelocidadeInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller2VelocidadeInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller2VelocidadeInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 735, 60, 25));

        lbPuller2VelocidadeSet.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller2VelocidadeSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller2VelocidadeSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller2VelocidadeSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 708, 60, 25));

        lbPuller3VelocidadeInd.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller3VelocidadeInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller3VelocidadeInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller3VelocidadeInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 735, 60, 25));

        lbPuller3VelocidadeSet.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller3VelocidadeSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller3VelocidadeSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller3VelocidadeSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 708, 60, 25));

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
        lbTitulo.setText("01");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 10, 50, 37));

        lbIFLEsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLEsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 629, 60, 25));

        lbIFLEsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLEsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 655, 60, 25));

        lbExaustorON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbExaustorON, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 630, -1, -1));

        lbExaustorOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbExaustorOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 630, -1, -1));

        lbExaustor.setText("jLabel2");
        jPanel1.add(lbExaustor, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, -1, -1));

        lbaBanheira2BombaChiller.setText("jLabel2");
        jPanel1.add(lbaBanheira2BombaChiller, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 950, -1, -1));

        lbBanheira2BombaChillerON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira2BombaChillerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 910, -1, -1));

        lbBanheira2BombaChillerOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira2BombaChillerOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 910, -1, -1));

        lbaBanheira2BombaTanque.setText("jLabel4");
        jPanel1.add(lbaBanheira2BombaTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 950, -1, -1));

        lbBanheira2BombaTanqueON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira2BombaTanqueON, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 910, -1, -1));

        lbBanheira2BombaTanqueOf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira2BombaTanqueOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 910, -1, -1));

        lbBanheira3BombaChillerON1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira3BombaChillerON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 910, -1, -1));

        lbBanheira3BombaChillerOF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira3BombaChillerOF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 910, -1, -1));

        lbaBanheira3BombaChiller.setText("jLabel2");
        jPanel1.add(lbaBanheira3BombaChiller, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 950, -1, -1));

        lbBanheira3BombaTanqueON1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira3BombaTanqueON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 910, -1, -1));

        lbBanheira3BombaTanqueOf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira3BombaTanqueOf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 910, -1, -1));

        lbaBanheira3BombaTanque.setText("jLabel4");
        jPanel1.add(lbaBanheira3BombaTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 950, -1, -1));

        lbPuller2ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbPuller2ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 910, -1, -1));

        lbPuller2OF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbPuller2OF, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 910, -1, -1));

        lbPuller2.setText("jLabel2");
        jPanel1.add(lbPuller2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 950, -1, -1));

        lbPuller3ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbPuller3ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 910, -1, -1));

        lbPuller3OF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbPuller3OF, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 910, -1, -1));

        lbPuller3.setText("jLabel2");
        jPanel1.add(lbPuller3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 950, -1, -1));

        lbVentiladorON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbVentiladorON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 630, -1, -1));

        lbVentiladorOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbVentiladorOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 630, -1, -1));

        lbVentilador.setText("jLabel2");
        jPanel1.add(lbVentilador, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 670, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("rpm");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 70, -1, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("bar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 90, -1, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("rpm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 24, -1, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("bar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("rpm");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 280, -1, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("bar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 310, -1, 20));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("rpm");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("bar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("m/min");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 300, -1, 20));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("m/min");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 270, -1, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cº");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 110, -1, 20));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("%");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 270, -1, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cº");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 80, -1, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("%");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 300, -1, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cº");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 300, 20, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cº");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 270, 20, 30));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cº");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 110, -1, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cº");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 80, -1, 20));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("m/min");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 270, -1, 20));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("m/min");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 300, -1, 20));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Cº");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 110, -1, 20));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cº");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 80, -1, 20));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Cº");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 110, -1, 20));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Cº");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 80, -1, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cº");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 110, -1, 20));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cº");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 80, -1, 20));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cº");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 80, -1, 20));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cº");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 110, -1, 20));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("m/min");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 270, 40, 30));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("m/min");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 300, 40, 20));

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("%");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 430, -1, 30));

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("%");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 460, -1, 20));

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("m/min");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 630, -1, 20));

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("m/min");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 650, -1, 30));

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("m/min");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 740, -1, 20));

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("m/min");
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 710, -1, 20));

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("%");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 460, -1, 20));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("%");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 430, -1, 30));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("%");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 430, -1, 30));

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("%");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 460, -1, 20));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("rpm");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 460, -1, 20));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("rpm");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 430, -1, 20));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("rpm");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 430, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("rpm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 460, -1, 20));

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("rpm");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 630, -1, 20));

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("rpm");
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 650, -1, 30));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("rpm");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 660, -1, 20));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("rpm");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 630, -1, 20));

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("m/min");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 710, -1, 20));

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("m/min");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 740, -1, 20));

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Cº");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 740, -1, 20));

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Cº");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 710, -1, 20));

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Cº");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 710, -1, 20));

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Cº");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 740, -1, 20));

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Cº");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 740, -1, 20));

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Cº");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 710, -1, 20));

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Cº");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 710, -1, 20));

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Cº");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 740, -1, 20));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("m/min");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 460, -1, 20));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("m/min");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 430, -1, 20));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Cº");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 430, -1, 30));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cº");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 460, -1, 20));

        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 370, 120));

        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 40, 30));

        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, 20));

        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 80, 20));

        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 74, 51, 85));

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

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/L01ATB.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

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

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        new L11Microondas().setVisible(true);
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        L01ATBExtrusoraB t = new L01ATBExtrusoraB();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        L01ATBExtrusoraB t = new L01ATBExtrusoraB();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        L01ATBExtrusoraB t = new L01ATBExtrusoraB();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        L01ATBExtrusoraA t = new L01ATBExtrusoraA();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        L01ATBExtrusoraC t = new L01ATBExtrusoraC();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
        L01ATBExtrusoraC t = new L01ATBExtrusoraC();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        L01ATBExtrusoraC t = new L01ATBExtrusoraC();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        L01ATBExtrusoraD t = new L01ATBExtrusoraD();
        t.setVisible(true);
    }//GEN-LAST:event_jLabel72MouseClicked

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
            java.util.logging.Logger.getLogger(L01ATBOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L01ATBOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L01ATBOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L01ATBOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L01ATBOverView().setVisible(true);
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
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
    private javax.swing.JLabel lbB2ChillerInd;
    private javax.swing.JLabel lbB2ChillerSet;
    private javax.swing.JLabel lbB2TanqueInd;
    private javax.swing.JLabel lbB2TanqueSet;
    private javax.swing.JLabel lbB3ChillerInd;
    private javax.swing.JLabel lbB3ChillerSet;
    private javax.swing.JLabel lbB3TanqueInd;
    private javax.swing.JLabel lbB3TanqueSet;
    private javax.swing.JLabel lbBanheira1BombaChillerOF;
    private javax.swing.JLabel lbBanheira1BombaChillerON;
    private javax.swing.JLabel lbBanheira1BombaTanqueON;
    private javax.swing.JLabel lbBanheira1BombaTanqueOf;
    private javax.swing.JLabel lbBanheira2BombaChillerOF;
    private javax.swing.JLabel lbBanheira2BombaChillerON;
    private javax.swing.JLabel lbBanheira2BombaTanqueON;
    private javax.swing.JLabel lbBanheira2BombaTanqueOf;
    private javax.swing.JLabel lbBanheira3BombaChillerOF1;
    private javax.swing.JLabel lbBanheira3BombaChillerON1;
    private javax.swing.JLabel lbBanheira3BombaTanqueON1;
    private javax.swing.JLabel lbBanheira3BombaTanqueOf1;
    private javax.swing.JLabel lbBanheirareseRvatorioInd;
    private javax.swing.JLabel lbBanheirareseRvatorioSet;
    private javax.swing.JLabel lbExaustor;
    private javax.swing.JLabel lbExaustorOF;
    private javax.swing.JLabel lbExaustorON;
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
    private javax.swing.JLabel lbPuller1VelocidadeInd16;
    private javax.swing.JLabel lbPuller1VelocidadeInd17;
    private javax.swing.JLabel lbPuller1VelocidadeInd6;
    private javax.swing.JLabel lbPuller1VelocidadeSet;
    private javax.swing.JLabel lbPuller1VelocidadeSet16;
    private javax.swing.JLabel lbPuller1VelocidadeSet17;
    private javax.swing.JLabel lbPuller1VelocidadeSet6;
    private javax.swing.JLabel lbPuller2;
    private javax.swing.JLabel lbPuller2OF;
    private javax.swing.JLabel lbPuller2ON;
    private javax.swing.JLabel lbPuller2VelocidadeInd;
    private javax.swing.JLabel lbPuller2VelocidadeSet;
    private javax.swing.JLabel lbPuller3;
    private javax.swing.JLabel lbPuller3OF;
    private javax.swing.JLabel lbPuller3ON;
    private javax.swing.JLabel lbPuller3VelocidadeInd;
    private javax.swing.JLabel lbPuller3VelocidadeSet;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVentilador;
    private javax.swing.JLabel lbVentiladorOF;
    private javax.swing.JLabel lbVentiladorON;
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
    private javax.swing.JLabel lbaBanheira2BombaChiller;
    private javax.swing.JLabel lbaBanheira2BombaTanque;
    private javax.swing.JLabel lbaBanheira3BombaChiller;
    private javax.swing.JLabel lbaBanheira3BombaTanque;
    // End of variables declaration//GEN-END:variables
}
