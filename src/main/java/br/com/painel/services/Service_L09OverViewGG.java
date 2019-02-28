/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.services;

import br.com.painel.frames.status.L09ExtrusoraA;
import br.com.painel.frames.status.L09ExtrusoraB;
import br.com.painel.frames.status.L09ExtrusoraC;
import br.com.painel.frames.status.L09ExtrusoraD;
import br.com.painel.frames.status.L09Microondas;
import br.com.painel.framesGG.L09OverViewGG;
import br.com.painel.interfaces.Service;

/**
 *
 * @author Tiago
 */
public class Service_L09OverViewGG extends Service<L09OverViewGG> {

    public Service_L09OverViewGG(L09OverViewGG form) {
        super(form);
    }

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {
        L09ExtrusoraA t = new L09ExtrusoraA();
        t.setVisible(true);
    }

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {
        L09ExtrusoraB t = new L09ExtrusoraB();
        t.setVisible(true);
    }

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {
        L09ExtrusoraB t = new L09ExtrusoraB();
        t.setVisible(true);
    }

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {
        L09ExtrusoraB t = new L09ExtrusoraB();
        t.setVisible(true);
    }

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {
        L09ExtrusoraC t = new L09ExtrusoraC();
        t.setVisible(true);
    }

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {
        L09ExtrusoraC t = new L09ExtrusoraC();
        t.setVisible(true);
    }

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {
        L09ExtrusoraC t = new L09ExtrusoraC();
        t.setVisible(true);
    }

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {
        L09ExtrusoraD t = new L09ExtrusoraD();
        t.setVisible(true);     // TODO add your handling code here:
    }

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {
        new L09Microondas().setVisible(true);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        start();
    }

    public void start() {
        /*int delay = 1;   // delay de 5 seg.
        int interval = 5000;  // intervalo de 1 seg.
        Timer timer = new Timer();
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
        
        int delay1 = 1;   // delay de 5 seg.
        int interval1 = 1000;  // intervalo de 1 seg.
        Timer timer1 = new Timer();
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
        
        }, delay1, interval1);*/
    }

}
