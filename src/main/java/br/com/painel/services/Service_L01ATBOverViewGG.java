/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.services;

import br.com.painel.entities.L03;
import br.com.painel.entities.L03_Criticos;
import br.com.painel.framesGG.L01ATBOverViewGG;
import br.com.painel.interfaces.Service;
import br.com.painel.util.FrameUtil;
import br.com.painel.util.SQLUtil;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 * Classe de serviço do frame L01ATBOverViewGG
 *
 * @author tiago.teixeira
 */
public class Service_L01ATBOverViewGG extends Service<L01ATBOverViewGG> {

    public Service_L01ATBOverViewGG(L01ATBOverViewGG form) {
        super(form);
    }

    /**
     * Método que da start no processo de monitoramento das variáveis para L03.
     *
     * @return Thread com o processo de monitoramento
     */
    public synchronized Thread L03() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        L03 l03 = new L03();
                        l03.setValuesByResultSet(SQLUtil.getResultSet("L03"));
                        //l03.printValues();
                        setDados(form, l03);
                        toogleOnOffFields(form.getOnOffFields());
                        Thread.sleep(5000l);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * Método que da start no processo de monitoramento das variáveis para
     * L03_Critico.
     *
     * @return Thread com o processo de monitoramento
     */
    public synchronized Thread L03_Criticos() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        L03_Criticos l03_criticos = new L03_Criticos();
                        l03_criticos.setValuesByResultSet(SQLUtil.getResultSet("L03_Criticos"));
                        //l03_criticos.printValues();
                        setDados(form, l03_criticos);
                        Thread.sleep(1000l);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
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
                FrameUtil.openFrame(((JLabel) event.getSource()));
            }
        };
    }

}
