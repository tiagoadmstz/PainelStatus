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
public class PainelPrincipal extends SuperObject {

    //L09
    private float valueL09;
    private String inicioprodL09;
    private String perfilL09;
    private Float pecatotalL09;
    //L09_Doc
    private float scraptotalL09Doc;
    private float porcscarpL09Doc;
    //L03
    private float valueL03;
    private String perfilL03;
    private float pecatotalL03;
    //L03_Doc
    private String valueL03Doc;
    private float scraptotalL03Doc;
    private float porcscarpL03Doc;
    //L11
    private float valueL11;
    private float value2L11;
    private float value3L11;
    private float value4L11;
    private String perfilL11;
    private float velocidadeL11;
    private float totalproduzidoL11;

    public PainelPrincipal() {
        valueL09 = 0f;
        inicioprodL09 = "";
        perfilL09 = "";
        pecatotalL09 = 0f;
        scraptotalL09Doc = 0f;
        porcscarpL09Doc = 0f;
        valueL03 = 0f;
        perfilL03 = "";
        pecatotalL03 = 0f;
        valueL03Doc = "";
        scraptotalL03Doc = 0f;
        porcscarpL03Doc = 0f;
        valueL11 = 0f;
        value2L11 = 0f;
        value3L11 = 0f;
        value4L11 = 0f;
        perfilL11 = "";
        velocidadeL11 = 0f;
        totalproduzidoL11 = 0f;
    }

    public float getValueL09() {
        return valueL09;
    }

    public void setValueL09(float valueL09) {
        this.valueL09 = valueL09;
    }

    public String getInicioprodL09() {
        return inicioprodL09;
    }

    public void setInicioprodL09(String inicioprodL09) {
        this.inicioprodL09 = inicioprodL09;
    }

    public String getPerfilL09() {
        return perfilL09;
    }

    public void setPerfilL09(String perfilL09) {
        this.perfilL09 = perfilL09;
    }

    public Float getPecatotalL09() {
        return pecatotalL09;
    }

    public void setPecatotalL09(Float pecatotalL09) {
        this.pecatotalL09 = pecatotalL09;
    }

    public float getScraptotalL09Doc() {
        return scraptotalL09Doc;
    }

    public void setScraptotalL09Doc(float scraptotalL09Doc) {
        this.scraptotalL09Doc = scraptotalL09Doc;
    }

    public float getPorcscarpL09Doc() {
        return porcscarpL09Doc;
    }

    public String getPorcscarpL09DocStr() {
        return String.format("%.1f", porcscarpL09Doc) + "%";
    }

    public void setPorcscarpL09Doc(float porcscarpL09Doc) {
        this.porcscarpL09Doc = porcscarpL09Doc;
    }

    public float getValueL03() {
        return valueL03;
    }

    public void setValueL03(float valueL03) {
        this.valueL03 = valueL03;
    }

    public String getPerfilL03() {
        return perfilL03;
    }

    public void setPerfilL03(String perfilL03) {
        this.perfilL03 = perfilL03;
    }

    public float getPecatotalL03() {
        return pecatotalL03;
    }

    public void setPecatotalL03(float pecatotalL03) {
        this.pecatotalL03 = pecatotalL03;
    }

    public String getValueL03Doc() {
        return valueL03Doc;
    }

    public void setValueL03Doc(String valueL03Doc) {
        this.valueL03Doc = valueL03Doc;
    }

    public float getScraptotalL03Doc() {
        return scraptotalL03Doc;
    }

    public void setScraptotalL03Doc(float scraptotalL03Doc) {
        this.scraptotalL03Doc = scraptotalL03Doc;
    }

    public float getPorcscarpL03Doc() {
        return porcscarpL03Doc;
    }

    public String getPorcscarpL03DocStr() {
        return String.format("%.1f", porcscarpL03Doc) + "%";
    }

    public void setPorcscarpL03Doc(float porcscarpL03Doc) {
        this.porcscarpL03Doc = porcscarpL03Doc;
    }

    public float getValueL11() {
        return valueL11;
    }

    public void setValueL11(float valueL11) {
        this.valueL11 = valueL11;
    }

    public float getValue2L11() {
        return value2L11;
    }

    public void setValue2L11(float value2L11) {
        this.value2L11 = value2L11;
    }

    public float getValue3L11() {
        return value3L11;
    }

    public void setValue3L11(float value3L11) {
        this.value3L11 = value3L11;
    }

    public float getValue4L11() {
        return value4L11;
    }

    public void setValue4L11(float value4L11) {
        this.value4L11 = value4L11;
    }

    public String getPerfilL11() {
        return perfilL11;
    }

    public void setPerfilL11(String perfilL11) {
        this.perfilL11 = perfilL11;
    }

    public float getVelocidadeL11() {
        return velocidadeL11;
    }

    public void setVelocidadeL11(float velocidadeL11) {
        this.velocidadeL11 = velocidadeL11;
    }

    public float getTotalproduzidoL11() {
        return totalproduzidoL11;
    }

    public void setTotalproduzidoL11(float totalproduzidoL11) {
        this.totalproduzidoL11 = totalproduzidoL11;
    }

    public boolean isAlarmeVelecidade() {
        return valueL11 > 10 || value2L11 > 10 || value3L11 > 10 || value4L11 > 10;
    }

}
