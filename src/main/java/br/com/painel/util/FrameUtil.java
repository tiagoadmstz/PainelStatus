/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.util;

import br.com.painel.annotations.MapFrame;
import br.com.painel.enumerated.LOOKANDFEEL;
import br.com.painel.frames.status.L01ATBExtrusoraA;
import br.com.painel.frames.status.L01ATBExtrusoraB;
import br.com.painel.frames.status.L01ATBExtrusoraC;
import br.com.painel.frames.status.L01ATBExtrusoraD;
import br.com.painel.frames.status.L01ATBOverView;
import br.com.painel.frames.status.L09Alarmes;
import br.com.painel.frames.status.L09DDZ;
import br.com.painel.frames.status.L09OverView;
import br.com.painel.frames.status.L11Alarmes;
import br.com.painel.frames.status.L11Microondas;
import br.com.painel.frames.status.L11OverView;
import br.com.painel.framesGG.L01ATBOverViewGG;
import br.com.painel.framesGG.L09OverViewGG;
import br.com.painel.framesGG.L11OverViewGG;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author tiago.teixeira
 */
public class FrameUtil {

    /**
     * Abre um frame pelo nome do label.
     *
     * @param label
     */
    public static void openFrame(JLabel label) {
        switch (label.getName()) {
            case "jLabel69":
                openFrame(L01ATBExtrusoraA.class, null);
                break;
            case "jLabel68":
            case "jLabel70":
            case "jLabel71":
                openFrame(L01ATBExtrusoraB.class, null);
                break;
            case "jLabel73":
            case "jLabel74":
            case "jLabel75":
                openFrame(L01ATBExtrusoraC.class, null);
                break;
            case " jLabel72":
                openFrame(L01ATBExtrusoraD.class, null);
                break;
            case "jLabel76":
                openFrame(L11Microondas.class, null);
                break;
        }
    }

    public static void openFrame(JButton button) {
        Dimension dms = Utilidades.getResolutionScreen();
        switch (button.getActionCommand()) {
            case "jButton1":
                openFrame(isSmallScreen(dms) ? L01ATBOverView.class : L01ATBOverViewGG.class, dms);
                break;
            case "jButton2":
                openFrame(isSmallScreen(dms) ? L09OverView.class : L09OverViewGG.class, dms);
                break;
            case "jButton3":
                openFrame(isSmallScreen(dms) ? L11OverView.class : L11OverViewGG.class, dms);
                break;
            case "jButton4":
                openFrame(L11Alarmes.class, null);
                break;
            case "jButton5":
                openFrame(L09Alarmes.class, null);
                break;
            case "jButton6":
                openFrame(L09DDZ.class, null);
                break;
        }
    }

    public static void openFrame(Class classFrame, Dimension dimension) {
        try {
            initFrame((JFrame) classFrame.getConstructor().newInstance(), dimension);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static boolean isSmallScreen(Dimension dimensionScreen) {
        if ((dimensionScreen.width == 800 && dimensionScreen.height == 600)
                || (dimensionScreen.width == 1280 && dimensionScreen.height == 1024)) {
            return true;
        } else if (dimensionScreen.width == 1920 && dimensionScreen.height == 1080) {
            return false;
        }
        return false;
    }

    private static void initFrame(JFrame frame, Dimension dimension) {
        if (dimension != null) {
            frame.setSize(dimension);
        }
        frame.setVisible(true);
    }

    /**
     * Faz um get de dados dentro do formulário usando a anotação MapFrame.
     *
     * @param frame JFrame anotado com MapFrame
     * @param target Classe vinculada aos campos do frame
     */
    public static void get(JFrame frame, Object target) {
        try {
            Method[] methods = frame.getClass().getDeclaredMethods();
            for (Method mtFrame : methods) {
                if (mtFrame.isAnnotationPresent(MapFrame.class)) {
                    MapFrame map = mtFrame.getAnnotation(MapFrame.class);
                    if (map.target() == target.getClass()) {
                        if (!map.field().equals("")) {
                            Field field = target.getClass().getDeclaredField(map.field());
                            field.setAccessible(true);
                            field.set(target, getFromFrame(frame, mtFrame));
                        } else if (!map.set().equals("")) {
                            Method mtTarget = target.getClass().getDeclaredMethod(map.set(), map.type());
                            mtTarget.invoke(target, getFromFrame(frame, mtFrame));
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Faz um set de dados dentro da classe vinculada usando a anotação
     * MapFrame.
     *
     * @param frame JFrame anotado com MapFrame
     * @param target Classe vinculada aos campos do frame
     */
    public static void set(JFrame frame, Object target) {
        try {
            Method[] methods = frame.getClass().getDeclaredMethods();
            for (Method mtFrame : methods) {
                if (mtFrame.isAnnotationPresent(MapFrame.class)) {
                    MapFrame map = mtFrame.getAnnotation(MapFrame.class);
                    if (map.target() == target.getClass()) {
                        if (!map.field().equals("")) {
                            Field field = target.getClass().getDeclaredField(map.field());
                            field.setAccessible(true);
                            setFromFrame(frame, mtFrame, field.get(target));
                        } else if (!map.get().equals("")) {
                            Method mtTarget = target.getClass().getDeclaredMethod(map.get());
                            setFromFrame(frame, mtFrame, mtTarget.invoke(target));
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Pega o valor do metodo anotado no frame.
     *
     * @param frame
     * @param mtFrame
     * @return
     */
    private static Object getFromFrame(JFrame frame, Method mtFrame) {
        try {
            if (mtFrame.getReturnType() == JLabel.class) {
                return mtFrame.invoke(frame).getClass().getMethod("getText").invoke(mtFrame.invoke(frame));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Seta um valor no metodo anotado no frame.
     *
     * @param frame
     * @param mtFrame
     * @param value
     */
    private static void setFromFrame(JFrame frame, Method mtFrame, Object value) {
        try {
            if (mtFrame.getReturnType() == JLabel.class) {
                mtFrame.invoke(frame).getClass().getMethod("setText", String.class).invoke(mtFrame.invoke(frame), String.valueOf(value));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Muda o estado de visilização de um componente. Ex: if(true){ false;
     * }else{ true; }
     *
     * @param components JComponent[] Array de components
     */
    public static void toogleVisible(JComponent... components) {
        for (JComponent comp : components) {
            comp.setVisible(!comp.isVisible());
        }
    }

    public static void setNimbusLookAndFeel() {
        try {
            UIManager.setLookAndFeel(LOOKANDFEEL.NIMBUS.getValor());
            UIManager.put("nimbusBase", new Color(238, 232, 170));
            UIManager.put("nimbusBlueGrey", new Color(240, 255, 240));
            UIManager.put("control", new Color(220, 220, 220));
        } catch (Exception ex) {
        }
    }

}
