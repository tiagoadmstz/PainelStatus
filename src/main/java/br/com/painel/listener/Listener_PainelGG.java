/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.listener;

import br.com.painel.framesGG.PainelGG;
import br.com.painel.interfaces.ListenerAdapter;
import br.com.painel.services.Service_PainelGG;
import br.com.painel.util.ControleThreads;
import br.com.painel.util.FrameUtil;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Tiago
 */
public final class Listener_PainelGG extends ListenerAdapter<PainelGG> {

    private final Service_PainelGG service;

    public Listener_PainelGG(PainelGG form) {
        super(form);
        service = new Service_PainelGG(form);
        initComponents();
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        service.initLabelsFrame();
        iniciarMonitoramento();
    }

    @Override
    protected void attachListeners() {
        form.getJButtonList().forEach(bt -> bt.addActionListener(this));
        form.addWindowListener(service.getServiceStopControl());
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        FrameUtil.openFrame((JButton) event.getSource(), (JFrame) form);
    }

    private void iniciarMonitoramento() {
        ControleThreads.autoInitThread(service.painelPrincipal());
    }

}
