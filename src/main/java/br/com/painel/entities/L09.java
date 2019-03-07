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
public final class L09 extends SuperObject {

    private int micropctind;
    private int micropctset;
    private int microesqind;
    private int microesqset;
    private int microesteiraind;
    private int microesteiraset;
    private int microexaustorind;
    private int microexaustorset;
    private int microrefrigeradoind;
    private int microrefrigeradoset;
    private int vulc1queimadorind;
    private int vulc1queimadorset;
    private int vulc1queimador2ind;
    private int vulc1queimador2set;
    private int vulc1esteiraind;
    private int vulc1esteiraset;
    private int puller1velocidadeset;
    private int vulc2queimadorind;
    private int vulc2queimadorset;
    private int vulc2queimador2ind;
    private int vulc2queimador2set;
    private int vulc2esteiraind;
    private int vulc2esteiraset;
    private int banheira1reservatorioind;
    private int banheira1onof;
    private int banheira1bombatanqueonof;
    private int pullerinversoronof;
    private int pinturab1set;
    private int pintura1onof;
    private int pinturab2set;
    private int pintura2onof;
    private int pinturab3set;
    private int pintura3onof;
    private int pinturab4set;
    private int pintura4onof;
    private int iflampfrontal;
    private int iflampfonof;
    private int iflampcentral;
    private int iflampconof;
    private int iflamptraseira;
    private int iflamptonof;
    private double ifesteira2ind;
    private double ifesteira2set;
    private String perfil;
    private double ifesteiraind;
    private double ifesteiraset;

    public L09() {
        micropctind = 0;
        micropctset = 0;
        microesqind = 0;
        microesqset = 0;
        microesteiraind = 0;
        microesteiraset = 0;
        microexaustorind = 0;
        microexaustorset = 0;
        microrefrigeradoind = 0;
        microrefrigeradoset = 0;
        vulc1queimadorind = 0;
        vulc1queimadorset = 0;
        vulc1queimador2ind = 0;
        vulc1queimador2set = 0;
        vulc1esteiraind = 0;
        vulc1esteiraset = 0;
        puller1velocidadeset = 0;
        vulc2queimadorind = 0;
        vulc2queimadorset = 0;
        vulc2queimador2ind = 0;
        vulc2queimador2set = 0;
        vulc2esteiraind = 0;
        vulc2esteiraset = 0;
        banheira1reservatorioind = 0;
        banheira1onof = 0;
        banheira1bombatanqueonof = 0;
        pullerinversoronof = 0;
        pinturab1set = 0;
        pintura1onof = 0;
        pinturab2set = 0;
        pintura2onof = 0;
        pinturab3set = 0;
        pintura3onof = 0;
        pinturab4set = 0;
        pintura4onof = 0;
        iflampfrontal = 0;
        iflampfonof = 0;
        iflampcentral = 0;
        iflampconof = 0;
        iflamptraseira = 0;
        iflamptonof = 0;
        ifesteira2ind = 0d;
        ifesteira2set = 0d;
        perfil = "";
        ifesteiraind = 0d;
        ifesteiraset = 0d;
    }
    
    public String getPinturaB1() {
        return String.valueOf(pinturab1set * pintura1onof);
    }

    public String getPinturaB2() {
        return String.valueOf(pinturab2set * pintura2onof);
    }

    public String getPinturaB3() {
        return String.valueOf(pinturab3set * pintura3onof);
    }

    public String getPinturaB4() {
        return String.valueOf(pinturab4set * pintura4onof);
    }

    public String getIFLTraseira() {
        return String.valueOf(iflamptraseira * iflamptonof);
    }

    public String getIFLFrontal() {
        return String.valueOf(iflampfrontal * iflampfonof);
    }

    public String getIFLCentral() {
        return String.valueOf(iflampcentral * iflampconof);
    }

    public String getIFLEsteira() {
        return numberFormat(ifesteiraind);
    }

    public String getIFLEsteira2() {
        return numberFormat(ifesteira2ind);
    }

    public int getMicropctind() {
        return micropctind;
    }

    public void setMicropctind(int micropctind) {
        this.micropctind = micropctind;
    }

    public int getMicropctset() {
        return micropctset;
    }

    public void setMicropctset(int micropctset) {
        this.micropctset = micropctset;
    }

    public int getMicroesqind() {
        return microesqind;
    }

    public void setMicroesqind(int microesqind) {
        this.microesqind = microesqind;
    }

    public int getMicroesqset() {
        return microesqset;
    }

    public void setMicroesqset(int microesqset) {
        this.microesqset = microesqset;
    }

    public int getMicroesteiraind() {
        return microesteiraind;
    }

    public void setMicroesteiraind(int microesteiraind) {
        this.microesteiraind = microesteiraind;
    }

    public int getMicroesteiraset() {
        return microesteiraset;
    }

    public void setMicroesteiraset(int microesteiraset) {
        this.microesteiraset = microesteiraset;
    }

    public int getMicroexaustorind() {
        return microexaustorind;
    }

    public void setMicroexaustorind(int microexaustorind) {
        this.microexaustorind = microexaustorind;
    }

    public int getMicroexaustorset() {
        return microexaustorset;
    }

    public void setMicroexaustorset(int microexaustorset) {
        this.microexaustorset = microexaustorset;
    }

    public int getMicrorefrigeradoind() {
        return microrefrigeradoind;
    }

    public void setMicrorefrigeradoind(int microrefrigeradoind) {
        this.microrefrigeradoind = microrefrigeradoind;
    }

    public int getMicrorefrigeradoset() {
        return microrefrigeradoset;
    }

    public void setMicrorefrigeradoset(int microrefrigeradoset) {
        this.microrefrigeradoset = microrefrigeradoset;
    }

    public int getVulc1queimadorind() {
        return vulc1queimadorind;
    }

    public void setVulc1queimadorind(int vulc1queimadorind) {
        this.vulc1queimadorind = vulc1queimadorind;
    }

    public int getVulc1queimadorset() {
        return vulc1queimadorset;
    }

    public void setVulc1queimadorset(int vulc1queimadorset) {
        this.vulc1queimadorset = vulc1queimadorset;
    }

    public int getVulc1queimador2ind() {
        return vulc1queimador2ind;
    }

    public void setVulc1queimador2ind(int vulc1queimador2ind) {
        this.vulc1queimador2ind = vulc1queimador2ind;
    }

    public int getVulc1queimador2set() {
        return vulc1queimador2set;
    }

    public void setVulc1queimador2set(int vulc1queimador2set) {
        this.vulc1queimador2set = vulc1queimador2set;
    }

    public int getVulc1esteiraind() {
        return vulc1esteiraind;
    }

    public void setVulc1esteiraind(int vulc1esteiraind) {
        this.vulc1esteiraind = vulc1esteiraind;
    }

    public int getVulc1esteiraset() {
        return vulc1esteiraset;
    }

    public void setVulc1esteiraset(int vulc1esteiraset) {
        this.vulc1esteiraset = vulc1esteiraset;
    }

    public int getPuller1velocidadeset() {
        return puller1velocidadeset;
    }

    public void setPuller1velocidadeset(int puller1velocidadeset) {
        this.puller1velocidadeset = puller1velocidadeset;
    }

    public int getVulc2queimadorind() {
        return vulc2queimadorind;
    }

    public void setVulc2queimadorind(int vulc2queimadorind) {
        this.vulc2queimadorind = vulc2queimadorind;
    }

    public int getVulc2queimadorset() {
        return vulc2queimadorset;
    }

    public void setVulc2queimadorset(int vulc2queimadorset) {
        this.vulc2queimadorset = vulc2queimadorset;
    }

    public int getVulc2queimador2ind() {
        return vulc2queimador2ind;
    }

    public void setVulc2queimador2ind(int vulc2queimador2ind) {
        this.vulc2queimador2ind = vulc2queimador2ind;
    }

    public int getVulc2queimador2set() {
        return vulc2queimador2set;
    }

    public void setVulc2queimador2set(int vulc2queimador2set) {
        this.vulc2queimador2set = vulc2queimador2set;
    }

    public int getVulc2esteiraind() {
        return vulc2esteiraind;
    }

    public void setVulc2esteiraind(int vulc2esteiraind) {
        this.vulc2esteiraind = vulc2esteiraind;
    }

    public int getVulc2esteiraset() {
        return vulc2esteiraset;
    }

    public void setVulc2esteiraset(int vulc2esteiraset) {
        this.vulc2esteiraset = vulc2esteiraset;
    }

    public int getBanheira1reservatorioind() {
        return banheira1reservatorioind;
    }

    public void setBanheira1reservatorioind(int banheira1reservatorioind) {
        this.banheira1reservatorioind = banheira1reservatorioind;
    }

    public int getBanheira1onof() {
        return banheira1onof;
    }

    public void setBanheira1onof(int banheira1onof) {
        this.banheira1onof = banheira1onof;
    }

    public int getBanheira1bombatanqueonof() {
        return banheira1bombatanqueonof;
    }

    public void setBanheira1bombatanqueonof(int banheira1bombatanqueonof) {
        this.banheira1bombatanqueonof = banheira1bombatanqueonof;
    }

    public int getPullerinversoronof() {
        return pullerinversoronof;
    }

    public void setPullerinversoronof(int pullerinversoronof) {
        this.pullerinversoronof = pullerinversoronof;
    }

    public int getPinturab1set() {
        return pinturab1set;
    }

    public void setPinturab1set(int pinturab1set) {
        this.pinturab1set = pinturab1set;
    }

    public int getPintura1onof() {
        return pintura1onof;
    }

    public void setPintura1onof(int pintura1onof) {
        this.pintura1onof = pintura1onof;
    }

    public int getPinturab2set() {
        return pinturab2set;
    }

    public void setPinturab2set(int pinturab2set) {
        this.pinturab2set = pinturab2set;
    }

    public int getPintura2onof() {
        return pintura2onof;
    }

    public void setPintura2onof(int pintura2onof) {
        this.pintura2onof = pintura2onof;
    }

    public int getPinturab3set() {
        return pinturab3set;
    }

    public void setPinturab3set(int pinturab3set) {
        this.pinturab3set = pinturab3set;
    }

    public int getPintura3onof() {
        return pintura3onof;
    }

    public void setPintura3onof(int pintura3onof) {
        this.pintura3onof = pintura3onof;
    }

    public int getPinturab4set() {
        return pinturab4set;
    }

    public void setPinturab4set(int pinturab4set) {
        this.pinturab4set = pinturab4set;
    }

    public int getPintura4onof() {
        return pintura4onof;
    }

    public void setPintura4onof(int pintura4onof) {
        this.pintura4onof = pintura4onof;
    }

    public int getIflampfrontal() {
        return iflampfrontal;
    }

    public void setIflampfrontal(int iflampfrontal) {
        this.iflampfrontal = iflampfrontal;
    }

    public int getIflampfonof() {
        return iflampfonof;
    }

    public void setIflampfonof(int iflampfonof) {
        this.iflampfonof = iflampfonof;
    }

    public int getIflampcentral() {
        return iflampcentral;
    }

    public void setIflampcentral(int iflampcentral) {
        this.iflampcentral = iflampcentral;
    }

    public int getIflampconof() {
        return iflampconof;
    }

    public void setIflampconof(int iflampconof) {
        this.iflampconof = iflampconof;
    }

    public int getIflamptraseira() {
        return iflamptraseira;
    }

    public void setIflamptraseira(int iflamptraseira) {
        this.iflamptraseira = iflamptraseira;
    }

    public int getIflamptonof() {
        return iflamptonof;
    }

    public void setIflamptonof(int iflamptonof) {
        this.iflamptonof = iflamptonof;
    }

    public double getIfesteira2ind() {
        return ifesteira2ind;
    }

    public void setIfesteira2ind(double ifesteira2ind) {
        this.ifesteira2ind = ifesteira2ind;
    }

    public double getIfesteira2set() {
        return ifesteira2set;
    }

    public void setIfesteira2set(double ifesteira2set) {
        this.ifesteira2set = ifesteira2set;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public double getIfesteiraind() {
        return ifesteiraind;
    }

    public void setIfesteiraind(double ifesteiraind) {
        this.ifesteiraind = ifesteiraind;
    }

    public double getIfesteiraset() {
        return ifesteiraset;
    }

    public void setIfesteiraset(double ifesteiraset) {
        this.ifesteiraset = ifesteiraset;
    }

}
