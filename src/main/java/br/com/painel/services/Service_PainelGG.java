/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.services;

import br.com.painel.entities.PainelPrincipal;
import br.com.painel.framesGG.PainelGG;
import br.com.painel.interfaces.Service;
import br.com.painel.util.SQLUtil;

/**
 * Classe de serviço para o frame PainelGG.
 *
 * @author Tiago
 */
public final class Service_PainelGG extends Service<PainelGG> {

    public Service_PainelGG(PainelGG form) {
        super(form);
    }

    /**
     * Inicial as labels de alarme como false
     */
    public void initLabelsFrame() {
        form.getJLabelList().forEach(lb -> lb.setVisible(false));
    }

    /**
     * Pilha de monitoramento do painel principal.
     *
     * @return Thread
     */
    public synchronized Thread painelPrincipal() {
        threads.add("painelPrincipal");
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        PainelPrincipal painelPrincipal = new PainelPrincipal();
                        painelPrincipal.setValuesByResultSet(SQLUtil.getResultSetPainelPrincipal());
                        setDados(form, painelPrincipal);
                        toogleOnOffFields(form.getOnOffFields());
                        alarmeVelocidade(painelPrincipal);
                        Thread.sleep(5000l);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }, "painelPrincipal");
    }

    /**
     * Inicia os labels do alarme de velocidade e o monitoramento dos valores.
     *
     * @param painelPrincipal PainelPrincipal objeto que representa o painel
     * principal
     */
    private void alarmeVelocidade(PainelPrincipal painelPrincipal) {
        form.getLabelVelocidadeAlarme()[0].setVisible(false);
        if (painelPrincipal.isAlarmeVelocidade()) {
            toogleAlarmeVelocidade(String.valueOf(painelPrincipal.getVelocidadeL11()));
        } else {
            toogleAlarmeVelocidade("0.0");
        }
    }

    /**
     * Inseri um valor no label para o usuário e alterna a visualização dos
     * labels de alarme.
     *
     * @param velocidade String com o valor da velocidade
     */
    private void toogleAlarmeVelocidade(String velocidade) {
        form.getLb11Velocidade().setText(String.valueOf(velocidade));
        toogleOnOffFields(form.getLabelVelocidadeAlarme());
    }

}
