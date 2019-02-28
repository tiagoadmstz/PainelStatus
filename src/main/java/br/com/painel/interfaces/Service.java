/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.interfaces;

import br.com.painel.util.FrameUtil;
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

    public Service(T form) {
        this.form = form;
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

}
