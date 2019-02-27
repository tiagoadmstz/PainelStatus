/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.status;

import br.com.painel.framesGG.PainelGG;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author rsouza10
 */
public class PainelStatus {

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
                Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
                if (resolucao.equals(new Dimension(1280, 1024))) {
                    Painel frame = new Painel();
                    frame.setSize(resolucao);
                    frame.setVisible(true);
                } else if (resolucao.equals(new Dimension(800, 600))) {
                    Painel frame = new Painel();
                    frame.setSize(resolucao);
                    frame.setVisible(true);
                } else if (resolucao.equals(new Dimension(1920, 1080))) {
                    PainelGG frame = new PainelGG();
                    frame.setSize(resolucao);
                    frame.setVisible(true);
                } else {
                    PainelGG frame = new PainelGG();
                    frame.setSize(resolucao);
                    frame.setVisible(true);
                }
            }
        });
    }

}
