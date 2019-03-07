/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.entities;

import br.com.painel.interfaces.SuperObject;

/**
 *
 * @author Tiago
 */
public class L09_Criticos extends SuperObject {

    private double extarpm;
    private double extbrpm;
    private double extcrpm;
    private double extdrpm;
    private double extabar;
    private double extbbar;
    private double extcbar;
    private double extdbar;
    private double puller1velocidadeind;

    public L09_Criticos() {
        extarpm = 0d;
        extbrpm = 0d;
        extcrpm = 0d;
        extdrpm = 0d;
        extabar = 0d;
        extbbar = 0d;
        extcbar = 0d;
        extdbar = 0d;
        puller1velocidadeind = 0d;
    }

    public String getExtarpmStr() {
        return numberFormat(extarpm);
    }

    public String getExtbrpmStr() {
        return numberFormat(extbrpm);
    }

    public String getExtcrpmStr() {
        return numberFormat(extcrpm);
    }

    public String getExtdrpmStr() {
        return numberFormat(extdrpm);
    }

    public double getExtarpm() {
        return extarpm;
    }

    public void setExtarpm(double extarpm) {
        this.extarpm = extarpm;
    }

    public double getExtbrpm() {
        return extbrpm;
    }

    public void setExtbrpm(double extbrpm) {
        this.extbrpm = extbrpm;
    }

    public double getExtcrpm() {
        return extcrpm;
    }

    public void setExtcrpm(double extcrpm) {
        this.extcrpm = extcrpm;
    }

    public double getExtdrpm() {
        return extdrpm;
    }

    public void setExtdrpm(double extdrpm) {
        this.extdrpm = extdrpm;
    }

    public double getExtabar() {
        return extabar;
    }

    public void setExtabar(double extabar) {
        this.extabar = extabar;
    }

    public double getExtbbar() {
        return extbbar;
    }

    public void setExtbbar(double extbbar) {
        this.extbbar = extbbar;
    }

    public double getExtcbar() {
        return extcbar;
    }

    public void setExtcbar(double extcbar) {
        this.extcbar = extcbar;
    }

    public double getExtdbar() {
        return extdbar;
    }

    public void setExtdbar(double extdbar) {
        this.extdbar = extdbar;
    }

    public double getPuller1velocidadeind() {
        return puller1velocidadeind;
    }

    public void setPuller1velocidadeind(double puller1velocidadeind) {
        this.puller1velocidadeind = puller1velocidadeind;
    }

}
