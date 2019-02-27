/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.util;

import br.com.painel.annotations.MapFrame;
import br.com.painel.status.L01ATBExtrusoraA;
import br.com.painel.status.L01ATBExtrusoraB;
import br.com.painel.status.L01ATBExtrusoraC;
import br.com.painel.status.L01ATBExtrusoraD;
import br.com.painel.status.L11Microondas;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author tiago.teixeira
 */
public class FrameUtil {

    /**
     * Abre um frame pelo nome.
     *
     * @param name
     */
    public static void openFrame(String name) {
        switch (name) {
            case "jLabel68":
                new L01ATBExtrusoraB().setVisible(true);
                break;
            case "jLabel69":
                new L01ATBExtrusoraA().setVisible(true);
                break;
            case "jLabel70":
                new L01ATBExtrusoraB().setVisible(true);
                break;
            case "jLabel71":
                new L01ATBExtrusoraB().setVisible(true);
                break;
            case " jLabel72":
                new L01ATBExtrusoraD().setVisible(true);
                break;
            case "jLabel73":
                new L01ATBExtrusoraC().setVisible(true);
                break;
            case "jLabel74":
                new L01ATBExtrusoraC().setVisible(true);
                break;
            case "jLabel75":
                new L01ATBExtrusoraC().setVisible(true);
                break;
            case "jLabel76":
                new L11Microondas().setVisible(true);
                break;
        }
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

}
