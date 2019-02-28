/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.main;

import br.com.painel.framesGG.PainelGG;
import br.com.painel.frames.status.Painel;
import br.com.painel.util.FrameUtil;
import br.com.painel.util.Utilidades;
import java.awt.Dimension;

/**
 *
 * @author Tiago
 */
public class Main {

    public static void main(String[] args) {
        initSystem();
    }

    private static void initSystem() {
        FrameUtil.setNimbusLookAndFeel();
        Dimension dms = Utilidades.getResolutionScreen();
        if (FrameUtil.isSmallScreen(dms)) {
            FrameUtil.openFrame(Painel.class, dms);
        } else {
            FrameUtil.openFrame(PainelGG.class, dms);
        }
    }

}
