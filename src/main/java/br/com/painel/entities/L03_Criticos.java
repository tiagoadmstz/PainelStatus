/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.painel.entities;

import br.com.painel.interfaces.SuperObject;
import java.io.Serializable;

/**
 *
 * @author tiago.teixeira
 */
public class L03_Criticos extends SuperObject implements Serializable {

    private static final long serialVersionUID = 7545464022843176411L;
    private Double extarpm;
    private Double extbrpm;
    private Double extcrpm;
    private Double extdrpm;
    private Double extabar;
    private Double extbbar;
    private Double extcbar;
    private Double extdbar;
    private Double puller1velocidadeind;
    private Double puller2velocidadeind;
    private Double puller3velocidadeind;

    public L03_Criticos() {
        extarpm = 0d;
        extbrpm = 0d;
        extcrpm = 0d;
        extdrpm = 0d;
        extabar = 0d;
        extbbar = 0d;
        extcbar = 0d;
        extdbar = 0d;
        puller1velocidadeind = 0d;
        puller2velocidadeind = 0d;
        puller3velocidadeind = 0d;
    }

    public Double getExtarpm() {
        return extarpm;
    }

    public String getExtarpmStr() {
        return formatDouble(extarpm);
    }

    public void setExtarpm(Double extarpm) {
        this.extarpm = extarpm;
    }

    public Double getExtbrpm() {
        return extbrpm;
    }

    public String getExtbrpmStr() {
        return formatDouble(extbrpm);
    }

    public void setExtbrpm(Double extbrpm) {
        this.extbrpm = extbrpm;
    }

    public Double getExtcrpm() {
        return extcrpm;
    }

    public String getExtcrpmStr() {
        return formatDouble(extcrpm);
    }

    public void setExtcrpm(Double extcrpm) {
        this.extcrpm = extcrpm;
    }

    public Double getExtdrpm() {
        return extdrpm;
    }

    public String getExtdrpmStr() {
        return formatDouble(extdrpm);
    }

    public void setExtdrpm(Double extdrpm) {
        this.extdrpm = extdrpm;
    }

    public Double getExtabar() {
        return extabar;
    }

    public void setExtabar(Double extabar) {
        this.extabar = extabar;
    }

    public Double getExtbbar() {
        return extbbar;
    }

    public void setExtbbar(Double extbbar) {
        this.extbbar = extbbar;
    }

    public Double getExtcbar() {
        return extcbar;
    }

    public void setExtcbar(Double extcbar) {
        this.extcbar = extcbar;
    }

    public Double getExtdbar() {
        return extdbar;
    }

    public void setExtdbar(Double extdbar) {
        this.extdbar = extdbar;
    }

    public Double getPuller1velocidadeind() {
        return puller1velocidadeind;
    }

    public void setPuller1velocidadeind(Double puller1velocidadeind) {
        this.puller1velocidadeind = puller1velocidadeind;
    }

    public Double getPuller2velocidadeind() {
        return puller2velocidadeind;
    }

    public void setPuller2velocidadeind(Double puller2velocidadeind) {
        this.puller2velocidadeind = puller2velocidadeind;
    }

    public Double getPuller3velocidadeind() {
        return puller3velocidadeind;
    }

    public void setPuller3velocidadeind(Double puller3velocidadeind) {
        this.puller3velocidadeind = puller3velocidadeind;
    }

    private String formatDouble(Double valor) {
        return String.format("%1$,.1f", valor);
    }

}
