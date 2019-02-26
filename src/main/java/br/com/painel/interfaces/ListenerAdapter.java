/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tiago.teixeira
 * @param <T>
 */
public abstract class ListenerAdapter<T> implements ActionListener {

    protected final T form;

    public ListenerAdapter(T form) {
        this.form = form;
    }

    protected void initComponents() {
        attachListeners();
    }

    protected abstract void attachListeners();

    @Override
    public void actionPerformed(ActionEvent event) {

    }

}
