/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.services;

import br.com.painel.entities.L11;
import br.com.painel.entities.L11_Alarmes;
import br.com.painel.entities.L11_Criticos;
import br.com.painel.framesGG.L11OverViewGG;
import br.com.painel.interfaces.Service;
import br.com.painel.util.FrameUtil;
import br.com.painel.util.SQLUtil;
import javax.swing.JLabel;

/**
 *
 * @author Tiago
 */
public class Service_L11OverViewGG extends Service<L11OverViewGG> {

    public Service_L11OverViewGG(L11OverViewGG form) {
        super(form);
    }

    public Thread L11() {
        threads.add("L11");
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    L11 l11 = new L11();
                    l11.setValuesByResultSet(SQLUtil.getResultSet(SQLUtil.L11));
                    //l11.printValues();
                    setDados(form, l11);
                    toogleOnOffFields(form.getOnOffFields());
                    Thread.sleep(5000l);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }, "L11");
    }

    public Thread L11_Criticos() {
        threads.add("L11_Criticos");
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    L11_Criticos l11Criticos = new L11_Criticos();
                    l11Criticos.setValuesByResultSet(SQLUtil.getResultSet(SQLUtil.L11_CRITICOS));
                    //l11.printValues();
                    setDados(form, l11Criticos);
                    Thread.sleep(5000l);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }, "L11_Criticos");
    }

    public Thread L11_Alarmes() {
        threads.add("L11_Alarmes");
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    L11_Alarmes l11Alertas = new L11_Alarmes();
                    l11Alertas.setValuesByResultSet(SQLUtil.getResultSet(SQLUtil.L11_ALARMES));
                    //l11.printValues();
                    setDados(form, l11Alertas);
                    Thread.sleep(5000l);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }, "L11_Alarmes");
    }

    public Thread iniciarPiscaAlerta(JLabel[] labels) {
        threads.add("piscaAlerta");
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        for (JLabel label : labels) {
                            if (!label.getText().equals("0")) {
                                FrameUtil.toogleVisible(label);
                            } else if (label.getText().equals("0")) {
                                label.setVisible(false);
                            }
                        }
                        Thread.sleep(700l);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }, "piscaAlerta");
    }

}
