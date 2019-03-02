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

    private float extarpm;
    private float extbrpm;
    private float extcrpm;
    private float extdrpm;
    private float extabar;
    private float extbbar;
    private float extcbar;
    private float extdbar;
    private float puller1velocidadeind;

    public L09_Criticos() {
        extarpm = 0f;
        extbrpm = 0f;
        extcrpm = 0f;
        extdrpm = 0f;
        extabar = 0f;
        extbbar = 0f;
        extcbar = 0f;
        extdbar = 0f;
        puller1velocidadeind = 0f;
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

    public float getExtarpm() {
        return extarpm;
    }

    public void setExtarpm(float extarpm) {
        this.extarpm = extarpm;
    }

    public float getExtbrpm() {
        return extbrpm;
    }

    public void setExtbrpm(float extbrpm) {
        this.extbrpm = extbrpm;
    }

    public float getExtcrpm() {
        return extcrpm;
    }

    public void setExtcrpm(float extcrpm) {
        this.extcrpm = extcrpm;
    }

    public float getExtdrpm() {
        return extdrpm;
    }

    public void setExtdrpm(float extdrpm) {
        this.extdrpm = extdrpm;
    }

    public float getExtabar() {
        return extabar;
    }

    public void setExtabar(float extabar) {
        this.extabar = extabar;
    }

    public float getExtbbar() {
        return extbbar;
    }

    public void setExtbbar(float extbbar) {
        this.extbbar = extbbar;
    }

    public float getExtcbar() {
        return extcbar;
    }

    public void setExtcbar(float extcbar) {
        this.extcbar = extcbar;
    }

    public float getExtdbar() {
        return extdbar;
    }

    public void setExtdbar(float extdbar) {
        this.extdbar = extdbar;
    }

    public float getPuller1velocidadeind() {
        return puller1velocidadeind;
    }

    public void setPuller1velocidadeind(float puller1velocidadeind) {
        this.puller1velocidadeind = puller1velocidadeind;
    }

}
