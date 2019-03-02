/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.framesGG;

import br.com.painel.annotations.MapFrame;
import br.com.painel.entities.L09;
import br.com.painel.entities.L09_Criticos;
import br.com.painel.interfaces.ManipulaFrame;
import br.com.painel.listener.Listener_L09OverViewGG;
import java.util.Arrays;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author rsouza10
 */
public final class L09OverViewGG extends ManipulaFrame {

    private static final long serialVersionUID = 5796502357572456569L;
    private final Listener_L09OverViewGG listener;

    /**
     * Creates new form L09OuverView
     */
    public L09OverViewGG() {
        maximize();
        initComponents();
        listener = new Listener_L09OverViewGG(this);
    }

    @Override
    public List<JLabel> getJLabelList() {
        return Arrays.asList(jLabel69, jLabel68, jLabel70, jLabel71, jLabel73, jLabel74, jLabel75, jLabel72, jLabel76);
    }

    @Override
    public JLabel[][] getOnOffFields() {
        return new JLabel[][]{
            {lbaBanheira1BombaChillerON, lbBanheira1BombaChillerOF},
            {lbaBanheira1BombaTanque, lbBanheira1BombaTanqueON, lbBanheira1BombaTanqueOf},
            {lbPuller1, lbPuller1ON, lbPuller1OF}
        };
    }

    @MapFrame(get = "getPinturaB1", target = L09.class)
    public JLabel getLbPinturaB1Ind() {
        return lbPinturaB1Ind;
    }

    @MapFrame(get = "getPinturaB2", target = L09.class)
    public JLabel getLbPinturaB2Ind() {
        return lbPinturaB2Ind;
    }

    @MapFrame(get = "getPinturaB3", target = L09.class)
    public JLabel getLbPinturaB3Ind() {
        return lbPinturaB3Ind;
    }

    @MapFrame(get = "getPinturaB4", target = L09.class)
    public JLabel getLbPinturaB4Ind() {
        return lbPinturaB4Ind;
    }

    @MapFrame(get = "getIFLTraseira", target = L09.class)
    public JLabel getLbIFLTraseiraInd() {
        return lbIFLTraseiraInd;
    }

    @MapFrame(get = "getIFLFrontal", target = L09.class)
    public JLabel getLbIFLFrontalInd() {
        return lbIFLFrontalInd;
    }

    @MapFrame(get = "getIFLCentral", target = L09.class)
    public JLabel getLbIFLCentralInd() {
        return lbIFLCentralInd;
    }

    @MapFrame(get = "getIFLEsteira2", target = L09.class)
    public JLabel getLbIFLEsteira2Ind() {
        return lbIFLEsteira2Ind;
    }

    @MapFrame(get = "getIFLEsteira", target = L09.class)
    public JLabel getLbIFLEsteiraInd() {
        return lbIFLEsteiraInd;
    }

    @MapFrame(field = "micropctind", target = L09.class)
    public JLabel getLbMicroPctInd() {
        return lbMicroPctInd;
    }

    @MapFrame(field = "micropctset", target = L09.class)
    public JLabel getLbMicroPctSet() {
        return lbMicroPctSet;
    }

    @MapFrame(field = "microesqind", target = L09.class)
    public JLabel getLbMicroEsqInd() {
        return lbMicroEsqInd;
    }

    @MapFrame(field = "microesqset", target = L09.class)
    public JLabel getLbMicroEsqSet() {
        return lbMicroEsqSet;
    }

    @MapFrame(field = "microesteiraind", target = L09.class)
    public JLabel getLbMicroEsteiraInd() {
        return lbMicroEsteiraInd;
    }

    @MapFrame(field = "microesteiraset", target = L09.class)
    public JLabel getLbMicroEsteiraSet() {
        return lbMicroEsteiraSet;
    }

    @MapFrame(field = "microexaustorind", target = L09.class)
    public JLabel getLbMicroExaustorInd() {
        return lbMicroExaustorInd;
    }

    @MapFrame(field = "microexaustorset", target = L09.class)
    public JLabel getLbMicroExaustorSet() {
        return lbMicroExaustorSet;
    }

    @MapFrame(field = "microrefrigeradoind", target = L09.class)
    public JLabel getLbMicroRefrigeradoInd() {
        return lbMicroRefrigeradoInd;
    }

    @MapFrame(field = "microrefrigeradoset", target = L09.class)
    public JLabel getLbMicroRefrigeradoSet() {
        return lbMicroRefrigeradoSet;
    }

    @MapFrame(field = "vulc1queimadorind", target = L09.class)
    public JLabel getLbVulc1QueimadorInd() {
        return lbVulc1QueimadorInd;
    }

    @MapFrame(field = "vulc1queimadorset", target = L09.class)
    public JLabel getLbVulc1QueimadorSet() {
        return lbVulc1QueimadorSet;
    }

    @MapFrame(field = "vulc1queimador2ind", target = L09.class)
    public JLabel getLbVulc1Queimador2Ind() {
        return lbVulc1Queimador2Ind;
    }

    @MapFrame(field = "vulc1queimador2set", target = L09.class)
    public JLabel getLbVulc1Queimador2Set() {
        return lbVulc1Queimador2Set;
    }

    @MapFrame(field = "vulc1esteiraind", target = L09.class)
    public JLabel getLbVulc1EsteiraInd() {
        return lbVulc1EsteiraInd;
    }

    @MapFrame(field = "vulc1esteiraset", target = L09.class)
    public JLabel getLbVulc1EsteiraSet() {
        return lbVulc1EsteiraSet;
    }

    @MapFrame(field = "puller1velocidadeset", target = L09.class)
    public JLabel getLbPuller1VelocidadeSet() {
        return lbPuller1VelocidadeSet;
    }

    @MapFrame(field = "vulc2queimadorind", target = L09.class)
    public JLabel getLbVulc2QueimadorInd() {
        return lbVulc2QueimadorInd;
    }

    @MapFrame(field = "vulc2queimadorset", target = L09.class)
    public JLabel getLbVulc2QueimadorSet() {
        return lbVulc2QueimadorSet;
    }

    @MapFrame(field = "vulc2queimador2ind", target = L09.class)
    public JLabel getLbVulc2Queimador2Ind() {
        return lbVulc2Queimador2Ind;
    }

    @MapFrame(field = "vulc2queimador2set", target = L09.class)
    public JLabel getLbVulc2Queimador2Set() {
        return lbVulc2Queimador2Set;
    }

    @MapFrame(field = "vulc2esteiraind", target = L09.class)
    public JLabel getLbVulc2EsteiraInd() {
        return lbVulc2EsteiraInd;
    }

    @MapFrame(field = "vulc2esteiraset", target = L09.class)
    public JLabel getLbVulc2EsteiraSet() {
        return lbVulc2EsteiraSet;
    }

    @MapFrame(field = "banheira1reservatorioind", target = L09.class)
    public JLabel getLbBanheirareseRvatorioInd() {
        return lbBanheirareseRvatorioInd;
    }

    @MapFrame(field = "banheira1onof", target = L09.class)
    public JLabel getLbaBanheira1BombaChillerON() {
        return lbaBanheira1BombaChillerON;
    }

    @MapFrame(field = "banheira1bombatanqueonof", target = L09.class)
    public JLabel getLbaBanheira1BombaTanque() {
        return lbaBanheira1BombaTanque;
    }

    @MapFrame(field = "pullerinversoronof", target = L09.class)
    public JLabel getLbPuller1() {
        return lbPuller1;
    }

    @MapFrame(field = "pinturab1set", target = L09.class)
    public JLabel getLbPinturaB1Set() {
        return lbPinturaB1Set;
    }

    @MapFrame(field = "pinturab2set", target = L09.class)
    public JLabel getLbPinturaB2Set() {
        return lbPinturaB2Set;
    }

    @MapFrame(field = "pinturab3set", target = L09.class)
    public JLabel getLbPinturaB3Set() {
        return lbPinturaB3Set;
    }

    @MapFrame(field = "pinturab4set", target = L09.class)
    public JLabel getLbPinturaB4Set() {
        return lbPinturaB4Set;
    }

    @MapFrame(field = "iflampfrontal", target = L09.class)
    public JLabel getLbIFLFrontalSet() {
        return lbIFLFrontalSet;
    }

    @MapFrame(field = "iflampcentral", target = L09.class)
    public JLabel getLbIFLCentralSet() {
        return lbIFLCentralSet;
    }

    @MapFrame(field = "iflamptraseira", target = L09.class)
    public JLabel getLbIFLTraseiraSet() {
        return lbIFLTraseiraSet;
    }

    @MapFrame(field = "ifesteira2set", target = L09.class)
    public JLabel getLbIFLEsteira2Set() {
        return lbIFLEsteira2Set;
    }

    @MapFrame(field = "perfil", target = L09.class)
    public JLabel getLbPerfil() {
        return lbPerfil;
    }

    @MapFrame(field = "ifesteiraset", target = L09.class)
    public JLabel getLbIFLEsteiraSet() {
        return lbIFLEsteiraSet;
    }

    @MapFrame(get = "getExtarpmStr", target = L09_Criticos.class)
    public JLabel getLbExtARpm() {
        return lbExtARpm;
    }

    @MapFrame(get = "getExtbrpmStr", target = L09_Criticos.class)
    public JLabel getLbExtBRpm() {
        return lbExtBRpm;
    }

    @MapFrame(get = "getExtcrpmStr", target = L09_Criticos.class)
    public JLabel getLbExtCRpm() {
        return lbExtCRpm;
    }

    @MapFrame(get = "getExtdrpmStr", target = L09_Criticos.class)
    public JLabel getLbExtDRpm() {
        return lbExtDRpm;
    }

    @MapFrame(field = "extabar", target = L09_Criticos.class)
    public JLabel getLbExtABar() {
        return lbExtABar;
    }

    @MapFrame(field = "extbbar", target = L09_Criticos.class)
    public JLabel getLbExtBBar() {
        return lbExtBBar;
    }

    @MapFrame(field = "extcbar", target = L09_Criticos.class)
    public JLabel getLbExtCBar() {
        return lbExtCBar;
    }

    @MapFrame(field = "extdbar", target = L09_Criticos.class)
    public JLabel getLbExtDBar() {
        return lbExtDBar;
    }

    @MapFrame(field = "puller1velocidadeind", target = L09_Criticos.class)
    public JLabel getLbPuller1VelocidadeInd() {
        return lbPuller1VelocidadeInd;
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMicroPctInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroPctInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 60, 25));

        lbMicroEsqInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroEsqInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsqInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsqInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 220, 60, 25));

        lbMicroEsqSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroEsqSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsqSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsqSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 193, 60, 25));

        lbMicroEsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroEsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 414, 60, 25));

        lbMicroEsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroEsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroEsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroEsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 387, 60, 25));

        lbMicroExaustorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroExaustorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroExaustorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroExaustorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 414, 60, 25));

        lbMicroExaustorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroExaustorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroExaustorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroExaustorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 387, 60, 25));

        lbMicroRefrigeradoSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroRefrigeradoSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroRefrigeradoSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroRefrigeradoSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 387, 60, 25));

        lbMicroRefrigeradoInd.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroRefrigeradoInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroRefrigeradoInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroRefrigeradoInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 414, 60, 25));

        lbMicroPctSet.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroPctSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 193, 60, 25));

        lbVulc1QueimadorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1QueimadorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1QueimadorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1QueimadorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 193, 60, 25));

        lbVulc1QueimadorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1QueimadorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1QueimadorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1QueimadorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 60, 25));

        lbVulc1Queimador2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1Queimador2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1Queimador2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1Queimador2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 220, 60, 25));

        lbVulc1EsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1EsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1EsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1EsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 387, 60, 25));

        lbVulc1EsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc1EsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1EsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1EsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 414, 60, 25));

        lbVulc1Queimador2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc1Queimador2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc1Queimador2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc1Queimador2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 193, 60, 25));

        lbExtARpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtARpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtARpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtARpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 135, 60, 25));

        lbExtABar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtABar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtABar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtABar, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 163, 60, 25));

        lbExtBBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtBBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtBBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtBBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 208, 60, 25));

        lbExtBRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtBRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtBRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtBRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 180, 60, 25));

        lbExtDBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtDBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtDBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtDBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 471, 60, 25));

        lbExtDRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtDRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtDRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtDRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 443, 60, 25));

        lbExtCBar.setForeground(new java.awt.Color(0, 255, 255));
        lbExtCBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtCBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtCBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 422, 60, 25));

        lbExtCRpm.setForeground(new java.awt.Color(0, 255, 255));
        lbExtCRpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExtCRpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbExtCRpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 394, 60, 25));

        lbMicroPctInd1.setForeground(new java.awt.Color(0, 255, 255));
        lbMicroPctInd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctInd1.setText("Null");
        lbMicroPctInd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctInd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1304, 208, 60, 25));

        lbMicroPctSet1.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroPctSet1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctSet1.setText("Null");
        lbMicroPctSet1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctSet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1304, 181, 60, 25));

        lbMicroPctSet2.setForeground(new java.awt.Color(255, 255, 153));
        lbMicroPctSet2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMicroPctSet2.setText("Null");
        lbMicroPctSet2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbMicroPctSet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1433, 181, 60, 25));

        lbBanheirareseRvatorioInd.setForeground(new java.awt.Color(0, 255, 255));
        lbBanheirareseRvatorioInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanheirareseRvatorioInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbBanheirareseRvatorioInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1433, 208, 60, 25));

        lbPuller1VelocidadeSet.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1573, 181, 60, 25));

        lbPuller1VelocidadeInd.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1573, 208, 60, 25));

        lbVulc2QueimadorSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2QueimadorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2QueimadorSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2QueimadorSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(997, 193, 60, 25));

        lbVulc2QueimadorInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2QueimadorInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2QueimadorInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2QueimadorInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(997, 220, 60, 25));

        lbVulc2Queimador2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2Queimador2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2Queimador2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2Queimador2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1137, 220, 60, 25));

        lbVulc2Queimador2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2Queimador2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2Queimador2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2Queimador2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(1137, 193, 60, 25));

        lbVulc2EsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbVulc2EsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2EsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2EsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 387, 60, 25));

        lbVulc2EsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbVulc2EsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVulc2EsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbVulc2EsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 414, 60, 25));

        lbBanheira1BombaChillerON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaChillerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 380, -1, -1));

        lbBanheira1BombaChillerOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaChillerOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 380, -1, -1));

        lbBanheira1BombaTanqueON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaTanqueON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 380, -1, -1));

        lbBanheira1BombaTanqueOf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbBanheira1BombaTanqueOf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 380, -1, -1));

        lbPinturaB1Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB1Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB1Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB1Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 647, 60, 25));
        jPanel1.add(lbaBanheira1BombaChillerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 420, 50, 20));

        lbPinturaB1Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB1Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB1Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB1Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 673, 60, 25));
        jPanel1.add(lbaBanheira1BombaTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 420, 50, 20));

        lbPinturaB2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 647, 60, 25));

        lbPinturaB2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 673, 60, 25));

        lbPinturaB3Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB3Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB3Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB3Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 869, 60, 25));

        lbPinturaB3Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB3Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB3Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB3Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 843, 60, 25));

        lbPinturaB4Set.setForeground(new java.awt.Color(255, 255, 153));
        lbPinturaB4Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB4Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB4Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 843, 60, 25));

        lbPinturaB4Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbPinturaB4Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPinturaB4Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPinturaB4Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 870, 60, 25));

        lbIFLFrontalInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLFrontalInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLFrontalInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLFrontalInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 673, 60, 25));

        lbIFLFrontalSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLFrontalSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLFrontalSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLFrontalSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 647, 60, 25));

        lbPuller1VelocidadeSet6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 60, 25));

        lbPuller1VelocidadeInd6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 60, 25));

        lbIFLCentralSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLCentralSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLCentralSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLCentralSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 646, 60, 25));

        lbIFLCentralInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLCentralInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLCentralInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLCentralInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 673, 60, 25));

        lbIFLTraseiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLTraseiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLTraseiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLTraseiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 673, 60, 25));

        lbIFLTraseiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLTraseiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLTraseiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLTraseiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 647, 60, 25));

        lbIFLEsteira2Ind.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLEsteira2Ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteira2Ind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteira2Ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 870, 60, 25));

        lbIFLEsteira2Set.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLEsteira2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteira2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteira2Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 843, 60, 25));

        lbPuller1VelocidadeSet10.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet10.setText("Null");
        lbPuller1VelocidadeSet10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet10, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 640, 60, 25));

        lbPuller1VelocidadeInd10.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd10.setText("Null");
        lbPuller1VelocidadeInd10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd10, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 667, 60, 25));

        lbPuller1VelocidadeSet11.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet11.setText("Null");
        lbPuller1VelocidadeSet11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet11, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 640, 60, 25));

        lbPuller1VelocidadeInd11.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd11.setText("Null");
        lbPuller1VelocidadeInd11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd11, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 667, 60, 25));

        lbPuller1VelocidadeSet12.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet12.setText("Null");
        lbPuller1VelocidadeSet12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 640, 60, 25));

        lbPuller1VelocidadeInd12.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd12.setText("Null");
        lbPuller1VelocidadeInd12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 667, 60, 25));

        lbPuller1VelocidadeSet13.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet13.setText("Null");
        lbPuller1VelocidadeSet13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 641, 60, 25));

        lbPuller1VelocidadeInd13.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd13.setText("Null");
        lbPuller1VelocidadeInd13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 667, 60, 25));

        lbPuller1VelocidadeInd14.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd14.setText("Null");
        lbPuller1VelocidadeInd14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1282, 667, 60, 25));

        lbPuller1VelocidadeSet14.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet14.setText("Null");
        lbPuller1VelocidadeSet14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1282, 640, 60, 25));

        lbPuller1VelocidadeInd15.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd15.setText("Null");
        lbPuller1VelocidadeInd15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1544, 667, 60, 25));

        lbPuller1VelocidadeSet15.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet15.setText("Null");
        lbPuller1VelocidadeSet15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1544, 640, 60, 25));

        lbPuller1VelocidadeInd16.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd16.setText("Null");
        lbPuller1VelocidadeInd16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1726, 668, 60, 25));

        lbPuller1VelocidadeSet16.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet16.setText("Null");
        lbPuller1VelocidadeSet16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1726, 640, 60, 25));

        lbPuller1VelocidadeInd17.setForeground(new java.awt.Color(0, 255, 255));
        lbPuller1VelocidadeInd17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeInd17.setText("Null");
        lbPuller1VelocidadeInd17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeInd17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1726, 870, 60, 25));

        lbPuller1VelocidadeSet17.setForeground(new java.awt.Color(255, 255, 153));
        lbPuller1VelocidadeSet17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuller1VelocidadeSet17.setText("Null");
        lbPuller1VelocidadeSet17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPuller1VelocidadeSet17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1726, 843, 60, 25));

        lbPuller1ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_green_14986.png"))); // NOI18N
        jPanel1.add(lbPuller1ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 380, -1, -1));

        lbPuller1OF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/button_blank_red_14987.png"))); // NOI18N
        jPanel1.add(lbPuller1OF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 380, -1, -1));
        jPanel1.add(lbPuller1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 420, 50, 20));

        lbPerfil.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbPerfil.setForeground(new java.awt.Color(0, 255, 255));
        lbPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1034, 16, 175, 36));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("09");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 16, 51, 36));

        lbIFLEsteiraSet.setForeground(new java.awt.Color(255, 255, 153));
        lbIFLEsteiraSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteiraSet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteiraSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 843, 60, 25));

        lbIFLEsteiraInd.setForeground(new java.awt.Color(0, 255, 255));
        lbIFLEsteiraInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIFLEsteiraInd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbIFLEsteiraInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 870, 60, 25));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cº");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 210, 50, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("rpm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 30, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("rpm");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 180, 30, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("rpm");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 30, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("rpm");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 680, 30, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("bar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 30, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("bar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 30, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("bar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 210, 30, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("bar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 30, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cº");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 190, 30, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cº");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 220, 40, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cº");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 220, 40, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cº");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 220, 30, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("%");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 680, 40, 20));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cº");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 390, 30, 20));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cº");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 190, 40, 30));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cº");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 190, 30, 30));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cº");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 220, 40, 30));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cº");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 190, 30, 30));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cº");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 220, 30, 30));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cº");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 190, 40, 30));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cº");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 220, 40, 30));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cº");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 190, 40, 30));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("m/min");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 420, 50, 20));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("m/min");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 40, 20));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("%");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 390, 40, 20));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("m/min");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 210, 50, 30));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("m/min");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 390, 50, 20));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("m/min");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 870, 50, 30));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("m/min");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 390, 50, 20));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cº");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 420, 30, 20));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("m/min");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 40, 20));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("m/min");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 180, 50, 30));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("rpm");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 30, 30));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("rpm");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 870, 40, 30));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("rpm");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 680, 30, 20));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("rpm");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 650, 30, 20));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("%");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 420, 40, 20));

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("%");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 650, 30, 20));

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("%");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 680, 30, 20));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("%");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 650, 30, 20));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("%");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 680, 30, 20));

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("%");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 650, 40, 20));

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("m/min");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 420, 50, 20));

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("m/min");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 840, 50, 30));

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("m/min");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 870, 50, 30));

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("m/min");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 840, 50, 30));

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("rpm");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 650, 30, 20));

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("rpm");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 840, 30, 30));

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("rpm");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 870, 40, 30));

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("rpm");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 840, 40, 30));

        jLabel69.setName("jLabel69"); // NOI18N
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 51, 85));

        jLabel70.setName("jLabel70"); // NOI18N
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, 20));

        jLabel71.setName("jLabel71"); // NOI18N
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 20));

        jLabel68.setName("jLabel68"); // NOI18N
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 40, 30));

        jLabel73.setName("jLabel73"); // NOI18N
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 40, 30));

        jLabel75.setName("jLabel75"); // NOI18N
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 80, 20));

        jLabel74.setName("jLabel74"); // NOI18N
        jPanel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 80, 20));

        jLabel72.setName("jLabel72"); // NOI18N
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 51, 83));

        jLabel76.setName("jLabel76"); // NOI18N
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 370, 130));

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/painel/img/OverNoteGGL09.PNG"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1919, 1018));
        jLabel1.setMinimumSize(new java.awt.Dimension(1919, 1018));
        jLabel1.setPreferredSize(new java.awt.Dimension(1919, 1018));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1010));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate=collapsed desc= Look and feel setting code (optional) >
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
            java.util.logging.Logger.getLogger(L09OverViewGG.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L09OverViewGG.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L09OverViewGG.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L09OverViewGG.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L09OverViewGG().setVisible(true);
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
