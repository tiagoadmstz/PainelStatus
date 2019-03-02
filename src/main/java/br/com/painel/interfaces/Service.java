/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.interfaces;

import br.com.painel.util.ControleThreads;
import br.com.painel.util.FrameUtil;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Tiago
 * @param <T>
 */
public abstract class Service<T> {

    protected final T form;
    protected final List<String> threads;

    public Service(T form) {
        this.form = form;
        threads = new ArrayList();
    }

    /**
     * Pega os valores do formulário e seta dentro de um objeto utilizando a
     * anotação MapFrame como referência.
     *
     * @param form L01ATBOverViewGG formulário
     * @param target L03 ou L03_Critico
     */
    protected void getDados(JFrame form, Object target) {
        FrameUtil.get(form, target);
    }

    /**
     * Pega os dados de um objeto e seta dentro dos campos do formulário
     * utilizando a anotação MapFrame como referência.
     *
     * @param form L01ATBOverViewGG formulário
     * @param target L03 ou L03_Critico
     */
    protected void setDados(JFrame form, Object target) {
        FrameUtil.set(form, target);
    }

    /**
     * Alterna a visibilidade de labels dentro do frame.
     *
     * @param labels JLabel[][] Array bidimensional de labels
     */
    protected void toogleOnOffFields(JLabel[][] labels) {
        for (JLabel[] lbs : labels) {
            lbs[lbs.length > 2 ? 1 : 0].setVisible(false);
            if (!lbs[0].getText().equals("0.0")) {
                toogleOnOffFields(lbs);
            } else {
                toogleOnOffFields(lbs);
            }
        }
    }

    /**
     * Método auxiliar do toogleOnOffFields.
     *
     * @param components JComponent[] Array de components
     */
    protected void toogleOnOffFields(JComponent[] components) {
        if (components.length > 2) {
            FrameUtil.toogleVisible(components[1], components[2]);
        } else {
            FrameUtil.toogleVisible(components);
        }
    }

    /**
     * Retorna um mouse listener de clique para JLabel que auxilia na abertura
     * de outros frames.
     *
     * @return MouseAdapter mouseClicked
     */
    public MouseAdapter getMouseListener() {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                FrameUtil.openFrame((JComponent) event.getSource(), (JFrame) form);
            }
        };
    }

    public WindowAdapter getServiceStopControl() {
        return new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                stopAllServices(getServicesNames());
            }
        };
    }

    private void stopAllServices(String... threadsNames) {
        for (String thread : threadsNames) {
            ControleThreads.removeThead(thread);
        }
    }

    private String[] getServicesNames() {
        return threads.toArray(new String[threads.size()]);
    }

}
