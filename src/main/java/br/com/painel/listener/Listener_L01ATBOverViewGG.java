/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.listener;

import br.com.painel.framesGG.L01ATBOverViewGG;
import br.com.painel.interfaces.ListenerAdapter;
import br.com.painel.services.Service_L01ATBOverViewGG;

/**
 *
 * @author tiago.teixeira
 */
public class Listener_L01ATBOverViewGG extends ListenerAdapter<L01ATBOverViewGG> {

    private final Service_L01ATBOverViewGG service;

    public Listener_L01ATBOverViewGG(L01ATBOverViewGG form) {
        super(form);
        service = new Service_L01ATBOverViewGG(form);
        initComponents();
    }

    @Override
    protected void attachListeners() {
        form.getLabelList().forEach(lb -> lb.addMouseListener(service.getMouseListener()));
        iniciarMonitoramento();
    }

    private void iniciarMonitoramento() {
        service.L03().start();
        service.L03_Criticos().start();
    }

}
