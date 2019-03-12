/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.listener;

import br.com.painel.framesGG.L09OverViewGG;
import br.com.painel.interfaces.ListenerAdapter;
import br.com.painel.services.Service_L09OverViewGG;
import br.com.painel.util.ControleThreads;

/**
 *
 * @author Tiago
 */
public final class Listener_L09OverViewGG extends ListenerAdapter<L09OverViewGG> {

    private final Service_L09OverViewGG service;

    public Listener_L09OverViewGG(L09OverViewGG form) {
        super(form);
        service = new Service_L09OverViewGG(form);
        initComponents();
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        initMonitoramento();
    }

    @Override
    protected void attachListeners() {
        form.getJLabelList().forEach(lb -> lb.addMouseListener(service.getMouseListener()));
        form.addWindowListener(service.getServiceStopControl());
    }

    private void initMonitoramento() {
        ControleThreads.autoInitThread(service.L09());
        ControleThreads.autoInitThread(service.L09_Criticos());
    }

}
