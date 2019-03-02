/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.services;

import br.com.painel.entities.L09;
import br.com.painel.entities.L09_Criticos;
import br.com.painel.framesGG.L09OverViewGG;
import br.com.painel.interfaces.Service;
import br.com.painel.util.SQLUtil;

/**
 * Classe de serviço para o frame L09OverViewGG.
 *
 * @author Tiago
 */
public final class Service_L09OverViewGG extends Service<L09OverViewGG> {

    public Service_L09OverViewGG(L09OverViewGG form) {
        super(form);
    }

    public Thread L09() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    L09 l09 = new L09();
                    l09.setValuesByResultSet(SQLUtil.getResultSet(SQLUtil.L09));
                    //l09.printValues();
                    setDados(form, l09);
                    toogleOnOffFields(form.getOnOffFields());
                    Thread.sleep(1000l);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public Thread L09_Criticos() {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    L09_Criticos l09Criticos = new L09_Criticos();
                    l09Criticos.setValuesByResultSet(SQLUtil.getResultSet(SQLUtil.L09_CRITICOS));
                    //l09Criticos.printValues();
                    setDados(form, l09Criticos);
                    Thread.sleep(1000l);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

}
