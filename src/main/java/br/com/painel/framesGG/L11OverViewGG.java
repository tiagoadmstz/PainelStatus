/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.framesGG;

import br.com.painel.annotations.MapFrame;
import br.com.painel.entities.L11;
import br.com.painel.entities.L11_Alarmes;
import br.com.painel.entities.L11_Criticos;
import br.com.painel.interfaces.ManipulaFrame;
import br.com.painel.listener.Listener_L11OverViewGG;
import javax.swing.JLabel;

/**
 *
 * @author rsouza10
 */
public final class L11OverViewGG extends ManipulaFrame {

    private static final long serialVersionUID = -5501983840111641590L;
    private final Listener_L11OverViewGG listener;

    /**
     * Creates new form L09OuverView
     */
    public L11OverViewGG() {
        maximize();
        initComponents();
        listener = new Listener_L11OverViewGG(this);
    }

    @Override
    public JLabel[][] getOnOffFields() {
        return new JLabel[][]{
            {lbaBanheira1BombaChillerON, lbBanheira1BombaChillerOF},
            {lbaBanheira1BombaTanque, lbBanheira1BombaTanqueON, lbBanheira1BombaTanqueOf},
            {lbaBanheira2BombaChiller, lbBanheira2BombaChillerON, lbBanheira2BombaChillerOF},
            {lbaBanheira2BombaTanque, lbBanheira2BombaTanqueON, lbBanheira2BombaTanqueOf},
            {lbaBanheira3BombaChiller, lbBanheira3BombaChillerON1, lbBanheira3BombaChillerOF1},
            {lbaBanheira3BombaTanque, lbBanheira3BombaTanqueON1, lbBanheira3BombaTanqueOf1},
            {lbPuller, lbPuller1ON, lbPuller1OF},
            {lbPuller2, lbPuller2ON, lbPuller2OF},
            {lbPuller3, lbPuller3ON, lbPuller3OF},
            {lbExaustor, lbExaustorON, lbExaustorOF},
            {lbVentilador, lbVentiladorON, lbVentiladorOF}
        };
    }

    public JLabel[] getPiscaAlertaLabels() {
        return new JLabel[]{lbExtA, lbExtB, lbExtC, lbExtD,
            lbMicroondas, lbHotAir1, lbHotAir2, lbBanheira1, lbPuller1, lbPintura,
            lbIR, lbBanheira2, lbBanheira3, lbPulleralarm2, lbPulleralarm3, lbCortadeira};
    }

    @MapFrame(get = "getMultPintura1", target = L11.class, type = String.class)
    public JLabel getLbPinturaB1Ind() {
        return lbPinturaB1Ind;
    }

    @MapFrame(get = "getMultPintura2", target = L11.class, type = String.class)
    public JLabel getLbPinturaB2Ind() {
        return lbPinturaB2Ind;
    }

    @MapFrame(get = "getMultPintura3", target = L11.class, type = String.class)
    public JLabel getLbPinturaB3Ind() {
        return lbPinturaB3Ind;
    }

    @MapFrame(get = "getMultPintura4", target = L11.class, type = String.class)
    public JLabel getLbPinturaB4Ind() {
        return lbPinturaB4Ind;
    }

    @MapFrame(get = "getMultIFLFrontal", target = L11.class, type = String.class)
    public JLabel getLbIFLFrontalInd() {
        return lbIFLFrontalInd;
    }

    @MapFrame(get = "getMultIFLCentral", target = L11.class, type = String.class)
    public JLabel getLbIFLCentralInd() {
        return lbIFLCentralInd;
    }

    @MapFrame(get = "getMultIFLTraseira", target = L11.class, type = String.class)
    public JLabel getLbIFLTraseiraInd() {
        return lbIFLTraseiraInd;
    }

    @MapFrame(field = "micropctind", target = L11.class, type = String.class)
    public JLabel getLbMicroPctInd() {
        return lbMicroPctInd;
    }

    @MapFrame(field = "micropctset", target = L11.class, type = String.class)
    public JLabel getLbMicroPctSet() {
        return lbMicroPctSet;
    }

    @MapFrame(field = "microesqind", target = L11.class, type = String.class)
    public JLabel getLbMicroEsqInd() {
        return lbMicroEsqInd;
    }

    @MapFrame(field = "microesqset", target = L11.class, type = String.class)
    public JLabel getLbMicroEsqSet() {
        return lbMicroEsqSet;
    }

    @MapFrame(field = "microesteiraind", target = L11.class, type = String.class)
    public JLabel getLbMicroEsteiraInd() {
        return lbMicroEsteiraInd;
    }

    @MapFrame(field = "microesteiraset", target = L11.class, type = String.class)
    public JLabel getLbMicroEsteiraSet() {
        return lbMicroEsteiraSet;
    }

    @MapFrame(field = "microexaustorind", target = L11.class, type = String.class)
    public JLabel getLbMicroExaustorInd() {
        return lbMicroExaustorInd;
    }

    @MapFrame(field = "microexaustorset", target = L11.class, type = String.class)
    public JLabel getLbMicroExaustorSet() {
        return lbMicroExaustorSet;
    }

    @MapFrame(field = "microrefrigeradoind", target = L11.class, type = String.class)
    public JLabel getLbMicroRefrigeradoInd() {
        return lbMicroRefrigeradoInd;
    }

    @MapFrame(field = "microrefrigeradoset", target = L11.class, type = String.class)
    public JLabel getLbMicroRefrigeradoSet() {
        return lbMicroRefrigeradoSet;
    }

    @MapFrame(field = "vulc1queimadorind", target = L11.class, type = String.class)
    public JLabel getLbVulc1QueimadorInd() {
        return lbVulc1QueimadorInd;
    }

    @MapFrame(field = "vulc1queimadorset", target = L11.class, type = String.class)
    public JLabel getLbVulc1QueimadorSet() {
        return lbVulc1QueimadorSet;
    }

    @MapFrame(field = "vulc1queimador2ind", target = L11.class, type = String.class)
    public JLabel getLbVulc1Queimador2Ind() {
        return lbVulc1Queimador2Ind;
    }

    @MapFrame(field = "vulc1queimador2set", target = L11.class, type = String.class)
    public JLabel getLbVulc1Queimador2Set() {
        return lbVulc1Queimador2Set;
    }

    @MapFrame(field = "vulc1esteiraind", target = L11.class, type = String.class)
    public JLabel getLbVulc1EsteiraInd() {
        return lbVulc1EsteiraInd;
    }

    @MapFrame(field = "vulc1esteiraset", target = L11.class, type = String.class)
    public JLabel getLbVulc1EsteiraSet() {
        return lbVulc1EsteiraSet;
    }

    @MapFrame(field = "puller1velocidadeset", target = L11.class, type = String.class)
    public JLabel getLbPuller1VelocidadeSet() {
        return lbPuller1VelocidadeSet;
    }

    @MapFrame(field = "vulc2queimadorind", target = L11.class, type = String.class)
    public JLabel getLbVulc2QueimadorInd() {
        return lbVulc2QueimadorInd;
    }

    @MapFrame(field = "vulc2queimadorset", target = L11.class, type = String.class)
    public JLabel getLbVulc2QueimadorSet() {
        return lbVulc2QueimadorSet;
    }

    @MapFrame(field = "vulc2queimador2ind", target = L11.class, type = String.class)
    public JLabel getLbVulc2Queimador2Ind() {
        return lbVulc2Queimador2Ind;
    }

    @MapFrame(field = "vulc2queimador2set", target = L11.class, type = String.class)
    public JLabel getLbVulc2Queimador2Set() {
        return lbVulc2Queimador2Set;
    }

    @MapFrame(field = "vulc2esteiraind", target = L11.class, type = String.class)
    public JLabel getLbVulc2EsteiraInd() {
        return lbVulc2EsteiraInd;
    }

    @MapFrame(field = "vulc2esteiraset", target = L11.class, type = String.class)
    public JLabel getLbVulc2EsteiraSet() {
        return lbVulc2EsteiraSet;
    }

    @MapFrame(field = "banheira1reservatorioind", target = L11.class, type = String.class)
    public JLabel getLbBanheirareseRvatorioInd() {
        return lbBanheirareseRvatorioInd;
    }

    @MapFrame(field = "banheira1onof", target = L11.class, type = String.class)
    public JLabel getLbaBanheira1BombaChillerON() {
        return lbaBanheira1BombaChillerON;
    }

    @MapFrame(field = "banheira1bombatanqueonof", target = L11.class, type = String.class)
    public JLabel getLbaBanheira1BombaTanque() {
        return lbaBanheira1BombaTanque;
    }

    @MapFrame(field = "pullerinversoronof", target = L11.class, type = String.class)
    public JLabel getLbPuller() {
        return lbPuller;
    }

    @MapFrame(field = "pinturab1set", target = L11.class, type = String.class)
    public JLabel getLbPinturaB1Set() {
        return lbPinturaB1Set;
    }

    @MapFrame(field = "pinturab2set", target = L11.class, type = String.class)
    public JLabel getLbPinturaB2Set() {
        return lbPinturaB2Set;
    }

    @MapFrame(field = "pinturab3set", target = L11.class, type = String.class)
    public JLabel getLbPinturaB3Set() {
        return lbPinturaB3Set;
    }

    @MapFrame(field = "pinturab4set", target = L11.class, type = String.class)
    public JLabel getLbPinturaB4Set() {
        return lbPinturaB4Set;
    }

    @MapFrame(field = "iflampfrontal", target = L11.class, type = String.class)
    public JLabel getLbIFLFrontalSet() {
        return lbIFLFrontalSet;
    }

    @MapFrame(field = "iflampcentral", target = L11.class, type = String.class)
    public JLabel getLbIFLCentralSet() {
        return lbIFLCentralSet;
    }

    @MapFrame(field = "iflamptraseira", target = L11.class, type = String.class)
    public JLabel getLbIFLTraseiraSet() {
        return lbIFLTraseiraSet;
    }

    @MapFrame(field = "perfil", target = L11.class, type = String.class)
    public JLabel getLbPerfil() {
        return lbPerfil;
    }

    @MapFrame(field = "ifexaustoronof", target = L11.class, type = String.class)
    public JLabel getLbExaustor() {
        return lbExaustor;
    }

    @MapFrame(field = "ifesteiraind", target = L11.class, type = String.class)
    public JLabel getLbIFLEsteiraInd() {
        return lbIFLEsteiraInd;
    }

    @MapFrame(field = "ifesteiraset", target = L11.class, type = String.class)
    public JLabel getLbIFLEsteiraSet() {
        return lbIFLEsteiraSet;
    }

    @MapFrame(field = "b1tempchillerind", target = L11.class, type = String.class)
    public JLabel getLbMicroPctInd1() {
        return lbMicroPctInd1;
    }

    @MapFrame(field = "b1tempchillerset", target = L11.class, type = String.class)
    public JLabel getLbMicroPctSet1() {
        return lbMicroPctSet1;
    }

    @MapFrame(field = "b1reserset", target = L11.class, type = String.class)
    public JLabel getLbBanheirareseRvatorioSet() {
        return lbBanheirareseRvatorioSet;
    }

    @MapFrame(field = "b2tempchillerind", target = L11.class, type = String.class)
    public JLabel getLbB2ChillerInd() {
        return lbB2ChillerInd;
    }

    @MapFrame(field = "b2tempchillerset", target = L11.class, type = String.class)
    public JLabel getLbB2ChillerSet() {
        return lbB2ChillerSet;
    }

    @MapFrame(field = "b2reserset", target = L11.class, type = String.class)
    public JLabel getLbB2TanqueSet() {
        return lbB2TanqueSet;
    }

    @MapFrame(field = "banheira2reservatorioind", target = L11.class, type = String.class)
    public JLabel getLbB2TanqueInd() {
        return lbB2TanqueInd;
    }

    @MapFrame(field = "banheira2onof", target = L11.class, type = String.class)
    public JLabel getLbaBanheira2BombaChiller() {
        return lbaBanheira2BombaChiller;
    }

    @MapFrame(field = "banheira2bombatanqueonof", target = L11.class, type = String.class)
    public JLabel getLbaBanheira2BombaTanque() {
        return lbaBanheira2BombaTanque;
    }

    @MapFrame(field = "b3tempchillerind", target = L11.class, type = String.class)
    public JLabel getLbB3ChillerInd() {
        return lbB3ChillerInd;
    }

    @MapFrame(field = "b3tempchillerset", target = L11.class, type = String.class)
    public JLabel getLbB3ChillerSet() {
        return lbB3ChillerSet;
    }

    @MapFrame(field = "b3reserset", target = L11.class, type = String.class)
    public JLabel getLbB3TanqueSet() {
        return lbB3TanqueSet;
    }

    @MapFrame(field = "banheira3reservatorioind", target = L11.class, type = String.class)
    public JLabel getLbB3TanqueInd() {
        return lbB3TanqueInd;
    }

    @MapFrame(field = "banheira3onof", target = L11.class, type = String.class)
    public JLabel getLbaBanheira3BombaChiller() {
        return lbaBanheira3BombaChiller;
    }

    @MapFrame(field = "banheira3bombatanqueonof", target = L11.class, type = String.class)
    public JLabel getLbaBanheira3BombaTanque() {
        return lbaBanheira3BombaTanque;
    }

    @MapFrame(field = "puller2velocidadeind", target = L11.class, type = String.class)
    public JLabel getLbPuller2VelocidadeInd() {
        return lbPuller2VelocidadeInd;
    }

    @MapFrame(field = "puller2velocidadeset", target = L11.class, type = String.class)
    public JLabel getLbPuller2VelocidadeSet() {
        return lbPuller2VelocidadeSet;
    }

    @MapFrame(field = "puller2inversoronof", target = L11.class, type = String.class)
    public JLabel getLbPuller2() {
        return lbPuller2;
    }

    @MapFrame(field = "puller3velocidadeind", target = L11.class, type = String.class)
    public JLabel getLbPuller3VelocidadeInd() {
        return lbPuller3VelocidadeInd;
    }

    @MapFrame(field = "puller3velocidadeset", target = L11.class, type = String.class)
    public JLabel getLbPuller3VelocidadeSet() {
        return lbPuller3VelocidadeSet;
    }

    @MapFrame(field = "puller3inversoronof", target = L11.class, type = String.class)
    public JLabel getLbPuller3() {
        return lbPuller3;
    }

    @MapFrame(field = "ifventilador", target = L11.class, type = String.class)
    public JLabel getLbVentilador() {
        return lbVentilador;
    }

    @MapFrame(field = "cortvelocidade", target = L11.class, type = String.class)
    public JLabel getLbCortadeiraVeloSet() {
        return lbCortadeiraVeloSet;
    }

    @MapFrame(field = "comprimento", target = L11.class, type = String.class)
    public JLabel getLbComprimentoSet() {
        return lbComprimentoSet;
    }

    @MapFrame(field = "cortserrarecuo", target = L11.class, type = String.class)
    public JLabel getLbCortRecuo() {
        return lbCortRecuo;
    }

    @MapFrame(field = "cortserraavanco", target = L11.class, type = String.class)
    public JLabel getLbCortAvanc() {
        return lbCortAvanc;
    }

    @MapFrame(field = "alarmexta", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbExtA() {
        return lbExtA;
    }

    @MapFrame(field = "alarmextb", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbExtB() {
        return lbExtB;
    }

    @MapFrame(field = "alarmextc", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbExtC() {
        return lbExtC;
    }

    @MapFrame(field = "alarmextd", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbExtD() {
        return lbExtD;
    }

    @MapFrame(field = "alarmmc", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbMicroondas() {
        return lbMicroondas;
    }

    @MapFrame(field = "alarmhotair1", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbHotAir1() {
        return lbHotAir1;
    }

    @MapFrame(field = "alarmhotair2", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbHotAir2() {
        return lbHotAir2;
    }

    @MapFrame(field = "alarmb1", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbBanheira1() {
        return lbBanheira1;
    }

    @MapFrame(field = "alarmpuller1", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbPuller1() {
        return lbPuller1;
    }

    @MapFrame(field = "alarmpintura", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbPintura() {
        return lbPintura;
    }

    @MapFrame(field = "alarmir", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbIR() {
        return lbIR;
    }

    @MapFrame(field = "alarmb2", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbBanheira2() {
        return lbBanheira2;
    }

    @MapFrame(field = "alarmb3", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbBanheira3() {
        return lbBanheira3;
    }

    @MapFrame(field = "alarmpuller2", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbPulleralarm2() {
        return lbPulleralarm2;
    }

    @MapFrame(field = "alarmpuller3", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbPulleralarm3() {
        return lbPulleralarm3;
    }

    @MapFrame(field = "alarmcort", target = L11_Alarmes.class, type = String.class)
    public JLabel getLbCortadeira() {
        return lbCortadeira;
    }

    @MapFrame(get = "getExtarpmStr", target = L11_Criticos.class, type = String.class)
    public JLabel getLbExtARpm() {
        return lbExtARpm;
    }

    @MapFrame(get = "getExtbrpmStr", target = L11_Criticos.class, type = String.class)
    public JLabel getLbExtBRpm() {
        return lbExtBRpm;
    }

    @MapFrame(get = "getExtcrpmStr", target = L11_Criticos.class, type = String.class)
    public JLabel getLbExtCRpm() {
        return lbExtCRpm;
    }

    @MapFrame(get = "getExtdrpmStr", target = L11_Criticos.class, type = String.class)
    public JLabel getLbExtDRpm() {
        return lbExtDRpm;
    }

    @MapFrame(field = "extabar", target = L11_Criticos.class, type = String.class)
    public JLabel getLbExtABar() {
        return lbExtABar;
    }

    @MapFrame(field = "extbbar", target = L11_Criticos.class, type = String.class)
    public JLabel getLbExtBBar() {
        return lbExtBBar;
    }

    @MapFrame(field = "extcbar", target = L11_Criticos.class, type = String.class)
    public JLabel getLbExtCBar() {
        return lbExtCBar;
    }

    @MapFrame(field = "extdbar", target = L11_Criticos.class, type = String.class)
    public JLabel getLbExtDBar() {
        return lbExtDBar;
    }

    @MapFrame(field = "puller1velocidadeind", target = L11_Criticos.class, type = String.class)
    public JLabel getLbPuller1VelocidadeInd() {
        return lbPuller1VelocidadeInd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lbMicroondas = new javax.swing.JLabel();
        lbVentiladorOF = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbIFLFrontalInd = new javax.swing.JLabel();
        lbMicroPctSet = new javax.swing.JLabel();
        lbBanheira3BombaTanqueON1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbBanheira3BombaChillerOF1 = new javax.swing.JLabel();
        lbBanheirareseRvatorioInd = new javax.swing.JLabel();
        lbBanheira1BombaChillerOF = new javax.swing.JLabel();
        lbMicroRefrigeradoInd = new javax.swing.JLabel();
        lbVentiladorON = new javax.swing.JLabel();
        lbMicroEsteiraSet = new javax.swing.JLabel();
        lbMicroPctInd = new javax.swing.JLabel();
        lbPuller2OF = new javax.swing.JLabel();
        lbExtDBar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbIFLCentralInd = new javax.swing.JLabel();
        lbBanheira2 = new javax.swing.JLabel();
        lbBanheira3BombaTanqueOf1 = new javax.swing.JLabel();
        lbPulleralarm3 = new javax.swing.JLabel();
        lbPuller3VelocidadeInd = new javax.swing.JLabel();
        lbExaustorOF = new javax.swing.JLabel();
        lbVulc2QueimadorInd = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lbPuller3ON = new javax.swing.JLabel();
        lbBanheira2BombaTanqueOf = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lbPuller3VelocidadeSet = new javax.swing.JLabel();
        lbHotAir1 = new javax.swing.JLabel();
        lbCortAvanc = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lbPinturaB3Ind = new javax.swing.JLabel();
        lbPuller1VelocidadeSet = new javax.swing.JLabel();
        lbPintura = new javax.swing.JLabel();
        lbaBanheira2BombaTanque = new javax.swing.JLabel();
        lbaBanheira1BombaTanque = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbBanheira2BombaChillerON = new javax.swing.JLabel();
        lbPuller2VelocidadeInd = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbMicroRefrigeradoSet = new javax.swing.JLabel();
        lbPuller1ON = new javax.swing.JLabel();
        lbPinturaB1Ind = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lbaBanheira1BombaChillerON = new javax.swing.JLabel();
        lbMicroExaustorInd = new javax.swing.JLabel();
        lbMicroEsteiraInd = new javax.swing.JLabel();
        lbVulc1Queimador2Ind = new javax.swing.JLabel();
        lbaBanheira2BombaChiller = new javax.swing.JLabel();
        lbExtA = new javax.swing.JLabel();
        lbMicroPctInd1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lbBanheirareseRvatorioSet = new javax.swing.JLabel();
        lbPulleralarm2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lbBanheira2BombaChillerOF = new javax.swing.JLabel();
        lbCortRecuo = new javax.swing.JLabel();
        lbPuller2ON = new javax.swing.JLabel();
        lbPinturaB1Set = new javax.swing.JLabel();
        lbB2TanqueInd = new javax.swing.JLabel();
        lbExtABar = new javax.swing.JLabel();
        lbVulc1EsteiraSet = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbExtBBar = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbVulc2Queimador2Ind = new javax.swing.JLabel();
        lbVulc1Queimador2Set = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        lbExaustorON = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lbCortadeira = new javax.swing.JLabel();
        lbVulc1EsteiraInd = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbaBanheira3BombaTanque = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lbB3ChillerInd = new javax.swing.JLabel();
        lbPuller2 = new javax.swing.JLabel();
        lbExtCRpm = new javax.swing.JLabel();
        lbExtC = new javax.swing.JLabel();
        lbVulc1QueimadorSet = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lbVulc2QueimadorSet = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lbB2ChillerInd = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbPuller1VelocidadeInd = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lbComprimentoSet = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbVulc2Queimador2Set = new javax.swing.JLabel();
        lbPinturaB2Set = new javax.swing.JLabel();
        lbPuller3 = new javax.swing.JLabel();
        lbExtCBar = new javax.swing.JLabel();
        lbCortadeiraVeloSet = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbPuller3OF = new javax.swing.JLabel();
        lbIFLTraseiraInd = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lbBanheira2BombaTanqueON = new javax.swing.JLabel();
        lbMicroEsqInd = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbB2ChillerSet = new javax.swing.JLabel();
        lbPinturaB4Ind = new javax.swing.JLabel();
        lbBanheira3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lbPuller = new javax.swing.JLabel();
        lbVulc1QueimadorInd = new javax.swing.JLabel();
        lbMicroEsqSet = new javax.swing.JLabel();
        lbIR = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        lbPuller1OF = new javax.swing.JLabel();
        lbVentilador = new javax.swing.JLabel();
        lbPerfil = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbPinturaB3Set = new javax.swing.JLabel();
        lbMicroExaustorSet = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        lbExtARpm = new javax.swing.JLabel();
        lbBanheira1 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lbHotAir2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPuller1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbBanheira3BombaChillerON1 = new javax.swing.JLabel();
        lbVulc2EsteiraSet = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lbExaustor = new javax.swing.JLabel();
        lbBanheira1BombaTanqueOf = new javax.swing.JLabel();
        lbB3TanqueInd = new javax.swing.JLabel();
        lbPinturaB4Set = new javax.swing.JLabel();
        lbB3TanqueSet = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        lbPuller2VelocidadeSet = new javax.swing.JLabel();
        lbExtDRpm = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbIFLEsteiraInd = new javax.swing.JLabel();
        lbaBanheira3BombaChiller = new javax.swing.JLabel();
        lbIFLFrontalSet = new javax.swing.JLabel();
        lbB3ChillerSet = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lbB2TanqueSet = new javax.swing.JLabel();
        lbPinturaB2Ind = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbPuller1VelocidadeSet6 = new javax.swing.JLabel();
        lbIFLEsteiraSet = new javax.swing.JLabel();
        lbMicroPctSet1 = new javax.swing.JLabel();
        lbBanheira1BombaChillerON = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        lbBanheira1BombaTanqueON = new javax.swing.JLabel();
        lbVulc2EsteiraInd = new javax.swing.JLabel();
        lbExtB = new javax.swing.JLabel();
        lbExtBRpm = new javax.swing.JLabel();
        lbIFLTraseiraSet = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lbExtD = new javax.swing.JLabel();
        lbIFLCentralSet = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMicroondas.setBackground(new java.awt.Color(0, 0, 0));
        lbMicroondas.setForeground(new java.awt.Color(255, 0, 0));
        lbMicroondas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbMicroondas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbMicroondas.setOpaque(true);
        jPanel1.add(lbMicroondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 306, 40, -1));

        lbVentiladorOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbVentiladorOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 850, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Cº");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 220, -1, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("bar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 420, -1, 30));

        lbIFLFrontalInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLFrontalInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLFrontalInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLFrontalInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 673, 60, 25));

        lbMicroPctSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroPctSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 193, 60, 25));

        lbBanheira3BombaTanqueON1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira3BombaTanqueON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 850, -1, -1));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cº");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 210, -1, 30));

        lbBanheira3BombaChillerOF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira3BombaChillerOF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 850, -1, -1));

        lbBanheirareseRvatorioInd.setForeground(new java.awt.Color(0, 255, 255));
        lbBanheirareseRvatorioInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanheirareseRvatorioInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbBanheirareseRvatorioInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1433, 208, 60, 25));

        lbBanheira1BombaChillerOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaChillerOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 390, -1, -1));

        lbMicroRefrigeradoInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroRefrigeradoInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroRefrigeradoInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroRefrigeradoInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 414, 60, 25));

        lbVentiladorON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbVentiladorON, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 850, -1, -1));

        lbMicroEsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroEsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 387, 60, 25));

        lbMicroPctInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroPctInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 60, 25));

        lbPuller2OF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbPuller2OF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 850, -1, -1));

        lbExtDBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtDBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtDBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtDBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 471, 60, 25));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("bar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, 30));

        lbIFLCentralInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLCentralInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLCentralInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLCentralInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 673, 60, 25));

        lbBanheira2.setBackground(new java.awt.Color(0, 0, 0));
        lbBanheira2.setForeground(new java.awt.Color(255, 0, 0));
        lbBanheira2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbBanheira2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbBanheira2.setOpaque(true);
        jPanel1.add(lbBanheira2, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 756, 40, -1));

        lbBanheira3BombaTanqueOf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira3BombaTanqueOf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 850, -1, -1));

        lbPulleralarm3.setBackground(new java.awt.Color(0, 0, 0));
        lbPulleralarm3.setForeground(new java.awt.Color(255, 0, 0));
        lbPulleralarm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbPulleralarm3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbPulleralarm3.setOpaque(true);
        jPanel1.add(lbPulleralarm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1555, 782, 40, -1));

        lbPuller3VelocidadeInd.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller3VelocidadeInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller3VelocidadeInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller3VelocidadeInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1544, 668, 60, 25));

        lbExaustorOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbExaustorOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 850, -1, -1));

        lbVulc2QueimadorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2QueimadorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2QueimadorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2QueimadorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(997, 220, 60, 25));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("rpm");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 840, -1, 30));

        lbPuller3ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbPuller3ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 850, -1, -1));

        lbBanheira2BombaTanqueOf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira2BombaTanqueOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 850, -1, -1));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("rpm");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 650, -1, 20));

        lbPuller3VelocidadeSet.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller3VelocidadeSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller3VelocidadeSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller3VelocidadeSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1544, 640, 60, 25));

        lbHotAir1.setBackground(new java.awt.Color(0, 0, 0));
        lbHotAir1.setForeground(new java.awt.Color(255, 0, 0));
        lbHotAir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbHotAir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbHotAir1.setOpaque(true);
        jPanel1.add(lbHotAir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 306, 40, -1));

        lbCortAvanc.setForeground(new java.awt.Color(255, 255, 153));
        lbCortAvanc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCortAvanc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbCortAvanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1726, 842, 60, 25));

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Cº");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 640, -1, 30));

        lbPinturaB3Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB3Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB3Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB3Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 869, 60, 25));

        lbPuller1VelocidadeSet.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1573, 181, 60, 25));

        lbPintura.setBackground(new java.awt.Color(0, 0, 0));
        lbPintura.setForeground(new java.awt.Color(255, 0, 0));
        lbPintura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbPintura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbPintura.setOpaque(true);
        jPanel1.add(lbPintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 764, 40, -1));
        jPanel1.add(lbaBanheira2BombaTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 890, 50, 20));
        jPanel1.add(lbaBanheira1BombaTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 440, 50, 20));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("m/min");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 180, -1, 20));

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("rpm");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 840, -1, 30));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Cº");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 220, -1, 30));

        lbBanheira2BombaChillerON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira2BombaChillerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 850, -1, -1));

        lbPuller2VelocidadeInd.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller2VelocidadeInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller2VelocidadeInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller2VelocidadeInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1282, 668, 60, 25));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cº");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 230, -1, 10));

        lbMicroRefrigeradoSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroRefrigeradoSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroRefrigeradoSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroRefrigeradoSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 387, 60, 25));

        lbPuller1ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbPuller1ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 390, -1, -1));

        lbPinturaB1Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB1Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB1Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB1Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 673, 60, 25));

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("m/min");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 870, -1, 30));
        jPanel1.add(lbaBanheira1BombaChillerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 480, 50, 20));

        lbMicroExaustorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroExaustorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroExaustorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroExaustorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 414, 60, 25));

        lbMicroEsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroEsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 414, 60, 25));

        lbVulc1Queimador2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1Queimador2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1Queimador2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1Queimador2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 220, 60, 25));
        jPanel1.add(lbaBanheira2BombaChiller, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 890, 50, 20));

        lbExtA.setBackground(new java.awt.Color(0, 0, 0));
        lbExtA.setForeground(new java.awt.Color(255, 0, 0));
        lbExtA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbExtA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbExtA.setOpaque(true);
        jPanel1.add(lbExtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 210, 40, -1));

        lbMicroPctInd1.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroPctInd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctInd1.setText("Null");
        lbMicroPctInd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctInd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1304, 208, 60, 25));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("m/min");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 390, -1, 20));

        lbBanheirareseRvatorioSet.setForeground(new java.awt.Color(255, 255, 153));
        lbBanheirareseRvatorioSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanheirareseRvatorioSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbBanheirareseRvatorioSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1433, 181, 60, 25));

        lbPulleralarm2.setBackground(new java.awt.Color(0, 0, 0));
        lbPulleralarm2.setForeground(new java.awt.Color(255, 0, 0));
        lbPulleralarm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbPulleralarm2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbPulleralarm2.setOpaque(true);
        jPanel1.add(lbPulleralarm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1292, 783, 40, -1));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("rpm");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 680, -1, 20));

        lbBanheira2BombaChillerOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira2BombaChillerOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 850, -1, -1));

        lbCortRecuo.setForeground(new java.awt.Color(0, 255, 255));
        lbCortRecuo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCortRecuo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbCortRecuo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1726, 869, 60, 25));

        lbPuller2ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbPuller2ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 850, -1, -1));

        lbPinturaB1Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB1Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB1Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB1Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 647, 60, 25));

        lbB2TanqueInd.setForeground(new java.awt.Color(0, 255, 255));
        lbB2TanqueInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB2TanqueInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB2TanqueInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 668, 60, 25));

        lbExtABar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtABar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtABar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtABar, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 163, 60, 25));

        lbVulc1EsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1EsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1EsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1EsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 387, 60, 25));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("rpm");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 390, -1, 30));

        lbExtBBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtBBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtBBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtBBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 208, 60, 25));

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Cº");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(1087, 670, -1, 30));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("m/min");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 390, 40, 20));

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("m/min");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(1611, 670, -1, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cº");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 390, 20, 20));

        lbVulc2Queimador2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2Queimador2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2Queimador2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2Queimador2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1137, 220, 60, 25));

        lbVulc1Queimador2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1Queimador2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1Queimador2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1Queimador2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 193, 60, 25));

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("mm");
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1793, 640, -1, 20));

        lbExaustorON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbExaustorON, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 850, -1, -1));

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("m/min");
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1611, 640, -1, 20));

        lbCortadeira.setBackground(new java.awt.Color(0, 0, 0));
        lbCortadeira.setForeground(new java.awt.Color(255, 0, 0));
        lbCortadeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbCortadeira.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbCortadeira.setOpaque(true);
        jPanel1.add(lbCortadeira, new org.netbeans.lib.awtextra.AbsoluteConstraints(1818, 760, 40, -1));

        lbVulc1EsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1EsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1EsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1EsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 414, 60, 25));

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("%");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 650, -1, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("rpm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 30));
        jPanel1.add(lbaBanheira3BombaTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 890, 40, 20));

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Cº");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(951, 670, -1, 30));

        lbB3ChillerInd.setForeground(new java.awt.Color(0, 255, 255));
        lbB3ChillerInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB3ChillerInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB3ChillerInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 668, 60, 25));
        jPanel1.add(lbPuller2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 900, 50, 20));

        lbExtCRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtCRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtCRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtCRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 394, 60, 25));

        lbExtC.setBackground(new java.awt.Color(0, 0, 0));
        lbExtC.setForeground(new java.awt.Color(255, 0, 0));
        lbExtC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbExtC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbExtC.setOpaque(true);
        jPanel1.add(lbExtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 373, 40, -1));

        lbVulc1QueimadorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1QueimadorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1QueimadorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1QueimadorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 193, 60, 25));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cº");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 220, -1, 30));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("m/min");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 420, 40, 20));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("rpm");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 650, -1, 20));

        lbVulc2QueimadorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2QueimadorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2QueimadorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2QueimadorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(997, 193, 60, 25));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cº");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 190, -1, 30));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("%");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 650, -1, 20));

        lbB2ChillerInd.setForeground(new java.awt.Color(0, 255, 255));
        lbB2ChillerInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB2ChillerInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB2ChillerInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 668, 60, 25));

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Cº");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1216, 670, -1, 30));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("rpm");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 870, -1, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("bar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 210, -1, 20));

        lbPuller1VelocidadeInd.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1573, 208, 60, 25));

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Cº");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(1087, 640, -1, 30));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cº");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 190, -1, 30));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("%");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 650, -1, 20));

        lbComprimentoSet.setForeground(new java.awt.Color(255, 255, 153));
        lbComprimentoSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComprimentoSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbComprimentoSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1726, 640, 60, 25));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("%");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 390, -1, 20));

        lbVulc2Queimador2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2Queimador2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2Queimador2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2Queimador2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(1137, 193, 60, 25));

        lbPinturaB2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 646, 60, 25));
        jPanel1.add(lbPuller3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 900, 50, 20));

        lbExtCBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtCBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtCBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtCBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 422, 60, 25));

        lbCortadeiraVeloSet.setForeground(new java.awt.Color(0, 255, 255));
        lbCortadeiraVeloSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCortadeiraVeloSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbCortadeiraVeloSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1726, 668, 60, 25));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cº");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 420, 20, 20));

        lbPuller3OF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbPuller3OF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 850, -1, -1));

        lbIFLTraseiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLTraseiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLTraseiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLTraseiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 673, 60, 25));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cº");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 220, -1, 30));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("m/min");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 210, -1, 20));

        lbBanheira2BombaTanqueON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira2BombaTanqueON, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 850, -1, -1));

        lbMicroEsqInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroEsqInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsqInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsqInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 220, 60, 25));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Cº");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 190, -1, 30));

        lbB2ChillerSet.setForeground(new java.awt.Color(255, 255, 153));
        lbB2ChillerSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB2ChillerSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB2ChillerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 640, 60, 25));

        lbPinturaB4Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB4Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB4Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB4Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 870, 60, 25));

        lbBanheira3.setBackground(new java.awt.Color(0, 0, 0));
        lbBanheira3.setForeground(new java.awt.Color(255, 0, 0));
        lbBanheira3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbBanheira3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbBanheira3.setOpaque(true);
        jPanel1.add(lbBanheira3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 756, 40, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cº");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 190, 20, 30));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("mm/s");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1793, 870, -1, 30));
        jPanel1.add(lbPuller, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 430, 40, 20));

        lbVulc1QueimadorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1QueimadorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1QueimadorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1QueimadorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 60, 25));

        lbMicroEsqSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroEsqSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsqSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsqSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 193, 60, 25));

        lbIR.setBackground(new java.awt.Color(0, 0, 0));
        lbIR.setForeground(new java.awt.Color(255, 0, 0));
        lbIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbIR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbIR.setOpaque(true);
        jPanel1.add(lbIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 764, 40, -1));

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("mm/s");
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(1793, 840, -1, 30));

        lbPuller1OF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbPuller1OF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 390, -1, -1));
        jPanel1.add(lbVentilador, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 890, 40, 20));

        lbPerfil.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbPerfil.setForeground(new java.awt.Color(0, 255, 255));
        lbPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1034, 16, 175, 36));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("m/min");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 390, -1, 20));

        lbPinturaB3Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB3Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB3Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB3Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 843, 60, 25));

        lbMicroExaustorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroExaustorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroExaustorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroExaustorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 387, 60, 25));

        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("mm/s");
        jPanel1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(1793, 670, -1, 20));

        lbExtARpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtARpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtARpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtARpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 135, 60, 25));

        lbBanheira1.setBackground(new java.awt.Color(0, 0, 0));
        lbBanheira1.setForeground(new java.awt.Color(255, 0, 0));
        lbBanheira1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbBanheira1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbBanheira1.setOpaque(true);
        jPanel1.add(lbBanheira1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 300, 40, -1));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("11");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 16, 51, 37));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Cº");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 180, -1, 30));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cº");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 220, -1, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("%");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 420, -1, 20));

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("%");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 680, -1, 20));

        lbHotAir2.setBackground(new java.awt.Color(0, 0, 0));
        lbHotAir2.setForeground(new java.awt.Color(255, 0, 0));
        lbHotAir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbHotAir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbHotAir2.setOpaque(true);
        jPanel1.add(lbHotAir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1192, 306, 40, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("rpm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 680, -1, 20));

        lbPuller1.setBackground(new java.awt.Color(0, 0, 0));
        lbPuller1.setForeground(new java.awt.Color(255, 0, 0));
        lbPuller1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbPuller1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbPuller1.setOpaque(true);
        jPanel1.add(lbPuller1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 323, 40, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("bar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, 30));

        lbBanheira3BombaChillerON1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira3BombaChillerON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 850, -1, -1));

        lbVulc2EsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2EsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2EsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2EsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 387, 60, 25));

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("m/min");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 840, -1, 30));

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("%");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 680, -1, 20));
        jPanel1.add(lbExaustor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 890, 50, 20));

        lbBanheira1BombaTanqueOf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaTanqueOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 390, -1, -1));

        lbB3TanqueInd.setForeground(new java.awt.Color(0, 255, 255));
        lbB3TanqueInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB3TanqueInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB3TanqueInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 668, 60, 25));

        lbPinturaB4Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB4Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB4Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB4Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 842, 60, 25));

        lbB3TanqueSet.setForeground(new java.awt.Color(255, 255, 153));
        lbB3TanqueSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB3TanqueSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB3TanqueSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 640, 60, 25));

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("m/min");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1349, 670, -1, 20));

        lbPuller2VelocidadeSet.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller2VelocidadeSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller2VelocidadeSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller2VelocidadeSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1282, 640, 60, 25));

        lbExtDRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtDRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtDRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtDRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 443, 60, 25));

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Cº");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 670, -1, 30));

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Cº");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(951, 640, -1, 30));

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("m/min");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1349, 640, -1, 20));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cº");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 190, -1, 30));

        lbIFLEsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLEsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 869, 60, 25));
        jPanel1.add(lbaBanheira3BombaChiller, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 890, 40, 20));

        lbIFLFrontalSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLFrontalSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLFrontalSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLFrontalSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 646, 60, 25));

        lbB3ChillerSet.setForeground(new java.awt.Color(255, 255, 153));
        lbB3ChillerSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB3ChillerSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB3ChillerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 640, 60, 25));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("m/min");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 420, -1, 20));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("m/min");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 420, -1, 20));

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("%");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 680, -1, 20));

        lbB2TanqueSet.setForeground(new java.awt.Color(255, 255, 153));
        lbB2TanqueSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbB2TanqueSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbB2TanqueSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 640, 60, 25));

        lbPinturaB2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 673, 60, 25));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("rpm");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 180, -1, 20));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cº");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 190, -1, 30));

        lbPuller1VelocidadeSet6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 60, 25));

        lbIFLEsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLEsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 843, 60, 25));

        lbMicroPctSet1.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroPctSet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctSet1.setText("Null");
        lbMicroPctSet1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctSet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1304, 181, 60, 25));

        lbBanheira1BombaChillerON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaChillerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 390, -1, -1));

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("rpm");
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 870, -1, 30));

        lbBanheira1BombaTanqueON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaTanqueON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 390, -1, -1));

        lbVulc2EsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2EsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2EsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2EsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 414, 60, 25));

        lbExtB.setBackground(new java.awt.Color(0, 0, 0));
        lbExtB.setForeground(new java.awt.Color(255, 0, 0));
        lbExtB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbExtB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbExtB.setOpaque(true);
        jPanel1.add(lbExtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 40, 20));

        lbExtBRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtBRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtBRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtBRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 180, 60, 25));

        lbIFLTraseiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLTraseiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLTraseiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLTraseiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 647, 60, 25));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("rpm");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, 30));

        lbExtD.setBackground(new java.awt.Color(0, 0, 0));
        lbExtD.setForeground(new java.awt.Color(255, 0, 0));
        lbExtD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/if_status-busy_46252.png"))); // NOI18N
        lbExtD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lbExtD.setOpaque(true);
        jPanel1.add(lbExtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 408, 40, -1));

        lbIFLCentralSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLCentralSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLCentralSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLCentralSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 647, 60, 25));

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Cº");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(1216, 640, -1, 30));
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 74, 51, 85));
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 40, 30));
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, 20));
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 20));
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 244, 51, 83));
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 40, 30));
        jPanel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 80, 20));
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 80, 20));
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 370, 130));

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/OverNoteGG.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1010));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(L11OverViewGG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L11OverViewGG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L11OverViewGG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L11OverViewGG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L11OverViewGG().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbB2ChillerInd;
    private javax.swing.JLabel lbB2ChillerSet;
    private javax.swing.JLabel lbB2TanqueInd;
    private javax.swing.JLabel lbB2TanqueSet;
    private javax.swing.JLabel lbB3ChillerInd;
    private javax.swing.JLabel lbB3ChillerSet;
    private javax.swing.JLabel lbB3TanqueInd;
    private javax.swing.JLabel lbB3TanqueSet;
    private javax.swing.JLabel lbBanheira1;
    private javax.swing.JLabel lbBanheira1BombaChillerOF;
    private javax.swing.JLabel lbBanheira1BombaChillerON;
    private javax.swing.JLabel lbBanheira1BombaTanqueON;
    private javax.swing.JLabel lbBanheira1BombaTanqueOf;
    private javax.swing.JLabel lbBanheira2;
    private javax.swing.JLabel lbBanheira2BombaChillerOF;
    private javax.swing.JLabel lbBanheira2BombaChillerON;
    private javax.swing.JLabel lbBanheira2BombaTanqueON;
    private javax.swing.JLabel lbBanheira2BombaTanqueOf;
    private javax.swing.JLabel lbBanheira3;
    private javax.swing.JLabel lbBanheira3BombaChillerOF1;
    private javax.swing.JLabel lbBanheira3BombaChillerON1;
    private javax.swing.JLabel lbBanheira3BombaTanqueON1;
    private javax.swing.JLabel lbBanheira3BombaTanqueOf1;
    private javax.swing.JLabel lbBanheirareseRvatorioInd;
    private javax.swing.JLabel lbBanheirareseRvatorioSet;
    private javax.swing.JLabel lbComprimentoSet;
    private javax.swing.JLabel lbCortAvanc;
    private javax.swing.JLabel lbCortRecuo;
    private javax.swing.JLabel lbCortadeira;
    private javax.swing.JLabel lbCortadeiraVeloSet;
    private javax.swing.JLabel lbExaustor;
    private javax.swing.JLabel lbExaustorOF;
    private javax.swing.JLabel lbExaustorON;
    private javax.swing.JLabel lbExtA;
    private javax.swing.JLabel lbExtABar;
    private javax.swing.JLabel lbExtARpm;
    private javax.swing.JLabel lbExtB;
    private javax.swing.JLabel lbExtBBar;
    private javax.swing.JLabel lbExtBRpm;
    private javax.swing.JLabel lbExtC;
    private javax.swing.JLabel lbExtCBar;
    private javax.swing.JLabel lbExtCRpm;
    private javax.swing.JLabel lbExtD;
    private javax.swing.JLabel lbExtDBar;
    private javax.swing.JLabel lbExtDRpm;
    private javax.swing.JLabel lbHotAir1;
    private javax.swing.JLabel lbHotAir2;
    private javax.swing.JLabel lbIFLCentralInd;
    private javax.swing.JLabel lbIFLCentralSet;
    private javax.swing.JLabel lbIFLEsteiraInd;
    private javax.swing.JLabel lbIFLEsteiraSet;
    private javax.swing.JLabel lbIFLFrontalInd;
    private javax.swing.JLabel lbIFLFrontalSet;
    private javax.swing.JLabel lbIFLTraseiraInd;
    private javax.swing.JLabel lbIFLTraseiraSet;
    private javax.swing.JLabel lbIR;
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
    private javax.swing.JLabel lbMicroondas;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JLabel lbPintura;
    private javax.swing.JLabel lbPinturaB1Ind;
    private javax.swing.JLabel lbPinturaB1Set;
    private javax.swing.JLabel lbPinturaB2Ind;
    private javax.swing.JLabel lbPinturaB2Set;
    private javax.swing.JLabel lbPinturaB3Ind;
    private javax.swing.JLabel lbPinturaB3Set;
    private javax.swing.JLabel lbPinturaB4Ind;
    private javax.swing.JLabel lbPinturaB4Set;
    private javax.swing.JLabel lbPuller;
    private javax.swing.JLabel lbPuller1;
    private javax.swing.JLabel lbPuller1OF;
    private javax.swing.JLabel lbPuller1ON;
    private javax.swing.JLabel lbPuller1VelocidadeInd;
    private javax.swing.JLabel lbPuller1VelocidadeSet;
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
    private javax.swing.JLabel lbPulleralarm2;
    private javax.swing.JLabel lbPulleralarm3;
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
