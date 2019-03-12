/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.listener;

import br.com.painel.framesGG.L11OverViewGG;
import br.com.painel.interfaces.ListenerAdapter;
import br.com.painel.services.Service_L11OverViewGG;
import br.com.painel.util.ControleThreads;

/**
 *
 * @author Tiago
 */
public final class Listener_L11OverViewGG extends ListenerAdapter<L11OverViewGG> {

    private final Service_L11OverViewGG service;

    public Listener_L11OverViewGG(L11OverViewGG form) {
        super(form);
        service = new Service_L11OverViewGG(form);
        initComponents();
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        ControleThreads.autoInitThread(service.iniciarPiscaAlerta(form.getPiscaAlertaLabels()));
        initMonitoramento();
    }

    @Override
    protected void attachListeners() {
        form.addWindowListener(service.getServiceStopControl());
    }

    private void initMonitoramento() {
        ControleThreads.autoInitThread(service.L11());
        ControleThreads.autoInitThread(service.L11_Alarmes());
        ControleThreads.autoInitThread(service.L11_Criticos());
    }

}
