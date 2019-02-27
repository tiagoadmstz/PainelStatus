/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.services;

import br.com.painel.entities.L03;
import br.com.painel.entities.L03_Criticos;
import br.com.painel.framesGG.L01ATBOverViewGG;
import br.com.painel.util.FrameUtil;
import br.com.painel.util.SQLUtil;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author tiago.teixeira
 */
public class Service_L01ATBOverViewGG {

    private final L01ATBOverViewGG form;

    public Service_L01ATBOverViewGG(L01ATBOverViewGG form) {
        this.form = form;
    }

    /**
     * Pega os valores do formulário e seta dentro de um objeto utilizando a
     * anotação MapFrame como referência.
     *
     * @param form L01ATBOverViewGG formulário
     * @param target L03 ou L03_Critico
     */
    private void getDados(L01ATBOverViewGG form, Object target) {
        FrameUtil.get(form, target);
    }

    /**
     * Pega os dados de um objeto e seta dentro dos campos do formulário
     * utilizando a anotação MapFrame como referência.
     *
     * @param form L01ATBOverViewGG formulário
     * @param target L03 ou L03_Critico
     */
    private void setDados(L01ATBOverViewGG form, Object target) {
        FrameUtil.set(form, target);
    }

    /**
     * Método que da start no processo de monitoramento das variáveis para L03.
     *
     * @return Thread com o processo de monitoramento
     */
    public synchronized Thread L03() {
        //int delay = 1;
        //int interval = 5000;
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        L03 l03 = new L03();
                        l03.setValuesByResultSet(SQLUtil.getResultSet("L03"));
                        //l03.printValues();
                        setDados(form, l03);
                        toogleOnOffFields(form.getOnOffFields());
                        Thread.sleep(5000l);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * Método que da start no processo de monitoramento das variáveis para L03_Critico.
     *
     * @return Thread com o processo de monitoramento
     */
    public synchronized Thread L03_Criticos() {
        //int delay1 = 1;
        //int interval1 = 1000;
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        L03_Criticos l03_criticos = new L03_Criticos();
                        l03_criticos.setValuesByResultSet(SQLUtil.getResultSet("L03_Criticos"));
                        //l03_criticos.printValues();
                        setDados(form, l03_criticos);
                        Thread.sleep(1000l);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public MouseAdapter getMouseListener() {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                FrameUtil.openFrame(((JLabel) event.getSource()).getName());
            }
        };
    }

    private void toogleOnOffFields(JLabel[][] labels) {
        for (JLabel[] lbs : labels) {
            lbs[0].setVisible(false);
            if (lbs[0].getText().equals("0.0")) {
                toogleOnOffFields(lbs);
            } else {
                toogleOnOffFields(lbs);
            }
        }
    }

    private void toogleOnOffFields(JComponent[] components) {
        if (components.length > 2) {
            FrameUtil.toogleVisible(components[1], components[2]);
        } else {
            FrameUtil.toogleVisible(components);
        }
    }

    public void startOut() {
        /*int delay = 1;
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
        }*/
    }

}
